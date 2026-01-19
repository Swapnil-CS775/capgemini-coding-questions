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
        solve(A,B,C);
        solve2(A,B,C);
    }


    public static void solve(int[] A,int[] B,int[] C){
        int ans1=A[0];
        for(int i=1;i<A.length;i++) ans1=ans1 ^ A[i];
        for(int i=0;i<B.length;i++) ans1=ans1 ^ B[i];
        int ans2=B[0];
        for(int i=1;i<B.length;i++) ans2=ans2 ^ B[i];
        for(int i=0;i<C.length;i++) ans2=ans2 ^ C[i];

        System.out.println("X1 : "+ans1);
        System.out.println("X2 : "+ans2);
    }

    public static void solve2(int[] A,int[] B,int[] C){
        int ans1=A[0];
        for(int i=1;i<A.length;i++) ans1=ans1 + A[i];
        for(int i=0;i<B.length;i++) ans1=ans1 - B[i];
        int ans2=B[0];
        for(int i=1;i<B.length;i++) ans2=ans2 + B[i];
        for(int i=0;i<C.length;i++) ans2=ans2 - C[i];

        System.out.println("X1 : "+ans1);
        System.out.println("X2 : "+ans2);
    }
}
