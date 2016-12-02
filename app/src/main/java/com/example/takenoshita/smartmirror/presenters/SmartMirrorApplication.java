package com.example.takenoshita.smartmirror.presenters;

import android.app.Application;
import android.util.Log;

import com.example.takenoshita.smartmirror.presenters.di.components.ApplicationComponent;
import com.example.takenoshita.smartmirror.presenters.di.components.DaggerApplicationComponent;
import com.example.takenoshita.smartmirror.presenters.di.modules.ApplicationModule;

public class SmartMirrorApplication extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("test", "test");
        initializeComponent();
    }

    private void initializeComponent() {
        this.component = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public void setApplicationComponent(ApplicationComponent component) {
        this.component = component;
    }

    public ApplicationComponent getApplicationComponent() {
        return this.component;
    }
}
