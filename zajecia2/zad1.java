package com.company.zaj2;
import java.util.Arrays;
public class zad1 {
    public static void main(String[] args)
    {
       int[] tablia1 = new int[]{5,5,5};
       int[] tablica2 = new int[]{1,2,3};
       int[] suma = tabliczki(tablia1, tablica2);
        System.out.println(Arrays.toString(suma));
    }

      public static int[] tabliczki ( int[] tab1, int[] tab2)
        {
            if (tab1.length != tab2.length) {
                return new int[]{};
            }
            int[] suma =new int[tab1.length];
            for (int i=0; i<suma.length;i++)
            {
                suma[i] = tab1[i]+tab2[2];
            }
            return suma;
        }
}
