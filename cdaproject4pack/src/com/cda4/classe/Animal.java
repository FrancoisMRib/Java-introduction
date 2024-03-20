package com.cda4.classe;

public class Animal {

    private String nom;

    private int taille;

    private int poids ;

    public Animal(){};

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public Animal(String nom, int taille, int poids) {
        this.nom = nom;
        this.taille = taille;
        this.poids = poids;
    }

    public void dormir() {
        System.out.println("L'animal" + this.nom + " dort.");
    }


}
