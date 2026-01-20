package com.volume2;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r= sc.nextInt();
        int c= sc.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]= sc.nextInt();
            }
        }

        int sum=0;
        for(int i=0;i<r;i++){
            sum+=arr[i][i];
            sum+=arr[i][c-i-1];
        }
        System.out.println(sum);
    }
}
