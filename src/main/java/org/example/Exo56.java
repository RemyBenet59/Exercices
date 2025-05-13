package org.example;

import java.util.Scanner;

public class Exo56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ecris cmt ça va avec une voix d'ado");
        String voixDado = scanner.nextLine();
        System.out.println(voixDado);

        System.out.println("en minuscule :" +voixDado.toLowerCase());
        System.out.println("en majuscule :" +voixDado.toUpperCase());


        char[] lettres = voixDado.toLowerCase().toCharArray();

        for (int i = 0; i < lettres.length; i++) {
            System.out.print(lettres[i]);
            if (i < lettres.length - 1) {
                System.out.print(",");



            }
        }
    }
}
