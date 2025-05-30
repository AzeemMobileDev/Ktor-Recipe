package com.dev.azeem.ktor.recipe.repository

import com.dev.azeem.ktor.recipe.models.ApiResponse
import com.dev.azeem.ktor.recipe.models.Recipe

interface RecipeRepository {

    val recipes: List<Recipe>
    suspend fun getAllRecipes(page: Int = 1, limit: Int = 5): ApiResponse
    suspend fun searchRecipes(name: String?): ApiResponse

}