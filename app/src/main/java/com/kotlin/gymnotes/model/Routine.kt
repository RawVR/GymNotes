package com.kotlin.gymnotes.model

import kotlinx.serialization.Serializable

@Serializable
data class Routine(
    val id: String, // UUID
    val userId: String, // FK to User
    val name: String,
    val description: String?,
    val dayOfWeek: String?, // Optional (e.g., "Monday")
    val createdAt: String // ISO 8601 Timestamp
)
