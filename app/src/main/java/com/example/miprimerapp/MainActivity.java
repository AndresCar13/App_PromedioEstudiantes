package com.example.miprimerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText nota1;    // Uso de componentes que le permiten al usuario editar texto
    private EditText nota2;
    private EditText nota3;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nota1 = findViewById(R.id.et_nota1);
        nota2 = findViewById(R.id.et_nota2);
        nota3 = findViewById(R.id.et_nota3);
        res = findViewById(R.id.tv_titulo);
    }

    public void Evaluar(View view) {
        String exit;
        String valor1 = nota1.getText().toString();
        String valor2 = nota2.getText().toString();
        String valor3 = nota3.getText().toString();

        float val1 = Float.parseFloat(valor1);
        float val2 = Float.parseFloat(valor2);
        float val3 = Float.parseFloat(valor3);

        float promedio = (val1 + val2 + val3) / 3;

        if (promedio >= 3 && promedio <= 5) {
            exit = "Aprobado";
        } else if (promedio >= 0 && promedio < 3) {
            exit = "Reprobado";
        } else {
            exit = "Error";
        }

        res.setText(exit);
        nota1.setText("");
        nota2.setText("");
        nota3.setText("");
    }
}