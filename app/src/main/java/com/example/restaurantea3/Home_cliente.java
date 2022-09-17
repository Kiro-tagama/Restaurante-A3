package com.example.restaurantea3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.restaurantea3.databinding.HomeClienteBinding;

public class Home_cliente extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_cliente);

        EditText input_pesquisa = (EditText) findViewById(R.id.input_pesquisa);
        ImageButton bt_perfil = (ImageButton) findViewById(R.id.bt_perfil);
        View card_restaurante = (View) findViewById(R.id.card_restaurante); // n sei se esse é exatamente uma view

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