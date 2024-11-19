package com.kotlin.gymnotes.model

import kotlinx.serialization.Serializable

@Serializable
data class Comment(
    val id: String, // UUID
    val postId: String, // FK to Post
    val userId: String, // FK to User
    val content: String,
    val createdAt: String // ISO 8601 Timestamp
)
