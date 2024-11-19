package com.kotlin.gymnotes.model

import kotlinx.serialization.Serializable

@Serializable
data class ExerciseProgress(
    val id: String, // UUID
    val userId: String, // FK to User
    val exerciseId: String, // FK to Exercise
    val weight: Float, // Max weight lifted
    val date: String, // ISO 8601 Date
    val notes: String? // Optional notes
)
