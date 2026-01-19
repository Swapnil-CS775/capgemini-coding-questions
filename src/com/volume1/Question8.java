package com.volume1;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ans=0;
        for(int i=1;i<=num;i++){
            if(num%i==0) ans+=i;
        }
        System.out.println(ans);
    }
}
