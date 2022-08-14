package com.example.practica_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Creacion de variables locales
    private EditText et1, et2;
    private TextView tv1;
    private RadioButton rb1, rb2, rb3, rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Almacenar los valores desde la vista a la porte logica por id
        et1 = (EditText)findViewById(R.id.txt_num1);
        et2 = (EditText)findViewById(R.id.txt_num2);
        tv1 = (TextView) findViewById(R.id.tv_resultado);
        rb1 = (RadioButton) findViewById(R.id.rb_suma);
        rb2 = (RadioButton) findViewById(R.id.rb_resta);
        rb3 = (RadioButton) findViewById(R.id.rb_multi);
        rb4 = (RadioButton) findViewById(R.id.rb_div);

    }
    //Metodo de promedio
    public void Calcular(View view) {
        //Se toma el valor y se almacena en las variables valor
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        //se cambian de texto a tipo numerico
        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        if (rb1.isChecked() == true){
            int suma = num1+num2;
            String resultado = String.valueOf(suma);
            tv1.setText(resultado);
        }else if (rb2.isChecked() == true){
            int resta = num1-num2;
            String resultado = String.valueOf(resta);
            tv1.setText(resultado);
        }else if (rb3.isChecked() == true){
            int resta = num1*num2;
            String resultado = String.valueOf(resta);
            tv1.setText(resultado);
        }else if (rb4.isChecked() == true){
            if (num2 == 0)
                Toast.makeText(this, "El valor2 debe ser mayor de 0", Toast.LENGTH_SHORT).show();
            else{
                int resta = num1/num2;
                String resultado = String.valueOf(resta);
                tv1.setText(resultado);
            }

        }
    }
}