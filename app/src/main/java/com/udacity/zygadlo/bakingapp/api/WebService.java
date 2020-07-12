package com.udacity.zygadlo.bakingapp.api;

import android.arch.lifecycle.LiveData;

import com.udacity.zygadlo.bakingapp.model.Recipe;

import java.util.List;

import retrofit2.http.GET;

public interface WebService {
    @GET("baking.json")
    LiveData<ApiResponse<List<Recipe>>> getRecipes();
}
