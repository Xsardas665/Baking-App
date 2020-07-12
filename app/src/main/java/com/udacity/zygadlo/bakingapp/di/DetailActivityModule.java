package com.udacity.zygadlo.bakingapp.di;

import com.udacity.zygadlo.bakingapp.ui.DetailActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class DetailActivityModule {
    @ContributesAndroidInjector(modules = DetailFragmentsModule.class)
    abstract DetailActivity contributeDetailActivity();
}
