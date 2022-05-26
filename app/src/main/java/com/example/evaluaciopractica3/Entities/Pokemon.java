package com.example.evaluaciopractica3.Entities;

import android.text.Editable;

public class Pokemon {
    public int id;
    public String  number;
    public String name;
    public String region;
    public String tipo;

    public Pokemon() {
    }

    public Pokemon(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public Pokemon(String number, String name, String region) {
        this.number = number;
        this.name = name;
        this.region = region;
    }

    public Pokemon(String number, String name, String region, String tipo) {
        this.number = number;
        this.name = name;
        this.region = region;
        this.tipo = tipo;
    }
}
