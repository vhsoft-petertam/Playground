package com.petertam.playground.di;

import com.petertam.playground.app.BaseActivity;

import dagger.Module;

@Module
public class ActivityModule {

    private BaseActivity activity;

    public ActivityModule(BaseActivity activity) {
        this.activity = activity;
    }

}
