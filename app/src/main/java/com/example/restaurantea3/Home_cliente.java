package com.example.restaurantea3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import android.widget.EditText;
import android.widget.ImageButton;

public class Home_cliente extends AppCompatActivity {

    String[] array={"primeiro","segundo","terceiro"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_cliente);

        EditText input_pesquisa = (EditText) findViewById(R.id.input_pesquisa);
        ImageButton bt_perfil = (ImageButton) findViewById(R.id.bt_perfil);
        //View card_restaurante = (View) findViewById(R.id.card_restaurante); // n sei se esse é exatamente uma view

        //RecyclerView lista_restaurantes = (RecyclerView) findViewById(R.id.lista_restaurantes);

        bt_perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {


                Intent intent = new Intent();
                intent.setClass(getApplicationContext(),Perfil_clienete.class);
                startActivity(intent);
            }
        });

    }



}