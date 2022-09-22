package com.example.restaurantea3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Perfil_restaurante extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfil_restaurante);

        Button edit_cardapio = (Button) findViewById(R.id.edit_cardapio);
        Button bt_pedidos = (Button) findViewById(R.id.bt_pedidos);
        ImageButton bt_logout = (ImageButton) findViewById(R.id.bt_logout);


        edit_cardapio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(),Edit_cardapio.class);
                startActivity(intent);
            }
        });
        bt_pedidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(),Pedidos_restaurante.class);
                startActivity(intent);
            }
        });
        bt_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}