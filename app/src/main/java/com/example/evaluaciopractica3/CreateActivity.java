package com.example.evaluaciopractica3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.evaluaciopractica3.Entities.Pokemon;
import com.example.evaluaciopractica3.Factories.RetrofitFactory;
import com.example.evaluaciopractica3.Services.PokemonService;
import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class CreateActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        Button btnEnviar = findViewById(R.id.btnEnviar);
        EditText etNumber = findViewById(R.id.etNumber);
        EditText etName = findViewById(R.id.etName);
        EditText etRegion = findViewById(R.id.etRegion);
        EditText etTipo = findViewById(R.id.etTipo);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Retrofit retrofit = RetrofitFactory.build();
                PokemonService service = retrofit.create(PokemonService.class);

                Pokemon pokemon = new Pokemon();
                pokemon.number= String.valueOf(etNumber.getText());
                pokemon.name = String.valueOf(etName.getText());
                pokemon.region =String.valueOf( etRegion.getText());
                pokemon.tipo =String.valueOf( etTipo.getText());

                Call<Pokemon> call = service.create(pokemon);

                call.enqueue(new Callback<Pokemon>() {
                    @Override
                    public void onResponse(Call<Pokemon> call, Response<Pokemon> response) {
                        if (response.isSuccessful()){
                            Log.i("PRUEBA",new Gson().toJson(response.body()));

                            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                            startActivity(intent);
                        }
                    }
                    @Override
                    public void onFailure(Call<Pokemon> call, Throwable t) {
                        Log.i("PRUEBA","No se pudo conectar");
                    }
                });

            }
        });
    }
}