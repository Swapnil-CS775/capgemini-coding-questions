package com.volume1;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        int ctr=0;
        for(int i=str.length()-1;i>=0;i--){
            int c=str.charAt(i);
            if(!(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U')){
                ctr++;
                if(ctr==3) {
                    System.out.println((char)c);
                    break;
                }
            }
        }
    }
}
