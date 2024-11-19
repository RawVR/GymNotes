package com.kotlin.gymnotes.model

import kotlinx.serialization.Serializable

@Serializable
data class Post(
    val id: String, // UUID
    val userId: String, // FK to User
    val content: String?,
    val type: String, // "PR", "RoutineShare", etc.
    val attachment: String?, // URL for media
    val createdAt: String // ISO 8601 Timestamp
)
