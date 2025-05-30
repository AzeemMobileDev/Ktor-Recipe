package com.dev.azeem.ktor.recipe.routes

import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.root() {
    get("/") {
        call.respond(
            message = "Welcome to Recipes API!",
            status = HttpStatusCode.OK
        )
    }
}