package com.company.zaj3;


public class zad1 {

    public static void main(String[] args)
    {

        int liczba = 3;
        int licz = 4;
        int wynik = compare(liczba, licz);
        System.out.println(wynik);

    }
    public static int compare ( int guaz, int  kamyk)
    {
        int wynik;
        if ( guaz ==  kamyk){
            wynik = 0;
        }
        else if (guaz > kamyk)
        {
             wynik = 1;
        }
        else
        {
            wynik = -1;
        }
        return wynik;
    }
}

/////////////////
