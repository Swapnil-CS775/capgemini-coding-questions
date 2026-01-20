package com.volume2;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        int[] freq=new int[n];

        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        for(int i=0;i<n;i++){
            freq[arr[i]]++;
            if(freq[arr[i]]>1){
                System.out.println(arr[i]);
                break;
            }
        }

        int ActualSum=n*(n-1)/2;
        int currentSum=0;
        for(int i=0;i<n;i++){
           currentSum+=arr[i];
        }

        System.out.println(currentSum-ActualSum);
    }
}
