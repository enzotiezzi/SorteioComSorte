package br.com.primos.sorteiocomsorte;

import java.util.Random;

/**
 * Created by enzo on 15/06/2016.
 */
public class Sorteador
{
    private final int MAX = 60 - 1;

    private int n;

    public Sorteador()
    {
        n = 6;
    }

    public int[] sortear()
    {
        int[] numeros = new int[n];

        Random r = new Random();

        for (int i = 0; i < n; i++)
           numeros[i] = r.nextInt(MAX) + 1;

        return numeros;
    }
}
