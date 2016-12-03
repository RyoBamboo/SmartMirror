package com.example.takenoshita.smartmirror;

import android.app.FragmentTransaction;
import android.os.Bundle;

import com.example.takenoshita.smartmirror.presenters.activities.BaseActivity;
import com.example.takenoshita.smartmirror.presenters.activities.ComponentHoldable;
import com.example.takenoshita.smartmirror.presenters.di.components.MainActivityComponent;
import com.example.takenoshita.smartmirror.presenters.fragments.MainActivityFragment;

public class MainActivity extends BaseActivity implements ComponentHoldable<MainActivityComponent>{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainActivityFragment fragment = new MainActivityFragment();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(R.id.container, fragment);
        transaction.commit();

    }

    @Override
    public MainActivityComponent getComponent() {
        return getBaseActivityComponent().mainActivityComponent();
    }
}
