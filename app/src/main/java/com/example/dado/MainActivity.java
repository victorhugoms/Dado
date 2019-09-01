package com.example.dado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public  static final String TITULO ="com.example.dado.TITULO";

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.image_view_principal);
        textView = findViewById(R.id.text_view_dados);

    }

    public void rolando(View view){
        Dado dado= new Dado();
        dado.aleatorio();
        if (dado.getNumero() == 3) {
            imageView.setImageResource(R.drawable.dado3);
            textView.setText("Sorteou o 3");
        }
        else if (dado.getNumero() == 1) {
            imageView.setImageResource(R.drawable.dado1);
            textView.setText("Sorteou o 1");
        }
        else if (dado.getNumero() == 2) {
            imageView.setImageResource(R.drawable.dado2);
            textView.setText("Sorteou o 2");
        }
        else if (dado.getNumero() == 4) {
            imageView.setImageResource(R.drawable.dado4);
            textView.setText("Sorteou o 4");
        }
        else if (dado.getNumero() == 5) {
            imageView.setImageResource(R.drawable.dado5);
            textView.setText("Sorteou o 5");
        }
        else if (dado.getNumero() == 6) {
            imageView.setImageResource(R.drawable.dado6);
            textView.setText("Sorteou o 6");
        }


    }
}
