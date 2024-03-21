package com.cda4.classe2;

public class Flash extends Personnage implements Competence {

    public Flash(String nom, int vie, int attaque, int defense) {

        super(nom, vie, attaque, defense);
    }
    public void attaquer(Personnage objet) {
        if(this.getAttaque()-objet.getDefense() >0) {
            objet.setVie(this.getAttaque()-objet.getDefense()) ;
        }
    }

}
