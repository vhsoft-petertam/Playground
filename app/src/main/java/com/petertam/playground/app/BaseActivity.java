package com.petertam.playground.app;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.petertam.playground.BaseApplication;
import com.petertam.playground.di.ActivityModule;
import com.petertam.playground.net.APIService;

import javax.inject.Inject;

public abstract class BaseActivity extends AppCompatActivity {

    @Inject
    SharedPreferences sharedPreferences;
    @Inject
    APIService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((BaseApplication) getApplication()).getApplicationComponent()
                .newActivitySubcomponent(new ActivityModule(this))
                .inject(this);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
