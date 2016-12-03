package com.example.takenoshita.smartmirror.presenters.di.components;

import com.example.takenoshita.smartmirror.MainActivity;
import com.example.takenoshita.smartmirror.presenters.di.PerActivity;
import com.example.takenoshita.smartmirror.presenters.di.modules.MainActivityModule;
import com.example.takenoshita.smartmirror.presenters.fragments.MainActivityFragment;

import dagger.Subcomponent;

@Subcomponent(modules = MainActivityModule.class)
@PerActivity
public interface MainActivityComponent {

    void inject(MainActivityFragment mainActivityFragment);

}
