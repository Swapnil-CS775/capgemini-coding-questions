package com.volume2;

import java.util.Arrays;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int maxLen=0;
        int[] lastSeen=new int[256];
        Arrays.fill(lastSeen,-1);
        int left=0;

        for(int right=0;right<str.length();right++){
            char c=str.charAt(right);
            if(lastSeen[c]>=left){
                left=lastSeen[c]+1;
            }
            lastSeen[c]=right;
            maxLen=Math.max(maxLen,right-left+1);
        }
        System.out.println(maxLen);
    }
}
