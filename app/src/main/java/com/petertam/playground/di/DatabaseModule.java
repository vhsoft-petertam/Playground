package com.petertam.playground.di;

import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.petertam.playground.BaseApplication;
import com.petertam.playground.helper.DatabaseHelper;

import dagger.Module;
import dagger.Provides;

@Module
public class DatabaseModule {

    @Provides
    @DatabaseScope
    DatabaseHelper provideDatabaseHelper(BaseApplication baseApplication) {
        return OpenHelperManager.getHelper(baseApplication, DatabaseHelper.class);
    }
}
