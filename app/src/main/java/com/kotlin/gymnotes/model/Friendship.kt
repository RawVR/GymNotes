package com.kotlin.gymnotes.model

import kotlinx.serialization.Serializable

@Serializable
data class Friendship(
    val id: String, // UUID
    val userId: String, // FK to User (request sender)
    val friendId: String, // FK to User (receiver)
    val status: String, // "pending", "accepted", "rejected"
    val createdAt: String // ISO 8601 Timestamp
)
