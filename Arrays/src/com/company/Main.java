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

        // Que 3
        int[] pMarks = {44,73,96,21,23,33,67,99};
        double pavg = 0;
        for(int i = 0 ; i<pMarks.length ; i++){
            pavg += pMarks[i];
        }
        System.out.println("here's the average " + pavg/pMarks.length);

        //que 4

        int[][] mat1 = {{1, 4, 9} ,
                        {6,7 ,2}};
        int[][] mat2 = {{21,21,54},{21,56,93}};
        int[][] mat3 = {{0,0,0,},{0,0,0}};
        for (int i = 0 ; i<2 ; i++){
            for (int j = 0 ; j<3 ;j++){
                mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println(mat3);

    }
}
