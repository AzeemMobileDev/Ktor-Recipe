package com.dev.azeem.ktor.recipe.plugins

import io.ktor.server.application.*
import io.ktor.server.plugins.calllogging.CallLogging

fun Application.configureMonitoring() {
    install(CallLogging)
}
