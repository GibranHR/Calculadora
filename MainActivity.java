package com.itche.gibranhr.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn0;
    Button btnBorrar;
    Button btnresta;
    Button btnsuma;
    Button btnigual;

    TextView edtResul;
    public double valor1, valor2, resultado;
    String signo;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtResul=(TextView)findViewById(R.id.edtResul);
        btnBorrar = (Button)findViewById(R.id.btnBorrar);
        btnigual = (Button)findViewById(R.id.btnigual);
        btnsuma = (Button)findViewById(R.id.btnsuma);
        btnresta = (Button)findViewById(R.id.btnresta);
        btn0 = (Button)findViewById(R.id.btn0);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);

        //Inicio listener 0
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtResul.getText().equals("0"))
                {
                    edtResul.setText("0");
                }
                else if (edtResul.getText().equals(String.valueOf(resultado)))
                {
                    edtResul.setText("0");
                    resultado = 0;
                }
                else {
                    edtResul.setText(edtResul.getText()+"0");
                }
            }
        });
        //Termina listener 0
        //Inicio listener 1
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtResul.getText().equals("0"))
                {
                    edtResul.setText("1");
                }
                else if (edtResul.getText().equals(String.valueOf(resultado)))
                {
                    edtResul.setText("1");
                    resultado = 0;
                }
                else {
                    edtResul.setText(edtResul.getText()+"1");
                }
            }
        });
        //Termina listener 1
        //Inicio listener 2
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtResul.getText().equals("0"))
                {
                    edtResul.setText("2");
                }
                else if (edtResul.getText().equals(String.valueOf(resultado)))
                {
                    edtResul.setText("2");
                    resultado = 0;
                }
                else {
                    edtResul.setText(edtResul.getText()+"2");
                }
            }
        });
        //Termina listener 2
        //Inicia listener 3
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtResul.getText().equals("0"))
                {
                    edtResul.setText("3");
                }
                else if (edtResul.getText().equals(String.valueOf(resultado)))
                {
                    edtResul.setText("3");
                    resultado = 0;
                }
                else {
                    edtResul.setText(edtResul.getText()+"3");
                }
            }
        });
        //Termina listener 3
        //Inico listener 4
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtResul.getText().equals("0"))
                {
                    edtResul.setText("4");
                }
                else if (edtResul.getText().equals(String.valueOf(resultado)))
                {
                    edtResul.setText("4");
                    resultado = 0;
                }
                else {
                    edtResul.setText(edtResul.getText()+"4");
                }
            }
        });
        //Termina listener 4
        //Inicio listener 5
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtResul.getText().equals("0"))
                {
                    edtResul.setText("5");
                }
                else if (edtResul.getText().equals(String.valueOf(resultado)))
                {
                    edtResul.setText("5");
                    resultado = 0;
                }
                else {
                    edtResul.setText(edtResul.getText()+"5");
                }
            }
        });
        //Termina listener 5
        //Inicio listener 6
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtResul.getText().equals("0"))
                {
                    edtResul.setText("6");
                }
                else if (edtResul.getText().equals(String.valueOf(resultado)))
                {
                    edtResul.setText("6");
                    resultado = 0;
                }
                else {
                    edtResul.setText(edtResul.getText()+"6");
                }
            }
        });
        //Termina listener 6
        //Inicio listener 7
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtResul.getText().equals("0"))
                {
                    edtResul.setText("7");
                }
                else if (edtResul.getText().equals(String.valueOf(resultado)))
                {
                    edtResul.setText("7");
                    resultado = 0;
                }
                else {
                    edtResul.setText(edtResul.getText()+"7");
                }
            }
        });
        //Termina listener 7
        //Inicio listener 8
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtResul.getText().equals("0"))
                {
                    edtResul.setText("8");
                }
                else if (edtResul.getText().equals(String.valueOf(resultado)))
                {
                    edtResul.setText("8");
                    resultado = 0;
                }
                else {
                    edtResul.setText(edtResul.getText()+"8");
                }
            }
        });
        //Termina listener 8
        //inicia listener 9
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtResul.getText().equals("0"))
                {
                    edtResul.setText("9");
                }
                else if (edtResul.getText().equals(String.valueOf(resultado)))
                {
                    edtResul.setText("9");
                    resultado = 0;
                }
                else {
                    edtResul.setText(edtResul.getText()+"9");
                }
            }
        });
        //Termina listener 9
        //operacion de suma
        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signo= "+";
                onClickOperacionCapturaNumero1(v);
            }
        });
        //operacion de resta
        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signo= "-";
                onClickOperacionCapturaNumero1(v);
            }
        });
        //borrar operacion
        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtResul.setText("");
                resultado=0;
            }
        });
        //Mostrar resultado de la operacion
        /*
        btnigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toma lo que esta en la pantalla
                //edtResul=(TextView)findViewById(R.id.edtResul);
                //Almacena los nuemeros en la variable numero2
                valor2=Double.parseDouble(edtResul.getText().toString());
                if(signo.equals("+")){
                    resultado= valor1+valor2;
                }
                else if(signo.equals("-")){
                    resultado= valor1-valor2;
                }
                edtResul.setText(String.valueOf(resultado));
                valor1=0;
                valor2=0;
            }
        });
        */
    }
    public void igual(View view){

        valor2=Double.parseDouble(edtResul.getText().toString());

        if(edtResul.getText().toString().trim().length()==0){
            edtResul.setText(null);
        }
        else if(signo.equals("+")){
            resultado= valor1+valor2;
        }
        else if(signo.equals("-")){
            resultado= valor1-valor2;
        }
        edtResul.setText(String.valueOf(resultado));
    }
    //guarda el valor 1
    public void onClickOperacionCapturaNumero1(View view) {
        valor1=Double.parseDouble(edtResul.getText().toString());
        edtResul.setText("");
    }
}


