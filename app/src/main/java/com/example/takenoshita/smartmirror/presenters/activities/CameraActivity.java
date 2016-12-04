package com.example.takenoshita.smartmirror.presenters.activities;

import android.app.FragmentTransaction;
import android.os.Bundle;

import com.example.takenoshita.smartmirror.R;
import com.example.takenoshita.smartmirror.presenters.fragments.CameraFragment;

public class CameraActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        CameraFragment fragment = new CameraFragment();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(R.id.camera_container, fragment);
        transaction.commit();
    }

}
