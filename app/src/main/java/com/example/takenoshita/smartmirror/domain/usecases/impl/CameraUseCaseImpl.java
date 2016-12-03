package com.example.takenoshita.smartmirror.domain.usecases.impl;

import android.util.Log;

import com.example.takenoshita.smartmirror.domain.repositories.CameraRepository;
import com.example.takenoshita.smartmirror.domain.usecases.CameraUseCase;

import javax.inject.Inject;

public class CameraUseCaseImpl implements CameraUseCase{

    private CameraRepository repository;

    @Inject
    public CameraUseCaseImpl(CameraRepository repository) {
        this.repository = repository;
    }

    @Override
    public void printStr() {
        Log.d("OK", "OK");
    }
}
