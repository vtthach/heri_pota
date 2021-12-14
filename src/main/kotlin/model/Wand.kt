package model

import kotlinx.serialization.Serializable

@Serializable
data class Wand(
    val wood: String,
    val core: String
)