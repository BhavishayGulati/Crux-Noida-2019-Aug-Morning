package com.company.Lect3;


import java.util.Scanner;

public class pattern1 {     // program to print the star pattern

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);

        int n=s.nextInt();

        int row=1;

        while(row<=n){      // loop for the no. of rows in the pattern

            int col=1;

            while(col<=row){        // loop for the no. of columns in the pattern
                System.out.print("*"+"\t");
                col=col+1;
            }

            System.out.println();
            row=row+1;
        }
    }
}
