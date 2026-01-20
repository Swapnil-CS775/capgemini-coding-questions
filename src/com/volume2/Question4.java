package com.volume2;

import java.util.Map;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="a^3+a^2*b+2a^2*b+2a*b^2+a*b^2+b^3";
        int a= sc.nextInt();
        int b= sc.nextInt();
        String equ="a^3 + 3a^2b + 3ab^2 + b^3";
        int ans=0;
        ans=giveCube(a)+giveCube(b) + 3*giveSquare(a)*b + 3*a*giveSquare(b);
        System.out.println(ans);
    }

    public static int giveSquare(int x){
        return (int) Math.pow(x,2);
    }

    public static int giveCube(int x){
        return (int) Math.pow(x,3);
    }
}
