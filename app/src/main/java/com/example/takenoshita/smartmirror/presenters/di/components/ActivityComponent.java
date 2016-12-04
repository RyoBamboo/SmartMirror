package com.example.takenoshita.smartmirror.presenters.di.components;


import com.example.takenoshita.smartmirror.MainActivity;
import com.example.takenoshita.smartmirror.presenters.di.PerActivity;
import com.example.takenoshita.smartmirror.presenters.di.modules.ActivityModule;

import dagger.Subcomponent;

@Subcomponent(modules = ActivityModule.class)
@PerActivity
public interface ActivityComponent {

    MainActivityComponent mainActivityComponent();

    CameraActivityComponent cameraActivityComponent();

}
