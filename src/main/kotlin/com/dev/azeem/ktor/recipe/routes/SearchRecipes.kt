package com.dev.azeem.ktor.recipe.routes

import com.dev.azeem.ktor.recipe.models.ApiResponse
import com.dev.azeem.ktor.recipe.repository.RecipeRepository
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.searchRecipes() {
    val recipeRepository: RecipeRepository by application.inject()

    get("/recipes/all/search") {
        val name = call.request.queryParameters["name"]

        if (name?.any { it.isDigit() } == true) {
            call.respond(
                message = ApiResponse(status = "Failure", message = "Only text allowed."),
                status = HttpStatusCode.BadRequest
            )
        } else {
            val apiResponse = recipeRepository.searchRecipes(name = name)
            call.respond(
                message = apiResponse,
                status = HttpStatusCode.OK
            )
        }
    }
}