package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "This SKDAFKD";
        System.out.println(s.toLowerCase(Locale.ROOT));
        String sw = "This is to replace whitespace with underscore";
        System.out.println(sw.replace(" " , "_"));

        System.out.println("\nQue 3rd");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : -  ");
//        String name = sc.nextLine();
        String name = "Ayush";
        System.out.println("Dear " + name + ", Thanks a lot");

        System.out.println("\nQue 4th");

        String s4 = "Dear  Ayush   Agrawal,  Thanks  a lot";

        System.out.println(s4.indexOf("  "));
        System.out.println(s4.indexOf("   "));

        //Problem 5
        System.out.println("\nDear Ayush,\n\tGood coding work\nnice");
    }
}
