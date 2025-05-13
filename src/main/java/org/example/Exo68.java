package org.example;

import java.util.Scanner;

public class Exo68 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" tapez votre age ");
        int age = scanner.nextInt();

        if( age >= 18 ) {
            System.out.println(" vous pouvez entrer dans le club");
        }else{
            System.out.println( "rentre chez ta mere minus ");
        }
    }
}
