package com.company;
import FirstPackage.*;

public class FirstClass {

    public static void main(String[] s) {

        SecondClass o = new SecondClass();

        int i, j;
        for (i = 1; i <= 8; i++) {
            for (j = 1; j <= 8 ; j++) {
                o.aSetter(i);
                o.bSetter(j);
                System.out.println(o.multiplication());
                System.out.println(" ");
            }
            System.out.println();
        }
    }
}
