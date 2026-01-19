package com.volume1;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l= sc.nextInt();
        int s= sc.nextInt();

        int lArea=l*l*l;
        int sArea=s*s*s;
        System.out.println(lArea/sArea);
    }
}
