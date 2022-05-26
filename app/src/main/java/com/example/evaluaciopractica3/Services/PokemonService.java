package com.example.evaluaciopractica3.Services;

import com.example.evaluaciopractica3.Entities.Pokemon;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface PokemonService {
    @GET("Pokemon")
    Call<List<Pokemon>> getPokemons();

    // contacts/:id
    @GET("Pokemon/{id}")
    Call<Pokemon> findPokemon(@Path("id") int id);

    @POST("Pokemon")
    Call<Pokemon> create(@Body Pokemon pokemon);
}
