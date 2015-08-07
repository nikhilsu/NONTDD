package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = s.nextInt();
        for (int i = 1;i<=n; i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print("*");

            System.out.println("");
        }
    }
}
