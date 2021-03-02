package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // On declare un scanner pour lire les entrees de la console
        Scanner sc = new Scanner(System.in);

        // On affiche un message pour entrer le plat du client
        System.out.println("Entrez le plat du client : ");
        sc.nextLine();

        // On recupere le plat de la console
        String plat = sc.nextLine();

        // On entre le prix du plat
        System.out.println("Entrez le prix: ");
        int prix = sc.nextInt();
        sc.nextLine();

        // On entre la quantite du plat commandé
        System.out.println("Entrez la quantite: ");
        int quantite = sc.nextInt();
        sc.nextLine();

        // On calcul le total du ticket
        int calcul = (prix * quantite);
        System.out.println("Total: " + calcul);
        sc.nextLine();

    }
}
