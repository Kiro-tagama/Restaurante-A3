package com.example.restaurantea3;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

public class Perfil_clienete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfil_clienete);

        ImageButton bt_return_home = (ImageButton) findViewById(R.id.bt_return_home);
        ImageButton bt_logout = (ImageButton) findViewById(R.id.bt_logout);
        ImageButton open_qr_cliente = (ImageButton) findViewById(R.id.open_qr_cliente);

        bt_return_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(),Home_cliente.class);
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

        open_qr_cliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(Perfil_clienete.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setCancelable(true);
                dialog.setContentView(R.layout.modal_qr_code);

                dialog.show();
            }
        });
    }
}