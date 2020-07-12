package com.udacity.zygadlo.bakingapp.di;

import com.udacity.zygadlo.bakingapp.ui.SelectStepFragment;
import com.udacity.zygadlo.bakingapp.ui.ViewStepFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class DetailFragmentsModule {
    @ContributesAndroidInjector
    abstract SelectStepFragment contributeSelectStepFragment();

    @ContributesAndroidInjector
    abstract ViewStepFragment contributeViewStepFragment();
}
