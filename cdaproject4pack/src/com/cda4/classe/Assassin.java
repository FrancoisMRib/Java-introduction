package com.cda4.classe;

public class Assassin extends Personnage {
    private int bonusAttaque ;

    public Assassin() {};

    public int getBonusAttaque() {
        return bonusAttaque;
    }

    public void setBonusAttaque(int bonusAttaque) {
        this.bonusAttaque = bonusAttaque;
    }

    public Assassin(String nom, int vie, int attaque, int defense, int bonusAttaque) {
        super(nom, vie, attaque, defense);
        this.bonusAttaque = bonusAttaque ;
    };

    public void attaquer(Personnage personnage) {

        if ((Math.random() * 100)>94.99) {
            if((this.getAttaque() + this.bonusAttaque - personnage.getDefense()) > 0) {
                personnage.setVie(personnage.getVie() - (this.getAttaque() + this.bonusAttaque - personnage.getDefense()));

            }
        }
        else {
            super.attaquer(personnage);
        }
    }
}
