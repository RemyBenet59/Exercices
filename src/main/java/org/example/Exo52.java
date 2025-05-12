package org.example;

public class Exo52 {
    public static void main(String[] args) {
        int a, b , c  ;
        a = 5;
        b = 3;

        System.out.println( "a est = " + a );
        System.out.println( "b est = " + b );

        System.out.println("permutation");

        c=a;
        a=b;
        b=c;

        System.out.println( "a est = " + c );
        System.out.println( "b est = " + a );

    }
}
