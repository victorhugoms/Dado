package com.example.dado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {


    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String titulo = intent.getStringExtra(MainActivity.TITULO);

        imageView = findViewById(R.id.image_view_dados);
        rolar(titulo);

    }


    public void rolar(String titulo) {
        if (titulo.equals("dados")) {

        }

    }
}
