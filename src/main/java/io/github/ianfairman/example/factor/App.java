package io.github.ianfairman.example.factor;

import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        long startTime = System.currentTimeMillis();
        Factoriser factoriser = new Factoriser();
        List<Integer> result = factoriser.factorise(1000000);
        for (int factor: result) {
            System.out.println(factor);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Milliseconds: " + (endTime - startTime));
    }
}
