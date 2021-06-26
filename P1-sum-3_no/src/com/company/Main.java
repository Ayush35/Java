package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a,b,c,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. to add: - ");
        a = sc.nextInt();
        System.out.println("Enter a no. to add: - ");
        b = sc.nextInt();
        System.out.println("Enter a no. to add: - ");
        c = sc.nextInt();
        sum = a+ b + c;
        System.out.println("Here's your Output : - " + sum);
    }
}
