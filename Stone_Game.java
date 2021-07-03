package com.company;

import java.util.Scanner;

public class Stone_Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tt =0 ; tt < t ; tt++) {
            int n = sc.nextInt();
            int[] a = new int[n];

            int ma=Integer.MIN_VALUE;
            int mi=Integer.MAX_VALUE;
            for (int i = 0; i < n; i++)
            {
                a[i] = sc.nextInt();
                ma=Math.max(ma,a[i]);
                mi=Math.min(mi,a[i]);
            }
            int lma=0,lmi=0;

            for (int i = 0; i < n; i++)
            {
                if(a[i]==ma)
                    lma=i+1;

                if(a[i]==mi)
                    lmi=   i+1;
            }

            int rma=n-lma+1;
            int rmi=n-lmi+1;

            int a1=Math.max(rma,rmi);
            int a2=Math.max(lma,lmi);

            int a3=Math.min(lma+rmi,rma+lmi);

            System.out.println(Math.min(a1,Math.min(a2,a3)));

        }
    }
}
