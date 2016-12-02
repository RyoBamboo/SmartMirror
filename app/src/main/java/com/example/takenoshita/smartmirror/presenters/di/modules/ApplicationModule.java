package com.example.takenoshita.smartmirror.presenters.di.modules;

import android.app.Application;
import android.content.Context;
import android.graphics.Camera;

import com.example.takenoshita.smartmirror.data.repositories.CameraRepositoryImpl;
import com.example.takenoshita.smartmirror.domain.repositories.CameraRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    public Context provideContext() {
        return this.application;
    }

    @Provides
    @Singleton
    public CameraRepository provideCameraRepository() {
        return new CameraRepositoryImpl();
    }
}
