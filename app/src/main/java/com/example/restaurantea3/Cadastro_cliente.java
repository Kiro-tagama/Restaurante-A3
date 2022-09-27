package com.example.restaurantea3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.restaurantea3.Conections.Cadastra;

public class Cadastro_cliente extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_cliente);

        EditText inputEmail = (EditText) findViewById(R.id.inputEmail);
        EditText inputSenha = (EditText) findViewById(R.id.inputSenha);
        EditText inputNome = (EditText) findViewById(R.id.inputNome);
        Button bt_cadastrar = (Button) findViewById(R.id.bt_cadastrar);
        TextView bt_com_conta = (TextView) findViewById(R.id.com_conta);

        bt_com_conta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(),Login_cliente.class);
                startActivity(intent);
            }
        });

        // atividade do botão
        bt_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome,email,senha;

                System.out.println(inputNome.getText()); //pegou o texto

                try {
                    Cadastra.cria_usuario(
                            inputNome.getText().toString(),
                            inputEmail.getText().toString(),
                            inputSenha.getText().toString(),
                            11,11,"null","null","null","null","null","null"
                    );
                } catch (Exception e) {
                    e.printStackTrace();
                }

                //criar a api e enviar e esperar uma promessa (try,catch)
            }
        });
    }
}
