package com.kotlin.gymnotes.repository

import com.kotlin.gymnotes.model.Exercise
import com.kotlin.gymproject.api.SupabaseService

class ExerciseRepository(private val supabaseService: SupabaseService) {
    suspend fun createExercise(exercise: Exercise) {
        try {
            val response = supabaseService.createExercise(exercise)
            if (response != null) {
                println("Exercise created successfully: $response")
            } else {
                println("Failed to create exercise.")
            }
        } catch (e: Exception) {
            throw e
        }
    }
}