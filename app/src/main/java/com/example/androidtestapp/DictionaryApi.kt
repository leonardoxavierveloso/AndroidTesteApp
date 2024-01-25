package com.example.androidtestapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path


// Dictionary da API
interface DictionaryApi {

    @GET("en/{word}")
    suspend fun getMeaning(@Path("word") word : String) : Response<List<WordResult>>
}