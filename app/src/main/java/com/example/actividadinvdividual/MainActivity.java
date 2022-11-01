package com.example.actividadinvdividual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void IniciarFormulario(View view) {
        Intent abrir_form = new Intent(MainActivity.this,Formulario.class);
        startActivity(abrir_form );
    }


}