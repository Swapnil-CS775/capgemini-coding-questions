package com.volume2;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[] arr=new int[m];
        for(int i=0;i<m;i++) arr[i]= sc.nextInt();


        int totalSum=n*(n+1)/2;
        for(int i=0;i<m;i++) totalSum-=arr[i];
        System.out.println(totalSum);
    }
}
