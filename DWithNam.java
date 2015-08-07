package com.company;

import java.util.Scanner;

public class Main {
    public static int n;
    public static void print(int i,int extra)
    {
        for(int j=1;j<=n-i+extra;j++)
            System.out.print(" ");
        for(int j=1;j<=2*i-1;j++)
            System.out.print("*");

        System.out.println("");
    }
    public static void main(String[] args) {
        // write your code here

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        n = s.nextInt();
        System.out.print("Enter the name: ");
        String nam=s.next();
        int t=((2*n-1)-nam.length())/2;
        int sp=0,extra=0;
        if(t>0){
            sp=t-1;extra--;
        }
        else
            extra=t*-1;
        for (int i = 1;i<=n-1; i++)
            print(i,extra);
        String st="";
        for(int i=0;i<sp;i++)
            st+=" ";
        nam=st+nam;
        System.out.println(nam);
        // Diamond include below
        for (int i=n-1;i>=1;i--)
            print(i,extra);
    }
}

