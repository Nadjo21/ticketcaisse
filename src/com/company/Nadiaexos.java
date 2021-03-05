package com.company;

import java.util.Scanner;

public class Nadiaexos { public static void main(String[] args) {





    // On declare un scanner pour lire les entrees de la console
    Scanner sc = new Scanner(System.in);

    //declarer quelques variables

    System.out.println("quel est ton prenom: ");
    String prenom =sc.nextLine();



    System.out.print("quel est ton age: ");
    int age = sc.nextInt();
    sc.nextLine();

    int tailleCm = 162;
    System.out.print("quel est ta taille: ");
    int taille = sc.nextInt();
    sc.nextLine();

    System.out.print("quelle est ta couleur preferee: ");
    String couleur = sc.nextLine();
    System.out.println(couleur);





    if (couleur != "bleu") {
        System.out.println("ko");
    }else{
        System.out.println("ok");
    }


    if(3==3)
        System.out.println("vrai");






    //Calcul de prix TTC



    // annee bissextile




    sc.close();
}
}

