package webservice.androidchallenge2.repository

import retrofit2.http.GET
import retrofit2.http.Query
import webservice.androidchallenge2.model.pojo.ComicsResponse

interface ServiceMarvelApi {

    @GET("comics")
    suspend fun getComics(
        @Query("ts") ts: String,
        @Query("hash") hash: String,
        @Query("apikey") apiKey: String,
        @Query("offset") offset: Int,
        @Query("limit") limit: Int = 100
    ): ComicsResponse
}