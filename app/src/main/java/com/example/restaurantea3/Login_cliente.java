package com.example.restaurantea3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.restaurantea3.Conections.Authentica;

public class Login_cliente extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_cliente);

        EditText input_email = (EditText) findViewById(R.id.input_email);
        EditText input_pass = (EditText) findViewById(R.id.input_pass);
        Button bt_entrar = (Button) findViewById(R.id.bt_entrar);
        TextView bt_sem_conta = (TextView) findViewById(R.id.sem_conta);

        //botão para acessar o cadastro
        bt_sem_conta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(),Cadastro_cliente.class);
                startActivity(intent);
            }
        });

        bt_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Authentica.authentica_usuario(
                            input_email.getText().toString(),
                            input_pass.getText().toString()
                    );
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println(e.getMessage());
                }

                Intent intent = new Intent();
                intent.setClass(getApplicationContext(),Home_cliente.class);
                startActivity(intent);
            }
        });

    }
}
