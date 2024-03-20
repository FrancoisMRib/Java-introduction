package com.cda4.classe;

public class Chat extends Animal {
    //système d'héritage
    private int age ;
    public Chat(String nom, int taille, int poids, int age) {
        super(nom, taille, poids);
        this.age = age ;
    }

    @Override
    public void dormir() {
        System.out.println(super.getNom() + "dort");
    }
    public void dormir (int duree) {
        System.out.println(super.getNom() + "dort pendant" + duree);
    }
}
