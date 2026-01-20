package com.volume2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        int[] arr=new int[m];
        int[] arr1=new int[n];
        for(int i=0;i<m;i++) arr[i]=sc.nextInt();
        for(int i=0;i<n;i++) arr1[i]=sc.nextInt();

        HashSet<Integer> set=new HashSet<>();
        for(int ele:arr) set.add(ele);
        for(int i=0;i<arr1.length;i++){
            if(set.contains(arr1[i])) System.out.print(arr1[i]+" ");
        }
    }
}
