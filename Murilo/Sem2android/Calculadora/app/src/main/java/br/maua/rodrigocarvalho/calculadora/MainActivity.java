package br.maua.rodrigocarvalho.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    protected void somar(View view){
        EditText a = (EditText) findViewById(R.id.numero1);
        EditText b = (EditText) findViewById(R.id.numero2);
        double n1 = Double.parseDouble(a.getText().toString());
        double n2 = Double.parseDouble(b.getText().toString());
        double n3 = n1+n2;
        TextView resultado = (TextView) findViewById(R.id.resultado);
        resultado.setText(Double.toString(n3));
    }
    protected void subtrair(View view){
        EditText a = (EditText) findViewById(R.id.numero1);
        EditText b = (EditText) findViewById(R.id.numero2);
        double n1 = Double.parseDouble(a.getText().toString());
        double n2 = Double.parseDouble(b.getText().toString());
        double n3 = n1-n2;
        TextView resultado = (TextView) findViewById(R.id.resultado);
        resultado.setText(Double.toString(n3));

    }
    protected void dividir(View view){
        EditText a = (EditText) findViewById(R.id.numero1);
        EditText b = (EditText) findViewById(R.id.numero2);
        double n1 = Double.parseDouble(a.getText().toString());
        double n2 = Double.parseDouble(b.getText().toString());
        double n3 = n1/n2;
        TextView resultado = (TextView) findViewById(R.id.resultado);
        resultado.setText(Double.toString(n3));
    }
    protected void multiplicar(View view){
        EditText a = (EditText) findViewById(R.id.numero1);
        EditText b = (EditText) findViewById(R.id.numero2);
        double n1 = Double.parseDouble(a.getText().toString());
        double n2 = Double.parseDouble(b.getText().toString());
        double n3 = n1*n2;
        TextView resultado = (TextView) findViewById(R.id.resultado);
        resultado.setText(Double.toString(n3));
    }
}
