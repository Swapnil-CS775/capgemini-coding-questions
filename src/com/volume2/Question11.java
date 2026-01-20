package com.volume2;

import java.util.Arrays;
import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n=sc.nextInt();

        int[] arr1=new int[m];
        int[] arr2=new int[n];

        for(int i=0;i<m;i++) arr1[i]=sc.nextInt();
        for(int i=0;i<n;i++) arr2[i]= sc.nextInt();

        int[] ans=new int[m+n];
        int i=0,j=0,k=0;
        if(arr1[i]<arr2[j]){
            ans[k]=arr1[i];
            i++;
        }else{
            ans[k]=arr2[j];
            j++;
        }
        k++;

        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                ans[k]=arr1[i];
                i++;
            }else{
                ans[k]=arr2[j];
                j++;
            }
            k++;
        }

        while(i<m){
            ans[k]=arr1[i];
            i++;
            k++;
        }

        while(j<n){
            ans[k]=arr2[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(ans));
    }
}
