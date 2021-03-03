package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // On declare un scanner pour lire les entrees de la console
        Scanner sc = new Scanner(System.in);

        // On affiche un message pour entrer le plat du client
        System.out.println("Entrez le plat du client : ");
        String plat = sc.nextLine();


        // On entre le prix du plat
        System.out.println("Entrez le prix: ");
        float Prix = sc.nextFloat ();
        sc.nextLine();

        // On entre la quantite du plat commandé
        System.out.println("Entrez la quantite: ");
        int quantite = sc.nextInt();
        sc.nextLine();

        //on calcul un sous total
        float sousTotal = (Prix * quantite );
        System.out.println("Sous total: "+sousTotal);
        sc.nextLine();


       // demander s'il y a un autre plat
        System.out.println("Y a t il un autre plat?");
        String autrePlat = sc.nextLine();



        // On calcul le total du ticket
        float totalFinal = (sousTotal);

        //declaration variable ticket
        String ticket;
        ticket = (plat + " " + quantite + " " +"X"+" "+ Prix +" "+ sousTotal + "EUR");

        // condition et boucle  - si autre plat redemander les infos de prix et de quantite

        while (autrePlat.equals("oui")) {
            System.out.println("Entrez le plat du client : ");
            plat = sc.nextLine();
            System.out.println("Entrez le prix: ");
            Prix = sc.nextFloat();
            sc.nextLine();
            System.out.println("Entrez la quantite: ");
            quantite = sc.nextInt();
            System.out.println("Sous Total: " + (Prix * quantite));
            totalFinal = totalFinal + (Prix * quantite);
            System.out.println(totalFinal);
            ticket = ticket + (plat + " " + quantite+ " "+ Prix + " "+ sousTotal);
            System.out.println("Y a t il un autre plat?");
            autrePlat = sc.nextLine();
        }



        //affichage du ticket
        System.out.println("-----------------------");
        System.out.println("Restaurant Chez Xavier");

        System.out.println(ticket + " ");

        System.out.println("Total:  "+ totalFinal +" " + "EUR");

        System.out.println("Merci de votre visite.A très bientôt");


        //on affiche les moyens de paiements autorisés
        if (totalFinal <=20){
            System.out.println("Paiement en Cb refusé");
        }else{
            System.out.println("Tous moyens de paiements autorisés");
        }
        System.out.println("-----------------------");

    }
}
