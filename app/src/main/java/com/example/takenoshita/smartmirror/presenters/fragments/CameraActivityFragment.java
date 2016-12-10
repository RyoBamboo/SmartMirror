package com.example.takenoshita.smartmirror.presenters.fragments;

import android.hardware.Camera;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;

import com.example.takenoshita.smartmirror.R;
import com.example.takenoshita.smartmirror.domain.usecases.CameraUseCase;
import com.example.takenoshita.smartmirror.presenters.di.components.CameraActivityComponent;
import com.example.takenoshita.smartmirror.presenters.di.components.MainActivityComponent;

import javax.inject.Inject;

public class CameraActivityFragment extends BaseFragment {

    @Inject
    protected CameraUseCase cameraUseCase;

    /*--------------------------------------------
    * メンバー変数
    *------------------------------------------*/
    private Camera camera;  // カメラインスタンス

    public CameraActivityFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        getActivityComponent(CameraActivityComponent.class).inject(this);

        View rootView =  inflater.inflate(R.layout.fragment_camera, container, false);

        // SurfaceViewの取得
        SurfaceView surfaceView = (SurfaceView) rootView.findViewById(R.id.surface_view);

        // SurfaceHolderの設定
        SurfaceHolder holder = surfaceView.getHolder();
        holder.addCallback(surfaceListener);

       return rootView;
    }


    /*-------------------------------------------------------
    * Surfaceリスナー
    *------------------------------------------------------*/
    private SurfaceHolder.Callback surfaceListener = new SurfaceHolder.Callback() {

        // Surface作成
        public void surfaceCreated(SurfaceHolder holder) {
            camera = Camera.open(1); // 0で背面カメラ、1で前面カメラ
            try {
                camera.setPreviewDisplay(holder);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Surface破棄時
        public void surfaceDestroyed(SurfaceHolder holder) {
            camera.release();
            camera = null;
        }

        // Surface変更時
        public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
            Camera.Parameters parameters = camera.getParameters();
            parameters.setPreviewSize(640, 480);
            camera.setParameters(parameters);

            setCameraDisplayOrientation(1, camera);

            camera.startPreview();
        }


        public void setCameraDisplayOrientation(int cameraId, Camera camera) {

            // カメラ情報の取得
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(cameraId, cameraInfo);

            // ディスプレイの向きを取得
            int rotation = getActivity().getWindowManager().getDefaultDisplay().getRotation();
            int degrees = 0;
            switch (rotation) {
                case Surface.ROTATION_0: degrees = 0; break;
                case Surface.ROTATION_90: degrees = 90; break;
                case Surface.ROTATION_180: degrees = 180; break;
                case Surface.ROTATION_270: degrees = 270; break;
            }

            int result;
            result = (cameraInfo.orientation + degrees) % 360;
            result = (360 - result) % 360;

            camera.setDisplayOrientation(result);
        }


    };

}
