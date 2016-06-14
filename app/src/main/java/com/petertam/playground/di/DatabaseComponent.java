package com.petertam.playground.di;

import dagger.Component;

@DatabaseScope
@Component(
        dependencies = ApplicationComponent.class,
        modules={
                DatabaseModule.class
        })
public interface DatabaseComponent {

}
