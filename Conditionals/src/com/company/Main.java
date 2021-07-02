package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //que 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Input marks in 3 subjects - ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
        int a = 40;
        int b = 40;
        int c = 40;

        double s = (a+b+c)/3;
        if(a >= 33 && b >= 33 && c>= 33 && s >= 40 ){
            System.out.println("Student is pass");
        }
        else
        {
            System.out.println("Student is fail ");
        }

        // Que 3
        System.out.println("Enter your Income (as 2.5): - ");
//        Double inc = sc.nextDouble();
        Double inc = 2.0 ;
        if(inc>=2.5 && inc<=5.0)
        {
            System.out.println("Tax is " +  inc/25  + "Lakh");
        }
        else if(inc> 5.0 && inc<=10.0){
            System.out.println("Tax is " +  inc/5  + "Lakh");
        }
        else if(inc>10.0){
            System.out.println("Tax is " +  ((inc*30)/100) + "Lakh");
        }
        else{
            System.out.println("Live Tax Free");
        }
        //Que 4
        System.out.println("Enter the number for day : - ");
//        int day = sc.nextInt();
        int day = 7;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
        }
        // que 5
        System.out.println("Enter year : - ");
//        int year = sc.nextInt();
        int year = 2020;
        if(year%4 == 0 ){
            System.out.println("You entered a leap year ");
        }
        else {
            System.out.println("Not a leap year");
        }
        //que 6
        System.out.println("Enter the website: - ");
        String web = sc.nextLine();
//        System.out.println(web.indexOf(".com"));
        if(web.indexOf(".com") != -1){
            System.out.println("this is a commercial website");
        }
        else if(web.indexOf(".org")!=-1){
            System.out.println("this is a Organisation website");
        }else if(web.indexOf(".in")!=-1){
            System.out.println("this is Indian website");
        }
        else{
            System.out.println("Please enter something Useful");
        }
    }
}
