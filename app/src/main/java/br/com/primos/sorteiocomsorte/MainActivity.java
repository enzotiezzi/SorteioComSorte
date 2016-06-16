package br.com.primos.sorteiocomsorte;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    private Context context = this;

    private Button buttonGerarNumeros;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonGerarNumeros = (Button) findViewById(R.id.buttonGerarNumeros);

        buttonGerarNumeros.setOnClickListener(buttonGerarNumeros_click);
    }

    View.OnClickListener buttonGerarNumeros_click = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            Intent i = new Intent(context, NumerosActivity.class);

            context.startActivity(i);
        }
    };
}
