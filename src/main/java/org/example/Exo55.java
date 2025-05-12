package org.example;

import java.util.Scanner;

public class Exo55 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println(" tapez le rayon du cone ");
            double rayon = scanner.nextInt();
        System.out.println(" tapez la hauteur du cone ");
        double hauteur = scanner.nextInt();

        double volume = (1.0 / 3) * Math.PI * Math.pow(rayon, 2) * hauteur;

        double volumeArrondi = Math.round(volume * 100.0) / 100.0;


        System.out.printf("Le volume du cône est de "+ volumeArrondi + "cm3");






        }
}
