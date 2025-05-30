package com.dev.azeem.ktor.recipe.models

import kotlinx.serialization.Serializable

@Serializable
data class ApiResponse(
    val status: String,
    val message: String? = null,
    val prevPage: Int? = null,
    val nextPage: Int? = null,
    val recipes: List<Recipe> = emptyList(),
    val lastUpdated: Long? = null
)