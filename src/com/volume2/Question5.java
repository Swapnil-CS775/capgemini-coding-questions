package com.volume2;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++) arr[i][j]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(4*arr[i][0]+2*arr[i][1]);
        }
    }
}
