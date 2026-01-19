package com.volume1;

import java.util.Arrays;
import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        StringBuilder ans=new StringBuilder();
        String[] arr=str.split("\\s");

        for(String s:arr){
            switch (s){
                case "one":
                    ans.append("1");
                    break;
                case "two":
                    ans.append("2");
                    break;
                case "three":
                    ans.append("3");
                    break;
                case "four":
                    ans.append("4");
                    break;
                case "five":
                    ans.append("5");
                    break;
                case "six":
                    ans.append("6");
                    break;
                case "seven":
                    ans.append("7");
                    break;
                case "eight":
                    ans.append("8");
                    break;
                case "nine":
                    ans.append("9");
                    break;
                case "zero":
                    ans.append("0");
            }
        }

        System.out.println(ans.toString());
    }
}
