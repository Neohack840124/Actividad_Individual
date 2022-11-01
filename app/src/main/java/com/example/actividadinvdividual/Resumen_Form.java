package com.example.actividadinvdividual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Resumen_Form extends AppCompatActivity {
TextView resumen_;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen_form);

        String Identificacion = getIntent().getExtras().getString("Identificacion");
        String Nombre = getIntent().getExtras().getString("Nombre");
        String Telefono = getIntent().getExtras().getString("Telefono");
        String Direccion = getIntent().getExtras().getString("Direccion");
        String Email = getIntent().getExtras().getString("Email");
        resumen_ = findViewById(R.id.test_multi);
        resumen_.append(Identificacion);
        resumen_.append("\r\n");
        resumen_.append(Nombre);
        resumen_.append("\r\n");
        resumen_.append(Telefono);
        resumen_.append("\r\n");
        resumen_.append(Direccion);
        resumen_.append("\r\n");
        resumen_.append(Email);


    }

    public void cerrar_activity(View view) {

        finish();
    }
    public void cerrar_app(View view) {
        finishAffinity();;
    }
}