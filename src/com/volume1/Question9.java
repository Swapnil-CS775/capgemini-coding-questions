package com.volume1;

import java.util.ArrayList;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<int[]>list=new ArrayList<>();
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            int a= sc.nextInt();
            int b= sc.nextInt();
            list.add(new int[] {a,b});
        }

        for(int i=0;i<list.size();i++){
            System.out.println(Math.sqrt((Math.pow(list.get(i)[0],2))+(Math.pow(list.get(i)[1],2))));
        }
    }
}
