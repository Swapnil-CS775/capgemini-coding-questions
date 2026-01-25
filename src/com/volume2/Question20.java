package com.volume2;

import java.util.Arrays;
import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[][] arr=new int[n][n];
        int[][] ans=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) arr[i][j]= sc.nextInt();
        }

        for(int i=0;i<n;i++){
            System.out.print(Arrays.toString(arr[i])+" ");
            System.out.println();
        }
        System.out.println();

        int l=2;
        for(int i=0;i<n;i++){
            int k=0;
            for(int j=0;j<n;j++) {
                ans[k][l]=arr[i][j];
                k++;
            }
            l--;
        }

        for(int i=0;i<n;i++){
            System.out.print(Arrays.toString(ans[i])+" ");
            System.out.println();
        }

    }
}
