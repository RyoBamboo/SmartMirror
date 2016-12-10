package com.example.takenoshita.smartmirror.presenters.di.modules;


import com.example.takenoshita.smartmirror.domain.repositories.CameraRepository;
import com.example.takenoshita.smartmirror.domain.usecases.CameraUseCase;
import com.example.takenoshita.smartmirror.domain.usecases.impl.CameraUseCaseImpl;

import dagger.Module;
import dagger.Provides;

@Module
public class CameraActivityModule {

    @Provides
    public CameraUseCase provideCameraUseCase(CameraRepository repository) {
        return new CameraUseCaseImpl(repository);
    }
}
