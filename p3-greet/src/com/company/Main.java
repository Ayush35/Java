package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String nm;
        System.out.print("Enter your Name: - ");
        Scanner sc = new Scanner(System.in);
        nm = sc.nextLine();
        System.out.println("Hello " + nm +", It's a pleasure to meet your Sir");
    }
}
