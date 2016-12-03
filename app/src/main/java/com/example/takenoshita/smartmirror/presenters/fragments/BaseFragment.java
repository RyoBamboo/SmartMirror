package com.example.takenoshita.smartmirror.presenters.fragments;


import android.app.Fragment;

import com.example.takenoshita.smartmirror.presenters.activities.ComponentHoldable;

public class BaseFragment extends Fragment {

    public <T> T getActivityComponent(Class<T> componentClass) {
        return componentClass.cast(((ComponentHoldable) getActivity()).getComponent());
    }

}
