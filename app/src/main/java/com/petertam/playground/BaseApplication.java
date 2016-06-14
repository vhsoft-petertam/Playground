package com.petertam.playground;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.petertam.playground.di.ApplicationComponent;
import com.petertam.playground.di.ApplicationModule;
import com.petertam.playground.di.DaggerApplicationComponent;
import com.petertam.playground.di.DaggerDatabaseComponent;
import com.petertam.playground.di.DatabaseComponent;
import com.petertam.playground.di.DatabaseModule;
import com.petertam.playground.di.NetModule;

/** FYR
 * https://guides.codepath.com/android/Dependency-Injection-with-Dagger-2
 * */
public class BaseApplication extends Application {
//    @Inject
    SharedPreferences sharedPreferences;

    private ApplicationComponent applicationComponent;
    private DatabaseComponent databaseComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        sharedPreferences.edit().putString("abcdef", "https://api.github.com/").apply();
        String serverUrl = sharedPreferences.getString("abcdef", "");

        // Dagger%COMPONENT_NAME%
        applicationComponent = DaggerApplicationComponent.builder()
                // list of modules that are part of this component need to be created here too
                .applicationModule(new ApplicationModule(this)) // This also corresponds to the name of your module: %component_name%Module
                .netModule(new NetModule(serverUrl))
                .build();
        databaseComponent = DaggerDatabaseComponent.builder()
                .applicationComponent(applicationComponent)
                .databaseModule(new DatabaseModule())
                .build();

        // If a Dagger 2 component does not have any constructor arguments for any of its modules,
        // then we can use .create() as a shortcut instead:
        //  mAppComponent = com.codepath.dagger.components.DaggerNetComponent.create();

//        applicationComponent.inject(this);
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    public DatabaseComponent getDatabaseComponent() {
        return databaseComponent;
    }
}
