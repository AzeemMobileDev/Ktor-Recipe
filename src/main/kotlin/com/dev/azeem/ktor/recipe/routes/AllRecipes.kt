package com.dev.azeem.ktor.recipe.routes

import com.dev.azeem.ktor.recipe.models.ApiResponse
import com.dev.azeem.ktor.recipe.repository.RecipeRepository
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.getAllRecipes() {
    val recipeRepository: RecipeRepository by application.inject()

    get("/recipes/all") {
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            val limit = call.request.queryParameters["limit"]?.toInt() ?: 5

            val apiResponse = recipeRepository.getAllRecipes(
                page = page, limit = limit
            )
            call.respond(
                message = apiResponse,
                status = HttpStatusCode.OK
            )
        } catch (e: NumberFormatException) {
            call.respond(
                message = ApiResponse(status = "Failure", message = "Only Numbers allowed."),
                status = HttpStatusCode.BadRequest
            )
        } catch (e: IllegalArgumentException) {
            call.respond(
                message = ApiResponse(status = "Failure", message = "Recipes not found."),
                status = HttpStatusCode.NotFound
            )
        }
    }
}