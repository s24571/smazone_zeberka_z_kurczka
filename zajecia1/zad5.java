package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("dej wilkosc tablicy");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        int[]tab =new int[liczba];
        for (int i =0; i<liczba; i++)
        {
            System.out.println("dej liczbe");
            Scanner fghk = new Scanner(System.in);
            int dj = fghk.nextInt();
            tab[i]= dj;
        }
        for (int i=0; i<liczba; i++) {
            System.out.println(tab[i]);
        }
    }
}
