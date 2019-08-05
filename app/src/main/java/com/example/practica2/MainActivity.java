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
        double respbolivianos = 0;

        switch (view.getId()) {

            case R.id.oneButton:
                // convertir

                if (!tbolivianos.getText().toString().equals("")) {
                    valorAconvertir = Double.parseDouble(tbolivianos.getText().toString());
                    respdolares = valorAconvertir/valordolares;
                    respeuros = valorAconvertir/valoreruos;
                    respsoles = valorAconvertir/valorsoles;
                    resppchile = valorAconvertir/valorpchiles;
                    resprbrasil = valorAconvertir/valorrbrasil;
                    respychina = valorAconvertir/valorychiona;
                    respyjapon = valorAconvertir/valoryjapon;
                }else{
                    if (!tdolares.getText().toString().equals("")) {
                        valorAconvertir = Double.parseDouble(tdolares.getText().toString());
                        respdolares = valorAconvertir;
                        respbolivianos = valorAconvertir*valordolares;
                        respeuros = respbolivianos/valoreruos;
                        respsoles = respbolivianos/valorsoles;
                        resppchile = respbolivianos/valorpchiles;
                        resprbrasil = respbolivianos/valorrbrasil;
                        respychina = respbolivianos/valorychiona;
                        respyjapon = respbolivianos/valoryjapon;
                        tbolivianos.setText(String.format("%.2f", respbolivianos));
                    }else{
                        if (!teuros.getText().toString().equals("")) {
                            valorAconvertir = Double.parseDouble(teuros.getText().toString());
                            respeuros = valorAconvertir;
                            respbolivianos = valorAconvertir*valoreruos;
                            respsoles = respbolivianos/valorsoles;
                            resppchile = respbolivianos/valorpchiles;
                            resprbrasil = respbolivianos/valorrbrasil;
                            respychina = respbolivianos/valorychiona;
                            respyjapon = respbolivianos/valoryjapon;
                            respdolares = respbolivianos/valordolares;
                            tbolivianos.setText(String.format("%.2f", respbolivianos));
                        }else{
                            if (!tsoles.getText().toString().equals("")) {
                                valorAconvertir = Double.parseDouble(tsoles.getText().toString());
                                respsoles = valorAconvertir;
                                respbolivianos = valorAconvertir*valorsoles;
                                resppchile = respbolivianos/valorpchiles;
                                resprbrasil = respbolivianos/valorrbrasil;
                                respychina = respbolivianos/valorychiona;
                                respyjapon = respbolivianos/valoryjapon;
                                respdolares = respbolivianos/valordolares;
                                respeuros = respbolivianos/valoreruos;
                                tbolivianos.setText(String.format("%.2f", respbolivianos));
                            }else{
                                if (!tpchile.getText().toString().equals("")) {
                                    valorAconvertir = Double.parseDouble(tpchile.getText().toString());
                                    resppchile = valorAconvertir;
                                    respbolivianos = valorAconvertir*valorpchiles;
                                    resprbrasil = respbolivianos/valorrbrasil;
                                    respychina = respbolivianos/valorychiona;
                                    respyjapon = respbolivianos/valoryjapon;
                                    respdolares = respbolivianos/valordolares;
                                    respeuros = respbolivianos/valoreruos;
                                    respsoles = respbolivianos/valorsoles;
                                    tbolivianos.setText(String.format("%.2f", respbolivianos));
                                }else{
                                    if (!trbrasil.getText().toString().equals("")) {
                                        valorAconvertir = Double.parseDouble(trbrasil.getText().toString());
                                        resprbrasil = valorAconvertir;
                                        respbolivianos = valorAconvertir*valorrbrasil;
                                        respychina = respbolivianos/valorychiona;
                                        respyjapon = respbolivianos/valoryjapon;
                                        respdolares = respbolivianos/valordolares;
                                        respeuros = respbolivianos/valoreruos;
                                        respsoles = respbolivianos/valorsoles;
                                        resppchile = respbolivianos/valorpchiles;
                                        tbolivianos.setText(String.format("%.2f", respbolivianos));
                                    }else{
                                        if (!tychina.getText().toString().equals("")) {
                                            valorAconvertir = Double.parseDouble(tychina.getText().toString());
                                            respychina = valorAconvertir;
                                            respbolivianos = valorAconvertir*valorychiona;
                                            respyjapon = respbolivianos/valoryjapon;
                                            respdolares = respbolivianos/valordolares;
                                            respeuros = respbolivianos/valoreruos;
                                            respsoles = respbolivianos/valorsoles;
                                            resppchile = respbolivianos/valorpchiles;
                                            resprbrasil = respbolivianos/valorrbrasil;
                                            tbolivianos.setText(String.format("%.2f", respbolivianos));
                                        }else{
                                            if (!tyjapon.getText().toString().equals("")) {
                                                valorAconvertir = Double.parseDouble(tyjapon.getText().toString());
                                                respyjapon = valorAconvertir;
                                                respbolivianos = valorAconvertir*valoryjapon;
                                                respdolares = respbolivianos/valordolares;
                                                respeuros = respbolivianos/valoreruos;
                                                respsoles = respbolivianos/valorsoles;
                                                resppchile = respbolivianos/valorpchiles;
                                                resprbrasil = respbolivianos/valorrbrasil;
                                                respychina = respbolivianos/valorychiona;
                                                tbolivianos.setText(String.format("%.2f", respbolivianos));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }


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
