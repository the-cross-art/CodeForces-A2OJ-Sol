package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Is_your_horseshoe_on_the_other_hoof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int count = 0;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if(al.contains(x)) {
                count++;
            } else {
                al.add(x);
            }
        }

        System.out.println(count);
    }
}
