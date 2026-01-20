package com.volume2;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]= sc.nextInt();
        int sum=solve(arr);
        System.out.println(sum);
        int sum2=solve2(arr);
        System.out.println(sum2);
    }

    public static int solve(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++) sum+=arr[k];
            }
        }
        return sum;
    }

    public static int solve2(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i]*(i+1)*(arr.length-i);
        }
        return sum;
    }
}
