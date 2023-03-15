package brunetti.depaula.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnEnviar = findViewById(R.id.btnEnviar);//Selecionando o botao de enviar
        //Adicionando clickListener ao botao
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);//Selecionando o edit text
                String texto = etDigiteAqui.getText().toString();//Selecionando o texto do edit text
                Intent intent = new Intent(MainActivity.this, NextActivity.class);//Criando um intent
                intent.putExtra("texto", texto);//Adicionado a variavel que contem o texto do edit text na intent
                startActivity(intent);//Iniciando a intent
            }
        });
    }
}