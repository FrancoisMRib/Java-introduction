package com.cda4.classe;

public class Partie {

    private Personnage joueur1;
    private Personnage joueur2;
    private int nbrTour ;

    public Personnage getJoueur1() {
        return joueur1;
    }

    public void setJoueur1(Personnage joueur1) {
        this.joueur1 = joueur1;
    }

    public Personnage getJoueur2() {
        return joueur2;
    }

    public void setJoueur2(Personnage joueur2) {
        this.joueur2 = joueur2;
    }

    public int getNbrTour() {
        return nbrTour;
    }

    public void setNbrTour(int nbrTour) {
        this.nbrTour = nbrTour;
}

public Partie(Personnage joueur1, Personnage joueur2, int nbrTour) {
    this.joueur1 = joueur1;
    this.joueur2 = joueur2;
    this.nbrTour = nbrTour;
}

public String lancerPartie() {
    while (nbrTour > 0 && this.joueur1.getVie() > 0 && this.joueur2.getVie() > 0) {
        //Lancer l'attaque du perso1 sur le perso2
        this.joueur1.attaquer(this.joueur2);
        //Lancer l'attaque du perso2 sur le perso1
        this.joueur2.attaquer(this.joueur1);
        //Décrémenter le nombre de tours
        this.nbrTour--;
    }
    //condition si le joueur 1 gagne
    if (this.joueur2.getVie() < 0) {
        return this.joueur1.getNom();
    }
    //condition si le joueur 2 gagne
    if (this.joueur1.getVie() < 0) {
        return this.joueur2.getNom();
    }
    return "Egalité";
}
}
