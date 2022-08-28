package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int prime_no = 23;
        boolean prime = true;
        if (prime_no <= 1)
        {
            prime = false;
        }
        for (int i = 2; i <= Math.sqrt(prime_no); i++)
        {
            if(prime_no%i==0)
            {
                prime=false;
            }
        }
        System.out.println(prime);
    }
}