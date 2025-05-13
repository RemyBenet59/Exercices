package org.example;

import java.util.Scanner;

public class Exo57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" tapez la longeur du coté du carré ");
        double cote = scanner.nextInt();

        double perimetre = cote*4;
        long perimetreArrondi = Math.round(perimetre);

        System.out.println(" le perimetre du carré est  " + perimetreArrondi + "cm");

        double air = cote*cote;

        long airArrondi = Math.round(air);
        System.out.println(" l'air du du carré " + airArrondi+ "cm");
    }
}
