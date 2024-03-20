package com.cda4.classe;

public class Guerrier extends Personnage {

    private int bonusDefense ;

    public int getBonusDefense() {
        return bonusDefense;
    }

    public void setBonusDefense(int bonusDefense) {
        this.bonusDefense = bonusDefense;
    }

    public Guerrier(String nom, int vie, int attaque, int defense, int bonusDefense) {
        this.bonusDefense = bonusDefense ;
    }

    public void attaquer(Personnage personnage) {
//        cible.setVie() = cible.setVie() - (this.setAttaque() - cible.getDefense());
        //cas où on déclenche une défense critique
        if((Math.random() * 100) > 94.99) {
            this.setVie(this.getVie() + this.bonusDefense);
        }
        //cas où on ne déclenche pas une défense critique
        super.attaquer(personnage);
    }

}
