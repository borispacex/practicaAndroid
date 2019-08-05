package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;



public class MainActivity extends AppCompatActivity implements View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button one = (Button) findViewById(R.id.oneButton);
        one.setOnClickListener(this); // calling onClick() method
        Button two = (Button) findViewById(R.id.twoButton);
        two.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        EditText tbolivianos = (EditText) findViewById(R.id.inbs);
        EditText tdolares = (EditText) findViewById(R.id.indolares);
        EditText teuros = (EditText) findViewById(R.id.ineuros);
        EditText tsoles = (EditText) findViewById(R.id.insoles);
        EditText tpchile = (EditText) findViewById(R.id.inpchiles);
        EditText trbrasil = (EditText) findViewById(R.id.inrbrasil);
        EditText tychina = (EditText) findViewById(R.id.inychina);
        EditText tyjapon = (EditText) findViewById(R.id.inyjapon);

        double valordolares = 6.96;
        double valoreruos = 7.52;
        double valorsoles = 2.23;
        double valorpchiles = 0.011354;
        double valorrbrasil = 2.2852;
        double valorychiona = 1.1379;
        double valoryjapon = 0.05849034;

        double valorAconvertir = 0;
        double respdolares = 0;
        double respeuros = 0;
        double respsoles = 0;
        double resppchile = 0;
        double resprbrasil = 0;
        double respychina = 0;
        double respyjapon = 0;

        switch (view.getId()) {

            case R.id.oneButton:
                // convertir
                valorAconvertir = Double.parseDouble(tbolivianos.getText().toString());
                respdolares = valorAconvertir/valordolares;
                respeuros = valorAconvertir/valoreruos;
                respsoles = valorAconvertir/valorsoles;
                resppchile = valorAconvertir/valorpchiles;
                resprbrasil = valorAconvertir/valorrbrasil;
                respychina = valorAconvertir/valorychiona;
                respyjapon = valorAconvertir/valoryjapon;

                tdolares.setText(String.format("%.2f", respdolares));
                teuros.setText(String.format("%.2f", respeuros));
                tsoles.setText(String.format("%.2f", respsoles));
                tpchile.setText(String.format("%.2f", resppchile));
                trbrasil.setText(String.format("%.2f", resprbrasil));
                tychina.setText(String.format("%.2f", respychina));
                tyjapon.setText(String.format("%.2f", respyjapon));
                break;

            case R.id.twoButton:
                // inicializar
                tbolivianos.setText("");
                tdolares.setText("");
                teuros.setText("");
                tsoles.setText("");
                tpchile.setText("");
                trbrasil.setText("");
                tychina.setText("");
                tyjapon.setText("");
                break;

            default:
                break;
        }
    }
}
