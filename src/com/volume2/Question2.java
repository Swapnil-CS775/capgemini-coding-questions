package com.volume2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        int[] arr=new int[26];
        for(char c:str.toCharArray()) arr[c-'a']=arr[c-'a']+1;
        StringBuilder ans=new StringBuilder();
        for(char ch:str.toCharArray()){
            if(arr[ch-'a']!=-1) {
                ans.append(ch);
                ans.append(arr[ch - 'a']);
                arr[ch-'a']=-1;
            }
        }
        System.out.println(ans.toString());
    }
}
