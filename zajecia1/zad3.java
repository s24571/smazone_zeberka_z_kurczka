package com.company.zajecia1_8_03;
public class Main {
    public static void main(String[] args) {
        System.out.println("miles   Kilometers");
        for (int i=1; i<=10; i++)
        {
            double x = i* 1.609;
            System.out.print(i);
            System.out.print("         ");
            System.out.println(x);
        }
    }
}
