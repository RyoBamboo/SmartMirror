package com.example.takenoshita.smartmirror.presenters.di.components;

import com.example.takenoshita.smartmirror.presenters.activities.CameraActivity;
import com.example.takenoshita.smartmirror.presenters.di.PerActivity;
import com.example.takenoshita.smartmirror.presenters.di.modules.CameraActivityModule;
import com.example.takenoshita.smartmirror.presenters.fragments.CameraActivityFragment;

import dagger.Subcomponent;

@Subcomponent(modules = CameraActivityModule.class)
@PerActivity
public interface CameraActivityComponent {

    void inject(CameraActivityFragment cameraActivityFragment);

}
