package com.volume1;

import java.util.ArrayList;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextByte();
        int k= sc.nextInt();
        ArrayList<int[]>arrayList=new ArrayList<>();
        for(int i=0;i<k;i++){
            int[] arr=new int[3];
            arr[0]=sc.nextInt();
            arr[1]=sc.nextInt();
            arr[2]=sc.nextInt();
            arrayList.add(arr);
        }
        int[] arr=new int[size];
        for (int[] a : arrayList) {
            int l = a[0];
            int r = a[1];
            int val = a[2];
            write(l - 1, r - 1, val,arr);
        }

        int ans=findMax(arr);
        System.out.println(ans);
    }

    public static void write(int s,int e,int val,int[] arr){
        for(int i=s;i<=e;i++){
            arr[i]+=val;
        }
    }

    public static int findMax(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int ele:arr){
            if(ele>max) max=ele;
        }
        return max;
    }
}
