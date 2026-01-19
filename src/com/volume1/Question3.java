package com.volume1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            set.add(arr[i]);
        }
        System.out.println(set.size());
    }
}
