package com.volume2;

import java.util.Arrays;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row= sc.nextInt();
        int col= sc.nextInt();
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        int top=0,bottom=row-1,left=0,right=col-1;

        while (top<=bottom && left<=right){
            for(int i=left;i<=right;i++) System.out.print(arr[top][i]+" ");
            top++;
            for(int i=top;i<=bottom;i++) System.out.print(arr[i][right]+" ");
            right--;
            if(left<=right){
                for(int i=right;i>=left;i--) System.out.print(arr[bottom][i]+" ");
                bottom--;
            }
            if(top<=bottom) {
                for (int i = bottom; i >= top; i--) System.out.print(arr[i][left]+" ");
                left++;
            }
        }
    }
}

/*
*
4 4
1 2 3 4
5 6 7 8
9 11 12 13
14 15 16 17
* */