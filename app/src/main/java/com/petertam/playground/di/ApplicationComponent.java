package com.petertam.playground.di;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules={
                ApplicationModule.class,
                NetModule.class
        })
public interface ApplicationComponent {

    ActivitySubcomponent newActivitySubcomponent(ActivityModule activityModule);
}
