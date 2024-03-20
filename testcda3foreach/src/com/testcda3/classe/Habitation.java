package com.testcda3.classe;

public class Habitation {

    private String name;
    private double length;
    private double width;
    private int nbrEtage;

    //constructeurs
    public Habitation() {};

    public int getNbrEtage() {
        return nbrEtage;
    }

    public void setNbrEtage(int nbrEtage) {
        this.nbrEtage = nbrEtage;
    }

    public Habitation(String name, double length, double width, int nbrEtage) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.nbrEtage = nbrEtage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public double toSurface() {
//        double surface = 0;
//        surface = this.length * this.width;
//        return surface;
        return (this.length * this.width)*this.nbrEtage;
    }

    public String phrase() {
        return "L'habitation qui se nomme " + this.getName() + " a une surface de " + this.toSurface() + "m2";

    }
//    public void phrase() {
//        System.out.println("L'habitation" + this.name + "a une surface de " + toSurface() + "m2");
//    }

}
