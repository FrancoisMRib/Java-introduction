package com.cda4.classe2;

public class Batman extends Personnage implements Competence {

    public Batman(String nom, int vie, int attaque, int defense) {
            super(nom, vie, attaque, defense);
    }

    //méthoide redéfinie
    public void attaquer() {
        System.out.println("Attaque !");
    }
}
