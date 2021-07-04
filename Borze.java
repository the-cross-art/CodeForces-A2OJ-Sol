package com.company;

import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine();
        int j = 0;
        String[] words = val.split("");
        String[] val1 = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(".")) {
                val1[j] = "0";
                j++;
            } else if (words[i].equals("-") && words[i + 1].equals(".")) {
                val1[j] = "1";
                j++;
                i++;
            } else {
                val1[j] = "2";
                j++;
                i++;
            }
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < val1.length; i++) {
            while (val1[i] == "0" || val1[i] == "1" || val1[i] == "2") {
                sb.append(val1[i]);
                break;
            }
        }
        String str = sb.toString();
//        int number = Integer.parseInt(str);
        System.out.println(str);
//        for (int i = 0; i <val1.length; i++) {
//            System.out.print(val1[i]);
//        }

    }
}
