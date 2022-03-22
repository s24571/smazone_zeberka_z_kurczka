package com.company.zajecia1_8_03;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("dej liczbe od 1 do 7");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        switch (liczba)
        {
            case 1:
                System.out.println("poniedialek");
                break;
            case 2:
                System.out.println("wtorek");
                break;
            case 3:
                System.out.println("sroda");
                break;
            case 4:
                System.out.println("czwartek");
                break;
            case 5:
                System.out.println("piatek");
                break;
            case 6:
                System.out.println("sobta");
                break;
            case 7:
                System.out.println("nidziela");
                break;
        }
    }
}
