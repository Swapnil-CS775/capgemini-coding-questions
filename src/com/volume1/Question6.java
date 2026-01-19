package com.volume1;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);

        if(c>='a') System.out.println((char)(c-32));
        else System.out.println((char)(c+32));
    }
}
