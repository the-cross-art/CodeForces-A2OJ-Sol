package com.company;

import java.util.Scanner;

public class I_love_username {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minc=0,maxc=0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            if(i==0){
                min=a[0]; max=a[0];

            }
            if(i>0){
                if(min>a[i]){
                    min=a[i];
                    minc++;
                }
                else if(max<a[i]){
                    max=a[i];
                    maxc++;
                }
            }
        }
        System.out.println(minc+maxc);
        sc.close();
    }
}
