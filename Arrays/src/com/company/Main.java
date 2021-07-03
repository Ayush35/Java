package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //que 1
        double[] fl = {12.32, 12.22 , 232.32 , 23.242, 12.2121};
        double sum = 0 ;
        for( int i = 0 ; i< 5 ; i++){
            sum = sum + fl[i];
        }
        System.out.println("the sum of the no. is  " + sum);

        // que 2
        double n = 12.2121;
        for(int i = 0 ; i <5; i++){
            if(n == fl[i]){
                System.out.println("Number found at Index " + i);
                break;
            }
        }

    }
}
