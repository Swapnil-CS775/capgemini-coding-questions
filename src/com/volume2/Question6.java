package com.volume2;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]= sc.nextInt();
        int max=Integer.MIN_VALUE;
        for(int ele:arr) if(max<ele) max=ele;
        System.out.println(max);
    }
}
