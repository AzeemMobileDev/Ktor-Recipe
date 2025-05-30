package com.dev.azeem.ktor.recipe.plugins

import com.dev.azeem.ktor.recipe.routes.getAllRecipes
import com.dev.azeem.ktor.recipe.routes.root
import com.dev.azeem.ktor.recipe.routes.searchRecipes
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        root()
        getAllRecipes()
        searchRecipes()
        staticResources(remotePath = "/images", basePackage = "images")
    }
}
