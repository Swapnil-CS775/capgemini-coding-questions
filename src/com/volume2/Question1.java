package com.volume2;

import java.util.HashMap;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int ele:arr){
            if(map.containsKey(ele)){
                map.put(ele,map.getOrDefault(ele,1)+1);
            }else {
                map.put(ele,1);
            }
        }
        System.out.println(map);
    }
}
