package com.example.restaurantea3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.restaurantea3.Conections.Authentica;

public class Login_restaurante extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_restaurante);

        EditText input_email = (EditText) findViewById(R.id.input_email);
        EditText input_pass = (EditText) findViewById(R.id.input_pass);
        Button bt_entrar = (Button) findViewById(R.id.bt_entrar);
        TextView bt_sem_conta = (TextView) findViewById(R.id.sem_conta);

        //botão para acessar o cadastro
        bt_sem_conta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(),Cadastro_restaurante.class);
                startActivity(intent);
            }
        });

        bt_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                String email,senha;
                email=input_email.getText().toString();
                senha=input_pass.getText().toString();

                if(email.length()<=0 || senha.length()<=0 ) return;

                bt_entrar.setText("aguarde...");

                try {
                    Authentica.authentica_usuario(email,senha);
                }catch (Exception e){
                    bt_entrar.setText("ENTRAR");
                    return;
                }

                Authentica status =new Authentica();

                if (status.getStatus() == true) {
                    Intent intent = new Intent();
                    intent.setClass(getApplicationContext(), Perfil_restaurante.class);
                    startActivity(intent);
                }
                bt_entrar.setText("ENTRAR");
            }
        });
    }
}