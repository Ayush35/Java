package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        double km , miles;
        System.out.print("Enter in Km");
        km = sc.nextDouble();
        miles = km / 1.609 ;
        System.out.println("Here's the corresponding miles : - "+ miles);
    }
}
