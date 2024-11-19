package com.kotlin.gymnotes.model

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val id: String, // UUID
    val username: String,
    val email: String,
    val password: String,
    val profilePicture: String?, // URL
    val bio: String?,
    val isPrivate: Boolean,
    val createdAt: String // ISO 8601 Timestamp
)
