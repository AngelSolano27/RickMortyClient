package edu.itsco.rickmortyclient.data.api

import edu.itsco.rickmortyclient.data.api.model.Characters
import retrofit2.http.GET


interface RickMortyApi {

    @GET ("Character")
    suspend fun getCharacters(): Characters
}