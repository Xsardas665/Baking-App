package com.udacity.zygadlo.bakingapp.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.udacity.zygadlo.bakingapp.model.Ingredient;
import com.udacity.zygadlo.bakingapp.model.Recipe;
import com.udacity.zygadlo.bakingapp.model.Step;

@Database(entities = {Recipe.class, Ingredient.class, Step.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    abstract public RecipeDao recipeDao();
}
