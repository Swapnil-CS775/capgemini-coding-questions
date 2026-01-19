package com.volume1;

import java.util.HashSet;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] A=new int[n];
        int[] B=new int[n-1];
        int[] C=new int[n-2];
        for(int i=0;i<n;i++) A[i]= sc.nextInt();
        for(int i=0;i<n-1;i++) B[i]= sc.nextInt();
        for(int i=0;i<n-2;i++) C[i]= sc.nextInt();

        HashSet<Integer>set=new HashSet<>();
        for (int j : B) set.add(j);
        int ans1=-1;
        for(int ele:A){
            if(set.contains(ele)) continue;
            else {
                ans1=ele;
                System.out.println("X : "+ans1);
                break;
            }
        }

        HashSet<Integer>set2=new HashSet<>();
        for (int j : C) set2.add(j);
        int ans2=-1;
        for(int ele:B){
            if(set2.contains(ele)) continue;
            else {
                ans2=ele;
                System.out.println("X : "+ans2);
                break;
            }
        }
    }
}
