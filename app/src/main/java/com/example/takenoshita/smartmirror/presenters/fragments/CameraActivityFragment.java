package com.example.takenoshita.smartmirror.presenters.fragments;

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
        cameraUseCase.printStr();

        View rootView =  inflater.inflate(R.layout.fragment_camera, container, false);

        // SurfaceViewの取得
        SurfaceView surfaceView = (SurfaceView) rootView.findViewById(R.id.surface_view);

        // SurfaceHolderの設定
        SurfaceHolder holder = surfaceView.getHolder();

       return rootView;
    }

}
