package com.volume2;

import java.util.Arrays;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int rot= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]= sc.nextInt();
        System.out.println(Arrays.toString(arr));

        int optRot=rot%n;
        rev(0,n-1,arr);
        rev(0,optRot-1,arr);
        rev(optRot,n-1,arr);
        System.out.println(Arrays.toString(arr));

        /* 1 2 3 4 5 6
        * rotate by 2
        * ans = 5 6 1 2 3 4
        * r1= 6 5 4 3 2 1
        * r2= 5 6 4 3 2 1
        * r3= 5 6 1 2 3 4
        *  */

    }

    public static void rev(int s,int e,int[] arr){
        while (s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}
