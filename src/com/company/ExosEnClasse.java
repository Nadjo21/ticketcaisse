package com.company;

import java.util.Scanner;

public class ExosEnClasse {


    private static void exo1(Scanner sc) {

        //declarer quelques variables

        System.out.println("quel est ton prenom: ");
        String prenom = sc.nextLine();

        System.out.print("quel est ton age: ");
        int age = sc.nextInt();
        sc.nextLine();

        int tailleCm = 162;
        System.out.print("quel est ta taille: ");
        int taille = sc.nextInt();
        sc.nextLine();


    }

    private static void exo2(Scanner sc) {

        //pourquoi rejoignez vous la formation
        System.out.println("Pourquoi rejoignez-vous la formation: ");
        sc.nextLine();
        sc.nextLine();
        sc.nextLine();


    }

    private static void exo3(Scanner sc) {

        //afficher la factorielle d'un nombre

        int n = sc.nextInt();

        int factor= sc.nextInt();

    }

    public static void main(String[] args) {


        // On declare un scanner pour lire les entrees de la console
        Scanner sc = new Scanner(System.in);

        System.out.println("entrez le numero de l'exercice");
        int n = sc.nextInt();

        //Utilisation de l'instruction Switch
        switch (n) {
            case 1: {
                exo1(sc);
                break;
            }
            case 2: {
                exo2(sc);
                break;
            }
                case 3: {
                    exo3(sc);
                    break;
            }
            default: {
                System.out.println("il faut rentrer une valeur");
            }
        }


        // on ferme le scanner
        sc.close();
    }
}








