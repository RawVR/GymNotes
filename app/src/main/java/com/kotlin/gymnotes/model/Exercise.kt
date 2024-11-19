package com.kotlin.gymnotes.model

import kotlinx.serialization.Serializable

@Serializable
data class Exercise(
    val id: String? = null, // UUID
    val name: String,
    val description: String?,
    val tips: List<String>?, // JSONB as List
    val machineType: String?,
    val muscleGroup: String?,
    val createdAt: String? = null // ISO 8601 Timestamp
)
