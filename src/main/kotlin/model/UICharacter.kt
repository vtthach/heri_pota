package model

import androidx.compose.ui.graphics.ImageBitmap

data class UICharacter(
    override val name: String,
    override val species: String,
    override val gender: String,
    override val house: String,
    override val wizard: Boolean,
    override val ancestry: String,
    override val wand: Wand,
    override val patronus: String,
    val imageBitmap: ImageBitmap?
) : BaseCharacter