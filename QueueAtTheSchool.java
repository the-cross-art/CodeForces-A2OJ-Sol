package com.company;

import java.util.Scanner;

public class QueueAtTheSchool {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        String val = sc.nextLine();
        int i=0;
        String[] words = val.split("");
        for(int j=0;j<b;j++){
            i=0;
            while(i<= words.length){
                if(i< words.length-1 && words[i].equals ("B") && words[i+1].equals ("G")){
                    String temp = words[i];
                    words[i] = words[i+1];
                    words[i+1] = temp;
                    i=i+2;
                }
                else{
                    i++;
                }
            }
        }
        for(int x=0;x< words.length;x++){
            System.out.print(words[x]);
        }

    }
}
