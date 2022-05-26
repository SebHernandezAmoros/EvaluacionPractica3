package com.example.evaluaciopractica3.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.evaluaciopractica3.Entities.Pokemon;
import com.example.evaluaciopractica3.R;

import java.util.List;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.StringViewHolder>{
    List<Pokemon> pokemons;

    public PokemonAdapter(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    @NonNull
    @Override
    public PokemonAdapter.StringViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pokemon, parent,false);
        StringViewHolder vh = new StringViewHolder(view);
        return vh;
    }
    @Override
    public void onBindViewHolder(@NonNull PokemonAdapter.StringViewHolder holder, int position) {
        View view = holder.itemView;


    }

    @Override
    public int getItemCount() {
        return pokemons.size();
    }
    public class StringViewHolder extends RecyclerView.ViewHolder{
        public StringViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
