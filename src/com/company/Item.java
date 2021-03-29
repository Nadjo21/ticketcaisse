package com.company;

public class Bill4 {

    private final String description;
    private  final double unitPrice;
    private  int quantity; // ici on ne met pas "final" , car la qtite va evoluer si on ajoute un meme plat au ticket

    public Item (String name, double unitPrice, int quantity) {
        this.description= name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;



    }



    public static void main(String[] args) {


    }
}
