package com.cda4.classe2;

public class Batman extends Personnage implements Competence {

    public Batman(String nom, int vie, int attaque, int defense) {
            super(nom, vie, attaque, defense);
    }

    //méthoide redéfinie
    public void attaquer(Personnage objet) {
        if(this.setAttaque()-objet.getDefense() > 0) {
            objet.setVie(this.getAttaque()-objet.getDefense()) ;
        }
    }
}
