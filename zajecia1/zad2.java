package com.company.zajecia1_8_03;
        import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("dej liczbe");
        Scanner scanner = new Scanner(System.in);
        double liczba = scanner.nextInt();
        liczba = (9/5.0)*liczba+32;
        System.out.println(liczba);
    }
}
