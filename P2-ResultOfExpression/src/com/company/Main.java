package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("1st que ");
        System.out.println("Result of expression: - "+ 7/4*9/2);

        System.out.println("2nd que ");

        System.out.print("Enter the Grade: -  ");
        Scanner sc = new Scanner(System.in);
//        double en_grade = sc.nextDouble() + 8;
          double en_grade = 9.7 + 8;
        System.out.println("Encrypted Grade : - " + en_grade);
        System.out.println("Decrypted Grade : - " + (en_grade -8) );

        System.out.println("3rd que ");

        System.out.println("Enter your No. (compare to 25) : - ");
//        int a = sc.nextInt();
        int a = 25;
//        int g = 25;
        if(a > 25){
            System.out.println("No. is greater");
        }
        else if (a<25){
            System.out.println("No. is lesser");
        }
        else{
            System.out.println("You Entered 25 ");
        }

        System.out.println("4th Que");

        System.out.println ("(v*v-u*u)/(2*a*s)");

        System.out.println("5th Que");
        System.out.println(7*(49/7) + (35/7) );
    }
}
