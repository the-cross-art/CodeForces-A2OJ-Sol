package com.company;

import java.util.Scanner;

public class Cupboards {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[n];
        int count =0;
        int count1 =0;
        for(int i =0 ; i<n ; i++){
            arr[i] = sc.nextInt();
            arr1[i] = sc.nextInt();
            if(arr[i] ==0){
                count++;
            }
            if(arr1[i] == 0){
                count1++;
            }
        }
        int a = Math.min(count , n-count);
        int b = Math.min(count1 , n-count1);
        System.out.println(a+b);

    }


}
