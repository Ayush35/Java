package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //que 1 pattern
        int n = 5;
        for(int i = n ; i >0 ; i-- ){
            for (int j = 0 ; j < i ; j ++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        //que 2
        int f_n = 16;
        int sum = 0;
        for(int i = 1 ; i<=f_n*2; i++){
            if(i%2 == 0){
                sum += i;
            }
        }
        System.out.println("sum of first n natural no. : -  " + sum);

        //que 3
        int tab = 16;
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println( tab + "*" + i + "=" + (tab * i) );
        }

//        que 4

        for(int i = 10 ; i>=1 ; i--){
            System.out.println( 10 + "*" + i + "=" + 10*i );
        }

        //que 5


    }
}
