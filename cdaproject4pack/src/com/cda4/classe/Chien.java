package com.cda4.classe;

public class Chien extends Animal implements Comportement {

    public Chien(String nom, int taille, int poids) {
        super(nom, taille, poids);
    }

    public void marcher() {
        System.out.println("Le chien marche");
    }

    public void stopper() {
        System.out.println("Le chien marche");
    }

    public void manger() {
        System.out.println("Le chien marche");
    }

}
