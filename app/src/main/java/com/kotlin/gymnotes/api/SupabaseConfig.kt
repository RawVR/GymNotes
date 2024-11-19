package com.kotlin.gymproject.api

import com.kotlin.gymnotes.BuildConfig
import io.ktor.client.*
import io.ktor.client.engine.android.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

class SupabaseConfig {
    companion object {
        val BASE_URL = BuildConfig.SUPABASE_URL + "/rest/v1"
        val API_KEY = BuildConfig.SUPABASE_API_KEY

        val client = HttpClient(Android) {
            install(ContentNegotiation) {
                json(Json {
                    ignoreUnknownKeys = true
                    prettyPrint = true
                })
            }
        }
    }
}