package com.volume1;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }

        int count=0;
        for(int i=0;i<arr.length;i++){
            String s=arr[i];
            boolean isSpecial=true;

            boolean seenB=false;
            int aCount=0,bCount=0;

            for(char c:s.toCharArray()){
                if(c=='a'){
                    if(seenB){
                        isSpecial=false;
                        break;
                    }
                    aCount++;
                }else if(c=='b'){
                    seenB=true;
                    bCount++;
                }else{
                    isSpecial=false;
                    break;
                }
            }
            if(isSpecial && aCount>0 && bCount>0) count++;
        }
        System.out.println(count);
    }
}
