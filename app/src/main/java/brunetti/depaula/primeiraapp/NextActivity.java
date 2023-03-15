package brunetti.depaula.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Intent intent = getIntent();//Capturando a intent que foi iniciada
        String texto = intent.getStringExtra("texto");//Selecionando a variavel de texto que foi adicionada na intent
        TextView tvExibir = findViewById(R.id.tvExibir);//Selecionando o text view onde o texto sera exibido
        tvExibir.setText(texto);//exibindo o texto no text view
    }
}