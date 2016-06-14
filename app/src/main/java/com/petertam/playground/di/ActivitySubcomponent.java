package com.petertam.playground.di;

import com.petertam.playground.app.BaseActivity;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent(
        modules={
                ActivityModule.class})
public interface ActivitySubcomponent {
    void inject(BaseActivity activity);
}
