package dev;

import java.util.Scanner;

public class BEE1001 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();

        int x = a + b;

        System.out.printf("X = %d%n",x);



        scn.close();
    }
}
