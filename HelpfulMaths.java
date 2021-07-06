package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        inp = inp.replace("+","");
        char[] inp1 = inp.toCharArray();
        Arrays.sort(inp1);
        for(int i=0;i<inp1.length;i++){
            System.out.print(inp1[i]);
            if(i<inp1.length-1){
                System.out.print("+");
            }
        }
    }
}
