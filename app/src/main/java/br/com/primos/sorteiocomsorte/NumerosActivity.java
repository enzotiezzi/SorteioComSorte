package br.com.primos.sorteiocomsorte;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class NumerosActivity extends AppCompatActivity
{
    private Context context = this;

    private TextView textViewNumero1;
    private TextView textViewNumero2;
    private TextView textViewNumero3;
    private TextView textViewNumero4;
    private TextView textViewNumero5;
    private TextView textViewNumero6;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros);

        textViewNumero1 = (TextView) findViewById(R.id.textViewNumero1);
        textViewNumero2 = (TextView) findViewById(R.id.textViewNumero2);
        textViewNumero3 = (TextView) findViewById(R.id.textViewNumero3);
        textViewNumero4 = (TextView) findViewById(R.id.textViewNumero4);
        textViewNumero5 = (TextView) findViewById(R.id.textViewNumero5);
        textViewNumero6 = (TextView) findViewById(R.id.textViewNumero6);

        Sorteador sorteador = new Sorteador();

        int[] numeros = sorteador.sortear();

        textViewNumero1.setText(String.valueOf(numeros[0]));
        textViewNumero2.setText(String.valueOf(numeros[1]));
        textViewNumero3.setText(String.valueOf(numeros[2]));
        textViewNumero4.setText(String.valueOf(numeros[3]));
        textViewNumero5.setText(String.valueOf(numeros[4]));
        textViewNumero6.setText(String.valueOf(numeros[5]));
    }
}
