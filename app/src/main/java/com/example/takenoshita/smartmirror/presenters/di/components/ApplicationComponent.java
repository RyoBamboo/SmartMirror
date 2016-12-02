package com.example.takenoshita.smartmirror.presenters.di.components;

import android.content.Context;

import com.example.takenoshita.smartmirror.domain.repositories.CameraRepository;
import com.example.takenoshita.smartmirror.presenters.di.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = ApplicationModule.class)
@Singleton
public interface ApplicationComponent {

    ActivityComponent activityComponent();

    Context context();

    CameraRepository cameraRepository();
}
