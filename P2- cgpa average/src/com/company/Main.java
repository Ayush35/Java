package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Double a,b,c,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. to add: - ");
        a = sc.nextDouble();
        System.out.println("Enter a no. to add: - ");
        b = sc.nextDouble();
        System.out.println("Enter a no. to add: - ");
        c = sc.nextDouble();
        sum = (a+ b + c)/3 ;
        System.out.println("Here's your Output : - " + sum);
    }
}
