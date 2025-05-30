package com.dev.azeem.ktor.recipe.di

import com.dev.azeem.ktor.recipe.repository.RecipeRepository
import com.dev.azeem.ktor.recipe.repository.RecipeRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<RecipeRepository> {
        RecipeRepositoryImpl()
    }
}