package com.cda4.classe2;

public class Batman extends Personnage implements Competence {

    public Batman(String nom, int vie, int attaque, int defense) {
            super(nom, vie, attaque, defense);
    }

    //méthode redéfinie
    @Override
    public void attaquer(Personnage objet) {
        if(this.getAttaque()-objet.getDefense() >0) {
            objet.setVie(this.getAttaque()-objet.getDefense());
        }
    }
}
