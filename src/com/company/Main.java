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

        //on affiche les moyens de paiements autorisés
        if (calcul <=20){
            System.out.println("Paiement en Cb refusé");
        }else{
            System.out.println("Tous moyens de paiements autorisés");
        }

        //affichage du ticket
        System.out.println("Chez Xavier");
        sc.nextLine();
        System.out.println( "String plat"  + " " + quantite+ " " + calcul );
        sc.nextLine();
        System.out.println("a très bientôt");
        sc.nextLine();
    }
}
