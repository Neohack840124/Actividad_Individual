package com.example.actividadinvdividual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Formulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
    }
    public void registrarse(View view) {
        TextView Para1,Para2,Para3,Para4,Para5;
        Para1 = findViewById(R.id.identificacion);
        Para2 = findViewById(R.id.Nombre);
        Para3 = findViewById(R.id.phone);
        Para4 = findViewById(R.id.postal_direction);
        Para5 = findViewById(R.id.email_adrees);

        Intent intent = new Intent(Formulario.this,Resumen_Form.class);
        intent.putExtra("Identificacion",Para1.getText().toString());
        intent.putExtra("Nombre", Para2.getText().toString());
        intent.putExtra("Telefono",Para3.getText().toString());
        intent.putExtra("Direccion", Para4.getText().toString());
        intent.putExtra("Email", Para5.getText().toString());
        startActivity(intent);
    }
}