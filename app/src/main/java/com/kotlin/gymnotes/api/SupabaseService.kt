package com.kotlin.gymproject.api

import com.kotlin.gymnotes.model.Exercise
import io.github.jan.supabase.SupabaseClient
import io.ktor.client.call.body
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*

class SupabaseService {
    val BASE_URL = SupabaseConfig.BASE_URL
    val API_KEY = SupabaseConfig.API_KEY
    val client = SupabaseConfig.client

    suspend fun createExercise(exercise: Exercise): Exercise? {
        println("Exercise: $exercise")
        return try {
            val response: HttpResponse = client.post("$BASE_URL/exercise") {
                io.ktor.http.headers {
                    append(HttpHeaders.Authorization, "Bearer $API_KEY")
                    append(HttpHeaders.ContentType, ContentType.Application.Json)
                }
                setBody(exercise)
            }
            response.body() // Deserialize the response into Exercise
        } catch (e: Exception) {
            println("Error creating exercise: ${e.message}")
            println(BASE_URL)
            null
        }
    }
}