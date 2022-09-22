package com.example.restaurantea3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Pedidos_restaurante extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pedidos_restaurante);

        ImageButton show_itens = (ImageButton) findViewById(R.id.show_itens);

        ImageButton bt_back = (ImageButton) findViewById(R.id.bt_back);

        bt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(),Perfil_restaurante.class);
                startActivity(intent);
            }
        });

        show_itens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}