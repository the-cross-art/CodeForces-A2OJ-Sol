package com.company;

import java.util.Scanner;

public class LightsOut {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        int low=0,up=0;
        char[] ch = new char[word.length()];

        // Copy character by character into array
        for (int i = 0; i < word.length(); i++) {
            ch[i] = word.charAt(i);
        }
//        for (char c : ch) {
//            System.out.println(c);
//        }

        for (int i = 0; i < word.length(); i++) {
            if(Character.isLowerCase(ch[i])) {
                low++;
            }
            if(Character.isUpperCase(ch[i])) {
                up++;
            }
        }
        if(low>=up){
            System.out.println(word.toLowerCase());
        }else{
            System.out.println(word.toUpperCase());
        }
    }
}
