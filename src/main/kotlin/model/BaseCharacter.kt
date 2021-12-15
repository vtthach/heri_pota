package model

interface BaseCharacter {
    val name: String
    val species: String
    val gender: String
    val house: String
    val wizard: Boolean
    val ancestry: String
    val wand: Wand
    val patronus: String
}