package com.example.takenoshita.smartmirror.presenters.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.takenoshita.smartmirror.R;
import com.example.takenoshita.smartmirror.domain.usecases.CameraUseCase;
import com.example.takenoshita.smartmirror.presenters.di.components.MainActivityComponent;

import javax.inject.Inject;

public class CameraFragment extends BaseFragment {

    @Inject
    protected CameraUseCase cameraUseCase;

    public CameraFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //getActivityComponent(MainActivityComponent.class).inject(this);

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_camera, container, false);
    }

}
