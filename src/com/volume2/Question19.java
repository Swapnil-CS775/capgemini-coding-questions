package com.volume2;

import java.util.*;

public class Question19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]= sc.nextInt();
        int k = sc.nextInt();

        Arrays.sort(arr);
        System.out.println(arr[k-1]);

        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        int i=0;
        for(int a:arr){
            if(i<k) {
                maxHeap.add(a);
                i++;
            }else {
                if(!maxHeap.isEmpty() && maxHeap.peek()>a){
                    maxHeap.poll();
                    maxHeap.add(a);
                }
            }
        }
        System.out.println(maxHeap.peek());

    }
}
