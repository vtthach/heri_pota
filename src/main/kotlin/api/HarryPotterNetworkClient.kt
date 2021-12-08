package api

import model.Character
import retrofit2.Response
import retrofit2.http.GET

interface HarryPotterNetworkClient {
    @GET("characters")
    suspend fun fetchCharacters(): Response<List<Character>>
}