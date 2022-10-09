package com.example.restaurantea3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.restaurantea3.Conections.Authentica;
import com.example.restaurantea3.Conections.Cadastra;

public class Cadastro_restaurante extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_restaurante);

        EditText inputEmail = (EditText) findViewById(R.id.input_email_restaurante);
        EditText inputNome = (EditText) findViewById(R.id.input_nome_restaurante);
        EditText inputSenha = (EditText) findViewById(R.id.input_pass_restaurante);
        Button bt_cadastrar = (Button) findViewById(R.id.botaoCadastrar);


        bt_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome,email,senha;

                nome =inputNome.getText().toString();
                email=inputEmail.getText().toString();
                senha=inputSenha.getText().toString();

                if(nome.length() <=0 || email.length()<=0 || senha.length()<=0 ) return;

                bt_cadastrar.setText("Aguarde ...");

                try {
                    Cadastra.cria_usuario(
                            nome,email,senha,
                            11,11,"null","null",
                            "null","null","null","null"
                    );
                    try {
                        Authentica.authentica_usuario(email,senha);
                    }catch (Exception e){
                        return;
                    }

                } catch (Exception e) {
                    bt_cadastrar.setText("Cadastrar");
                    return;
                }

                Authentica status = new Authentica();

                if (status.getStatus() == true) {
                    Intent intent = new Intent();
                    intent.setClass(getApplicationContext(), Perfil_restaurante.class);
                    startActivity(intent);
                }
                bt_cadastrar.setText("Cadastrar");
            }
        });
    }
}
