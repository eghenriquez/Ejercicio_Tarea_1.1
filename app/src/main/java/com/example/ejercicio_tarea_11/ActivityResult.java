package com.example.ejercicio_tarea_11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityResult extends AppCompatActivity {

    TextView Resultado;
    String m1="El resultado es: ";
    Button btnregresa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        /* metodo para mostrar resultado */
        recibirresult();

        btnregresa=(Button) findViewById(R.id.btnregresa);

        btnregresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*crear intent para regresar a la actividad anterior*/
                Intent intentregresa = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intentregresa);
            }
        });
    }

    private void recibirresult(){
        Bundle valor = getIntent().getExtras();
        Integer r1 = valor.getInt("resultado");

        Resultado = (TextView) findViewById(R.id.txtresult);
        Resultado.setText(m1+r1);
    }
}