package com.example.takenoshita.smartmirror.presenters.activities;

import android.app.FragmentTransaction;
import android.os.Bundle;

import com.example.takenoshita.smartmirror.R;
import com.example.takenoshita.smartmirror.presenters.di.components.CameraActivityComponent;
import com.example.takenoshita.smartmirror.presenters.fragments.CameraActivityFragment;

public class CameraActivity extends BaseActivity implements ComponentHoldable<CameraActivityComponent> {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        CameraActivityFragment fragment = new CameraActivityFragment();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(R.id.camera_container, fragment);
        transaction.commit();
    }

    @Override
    public CameraActivityComponent getComponent() {
        return getBaseActivityComponent().cameraActivityComponent();
    }

}
