package model

data class Character(
    val name: String,
    val species: String,
    val gender: String,
    val house: String,
    val wizard: Boolean,
    val ancestry: String,
    val wand: Wand,
    val patronus: String,
    val image: String
)