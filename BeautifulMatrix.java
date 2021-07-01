package com.company;

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[5][5];
        int x=1,y=1;
        int count=0;
        outerloop:
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                array[i][j] = sc.nextInt();

                if(array[i][j]==1){
                    break outerloop;
                }
                y++;
            }
            y=1;
            x++;
        }
        while(x!=3){
            if(x<3){
                count++;
                x++;
            }
            if(x>3){
                count++;
                x--;
            }
        }
        while(y!=3){
            if(y<3){
                count++;
                y++;
            }
            if(y>3){
                count++;
                y--;
            }
        }
        System.out.println(count);

    }
}
