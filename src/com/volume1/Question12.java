package com.volume1;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();
        int d=sc.nextInt();

        int ans=0;
        if(a<0) ans+=a;
        if(b<0) ans+=b;
        if(c<0) ans+=c;
        if(d<0) ans+=d;

        System.out.println(ans);
    }
}
