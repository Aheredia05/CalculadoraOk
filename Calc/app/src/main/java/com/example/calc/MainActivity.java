package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_suma;
    private Button btn_resta;
    private Button btn_division;
    private Button btn_multiplicacion;
    private Button btn_tan;
    private Button btn_sen;
    private Button btn_cos;

    private TextView text_respuesta;

    private EditText edit_numero_uno;
    private EditText edit_numero_dos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_respuesta = findViewById(R.id.respuesta);

        edit_numero_uno = findViewById(R.id.numero1);
        edit_numero_dos = findViewById(R.id.numero2);


        btn_tan = findViewById(R.id.button_tan);
        btn_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText((Double) tan((int) Double.parseDouble(edit_numero_uno.getText().toString()))+"");

            }
        });


        btn_sen = findViewById(R.id.button_sen);
        btn_sen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText((Double) sin((int) Double.parseDouble(edit_numero_uno.getText().toString()))+"");

            }
        });


        btn_cos = findViewById(R.id.button_cos);
        btn_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText((Double) cos((int) Double.parseDouble(edit_numero_uno.getText().toString()))+"");

            }
        });



        btn_suma = findViewById(R.id.button_suma);
        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText( suma( Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()) )+"");
            }
        });


        btn_division = findViewById(R.id.button_division);
        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText( division( Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()) )+"");

            }
        });

        btn_multiplicacion = findViewById(R.id.button_multiplicacion);
        btn_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText( multiplicacion( Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()) )+"");

            }
        });

        btn_resta = findViewById(R.id.button_resta);
        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText( resta( Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()) )+"");

            }






            });

    }

    public double tan (int a){ return Math.tan(a); }

    public double sin (int a){ return Math.sin(a); }

    public double cos (int a){ return Math.cos(a); }

    public double suma (int a, int b){
        return a+b;
    }

    public double resta (int a, int b){
        return a-b;
    }

    public double multiplicacion (int a, int b){
        return a*b;
    }

    public double division (int a, int b){
        int respuesta = 0;

        if (b!=0){
            respuesta=a/b;
        }

        return respuesta;
    }
}