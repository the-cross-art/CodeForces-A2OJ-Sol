package com.company;

import java.util.Scanner;

public class Tram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max=Integer.MIN_VALUE;
        int temp=0;
        for(int i=0; i<n ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            temp=temp-a;
            temp=temp+b;
            if(temp>=max){
                max=temp;
            }

        }
        System.out.println(max);
    }
}
