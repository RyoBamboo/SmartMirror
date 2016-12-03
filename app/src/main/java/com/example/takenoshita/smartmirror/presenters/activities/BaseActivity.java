package com.example.takenoshita.smartmirror.presenters.activities;

import android.support.v7.app.AppCompatActivity;

import com.example.takenoshita.smartmirror.presenters.SmartMirrorApplication;
import com.example.takenoshita.smartmirror.presenters.di.components.ActivityComponent;

public class BaseActivity extends AppCompatActivity{

    public ActivityComponent getBaseActivityComponent() {
        return ((SmartMirrorApplication) getApplication())
                .getApplicationComponent()
                .activityComponent();
    }
}
