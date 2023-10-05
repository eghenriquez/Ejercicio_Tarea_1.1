package com.example.ejercicio_tarea_11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    Button btnsuma,btnresta,btnmultiplicacion,btndivision,btnsalir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=(EditText) findViewById(R.id.txtnum1);
        num2=(EditText) findViewById(R.id.txtnum2);
        btnsuma=(Button) findViewById(R.id.btnsuma);
        btnresta=(Button) findViewById(R.id.btnresta);
        btnmultiplicacion=(Button) findViewById(R.id.btnmultiplicacion);
        btndivision=(Button) findViewById(R.id.btndivision);
        btnsalir=(Button) findViewById(R.id.btnsalir);

        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer x,y;
                Integer r;
                x=Integer.parseInt(num1.getText().toString());
                y=Integer.parseInt(num2.getText().toString());
                r=x+y;
                /*crear intent para llamar a otra actividad*/
                Intent intentcreate = new Intent(getApplicationContext(), ActivityResult.class);
                intentcreate.putExtra("resultado", r);
                startActivity(intentcreate);
            }
        });
        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer x,y;
                Integer r;
                x=Integer.parseInt(num1.getText().toString());
                y=Integer.parseInt(num2.getText().toString());
                r=x-y;
                /*crear intent para llamar a otra actividad*/
                Intent intentcreate = new Intent(getApplicationContext(), ActivityResult.class);
                intentcreate.putExtra("resultado", r);
                startActivity(intentcreate);
            }
        });
        btnmultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer x,y;
                Integer r;
                x=Integer.parseInt(num1.getText().toString());
                y=Integer.parseInt(num2.getText().toString());
                r=x*y;
                /*crear intent para llamar a otra actividad*/
                Intent intentcreate = new Intent(getApplicationContext(), ActivityResult.class);
                intentcreate.putExtra("resultado", r);
                startActivity(intentcreate);
            }
        });
        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer x,y;
                Integer r;
                x=Integer.parseInt(num1.getText().toString());
                y=Integer.parseInt(num2.getText().toString());
                r=x/y;
                /*crear intent para llamar a otra actividad*/
                Intent intentcreate = new Intent(getApplicationContext(), ActivityResult.class);
                intentcreate.putExtra("resultado", r);
                startActivity(intentcreate);
            }
        });
        btnsalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
    }
}