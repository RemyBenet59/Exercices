package org.example;

import java.util.Scanner;

public class Exo54 {
    public static void main(String[] args) {
int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("combien d'age avez vous? ");
        age = scanner.nextInt();

       boolean estMajeur =   age >= 18 ;
        System.out.println(estMajeur);
    }
}
