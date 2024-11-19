package com.kotlin.gymnotes.model

import kotlinx.serialization.Serializable

@Serializable
data class RoutineExercise(
    val id: String, // UUID
    val routineId: String, // FK to Routine
    val exerciseId: String, // FK to Exercise
    val sets: Int,
    val reps: List<Int>?, // JSONB as List
    val restTime: Int?, // in seconds
    val weight: List<Float>?, // JSONB as List (optional per set)
    val createdAt: String // ISO 8601 Timestamp
)
