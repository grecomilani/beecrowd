package dev;

import java.util.Locale;
import java.util.Scanner;

public class BEE1002 {

    private static final double PI = 3.14159;
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scn = new Scanner(System.in);

        double raio = scn.nextDouble();
        double area = PI * Math.pow(raio, 2);
        System.out.printf("A=%.4f%n", area);

        scn.close();
    }
}
