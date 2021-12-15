package model

import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.Serializable
import org.jetbrains.skija.Image
import java.io.ByteArrayOutputStream
import java.net.HttpURLConnection
import java.net.URL
import javax.imageio.ImageIO

@Serializable
data class Character(
    override val name: String,
    override val species: String,
    override val gender: String,
    override val house: String,
    override val wizard: Boolean,
    override val ancestry: String,
    override val wand: Wand,
    override val patronus: String,
    val image: String,
) : BaseCharacter {

    suspend fun toUICharacter(): UICharacter = UICharacter(
        name = this.name,
        species = this.species,
        gender = this.gender,
        house = this.house,
        wizard = this.wizard,
        ancestry = this.ancestry,
        wand = this.wand,
        patronus = this.patronus,
        imageBitmap = loadFromNetwork(this.image)
    )

    private suspend fun loadFromNetwork(image: String): ImageBitmap? = withContext(Dispatchers.IO) {
        if (image.isNullOrEmpty()){
            return@withContext null
        }
        val url = URL(image)
        val connection = url.openConnection() as HttpURLConnection
        connection.connect()

        val inputStream = connection.inputStream
        val bufferedImage = ImageIO.read(inputStream)

        val stream = ByteArrayOutputStream()
        ImageIO.write(bufferedImage, "png", stream)
        val byteArray = stream.toByteArray()

        Image.makeFromEncoded(byteArray).asImageBitmap()
    }
}