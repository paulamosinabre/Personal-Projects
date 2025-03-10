package com.mycompany.samplecodes;

import java.util.Scanner;
import java.util.ArrayList;

public class FibonacciSequence {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        
        System.out.print("Enter a number: ");
        int num1 = scan.nextInt();
        
        System.out.print("Enter a number: ");
        int num2 = scan.nextInt();
        num.add(num1);
        num.add(num2);

        System.out.print(num1 + ", " + num2);
        for (int i = 0; i < 6; i++) {
            int num3 = num1 + num2;
            System.out.print(", " + num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
