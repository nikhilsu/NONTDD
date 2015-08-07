package com.company;

import java.util.Scanner;

public class Main {
    public static int n;
    public static void print(int i)
    {
        for(int j=1;j<=n-i;j++)
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

        for (int i = 1;i<=n; i++)
            print(i);
        // Diamond include below
        for (int i=n-1;i>=1;i--)
            print(i);
    }
}

