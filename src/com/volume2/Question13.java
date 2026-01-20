package com.volume2;

import java.util.Arrays;
import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        String[] arr=str.split("\\s+");
        int s=0,e=arr.length-1;
        while (s<e){
            String temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        String ans=String.join(" ",arr);
        System.out.println(ans);


    }
}
