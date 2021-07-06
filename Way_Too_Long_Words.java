package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Way_Too_Long_Words {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String str = sc.next();
            String[] words = str.split("");
            if(str.length()>10){
                System.out.println(words[0]+(str.length()-2)+words[str.length()-1]);
            }else{
                System.out.println(str);
            }
        }
    }
}
