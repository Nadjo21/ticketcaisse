package com.company;

import java.util.Collection;
import java.util.Scanner;

public class Plat {


    public static void main(String[] args) {


        // On declare un scanner pour lire les entrees de la console
        Scanner sc = new Scanner(System.in);

        //1 Declaration

        Plat plat1;
        Plat plat2;
        Collection<Plat> maListePlat;//declaration liste de plats

//Instanciation
        plat1 = new Plat("saumon");
        plat2 = new Plat("riz");

//ajout d'un plat

        System.out.println("quel est le prochain plat?:");
        String prochainPlat = sc.nextLine();

        maListePlat.add(prochainPlat);


    }
}