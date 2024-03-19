import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
//        int nbr = 20;
//        int nbr2 = 35;
//        if(nbr < nbr2) {
//            System.out.println("nbr est plus grand que nbr2");
//        } else if (nbr == nbr2) {
//            System.out.println("nbr et nbr2 sont de valeur équivalente");
//        } else {
//            System.out.println("nbr est plus petit que nbr2");
//        }
//        System.out.println("Here comes the sun");
        heureV2();
    }

    public static void produit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez indiquer le premier nombre");
        float nbr1 = scanner.nextFloat();
        System.out.println("Veuillez indiquer le deuxième nombre");
        float nbr2 = scanner.nextFloat();
        if ((nbr1 < 0) && (nbr2 > 0)) {
            System.out.println("Le produit des deux nombres est négatif");
        } else if ((nbr1 > 0) && (nbr2 > 0)) {
            System.out.println("Le produit des deux nombres est positif");
        } else if ((nbr1 < 0) && (nbr2 < 0)) {
            System.out.println("Le produit des deux nombres est positif");
        } else if ((nbr1 > 0) && (nbr2 < 0)) {
            System.out.println("Le produit des deux nombres est négatif");
        }

    }

    public static void produitNotNul() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez indiquer le premier nombre");
        float nbr1 = scanner.nextFloat();
        System.out.println("Veuillez indiquer le deuxième nombre");
        float nbr2 = scanner.nextFloat();
        if ((nbr1 < 0) && (nbr2 > 0)) {
            System.out.println("Le produit des deux nombres est négatif");
        } else if ((nbr1 > 0) && (nbr2 > 0)) {
            System.out.println("Le produit des deux nombres est positif");
        } else if ((nbr1 < 0) && (nbr2 < 0)) {
            System.out.println("Le produit des deux nombres est positif");
        } else if ((nbr1 > 0) && (nbr2 < 0)) {
            System.out.println("Le produit des deux nombres est négatif");
        } else if ((nbr1 == 0) || (nbr2 == 0)) {
            System.out.println("Le produit des deux nombres est nul");
        }
    }

    public static void age() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez indiquer votre âge");
        int nbr = scanner.nextInt();
        if(nbr<6) {
            System.out.println("Tu n'as pas l'âge de jouer au foot !");
        } else if ((nbr >= 6) && (nbr <= 7)) {
            System.out.println("Poussin");
        } else if ((nbr >= 8) && (nbr <= 9)) {
            System.out.println("Pupille");
        } else if ((nbr >= 10) && (nbr <= 11)) {
            System.out.println("Minime");
        } else {
            System.out.println("Cadet");
        }

    }

    //CORRECTION AVEC une STRING

    public static String ageV2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("veuillez saisir l'age de l'enfant");
        int age = scanner.nextInt();
        if(age >= 12) {
            return  "Cadet";
        }
        if(age >= 10) {
            return "Minime";
        }
        if(age >= 8) {
            return  "Pupille";
        }
        if(age >= 6) {
            return  "Poussin";
        }
        return "Trop jeune";
    }
    //VERSION AVEC UN SWITCH
    public static String ageSwitch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir l'âge de l'enfant");
        int age = scanner.nextInt();
        String resultat = "";
        switch(age) {
            case 12:
                resultat= "Cadet";
                break;
            case 10:
            case 11:
                resultat = "Minime";
                break;
            case 9:
            case 8 :
                resultat ="Pupille";
                break;
            case 7:
            case 6:
                resultat ="Poussin";
            default:
                if(age > 12) {
                    resultat = "Cadet";
                }
                if(age<6) {
                    resultat = "Trop jeune";
                }
        }
        return resultat;
    }

    public static void heure() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez indiquer le nombre d'heures");
        int nbr1 = scanner.nextInt();
        System.out.println("Veuillez indiquer le nombre de minutes");
        int nbr2 = scanner.nextInt();

        if (nbr1 == 23 && nbr2 == 59) {
            nbr1 = 0;
            nbr2 = 0;
        } else {
            if (nbr2 == 59) {
                nbr2 = 0;
                nbr1 = nbr1+1;
            } else {
                nbr2 = nbr2+1;
            }
        }
        System.out.println("Dans une minute il sera " + nbr1 + ":" + nbr2); ;
    }

    public static void heureV2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez indiquer le nombre d'heures");
        int nbr1 = scanner.nextInt();
        System.out.println("Veuillez indiquer le nombre de minutes");
        int nbr2 = scanner.nextInt();
        System.out.println("Veuillez indiquer le nombre de secondes");
        int nbr3 = scanner.nextInt();
        if (nbr3 == 59) {
            if (nbr2 == 59) {
                if (nbr1 == 23) {
                    nbr1 = 0;
                    nbr2 = 0;
                    nbr3 = 0;
                } else {
                   nbr3 = 0;
                   nbr2 = 0;
                   nbr1++;
                }
            } else {
                nbr3 = 0;
                nbr2++;
            }
        } else {
            nbr3++;
        }
        System.out.println("Dans une seconde il sera " + nbr1 + ":" + nbr2 + ":" + nbr3); ;
    }

    public static String photocopier() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le nombre de photocopies à facturer");
        float total = 0;
        float nbr = scanner.nextFloat();
        if(nbr <= 10) {
            total = (float) (nbr * 0.1);
        }
        if (nbr <= 10) {
            total = (float) ((nbr-10) * 0.9 + 1);
        }
        if(nbr > 20) {
            total = (float) ((nbr-20)*0.08 + 1.90);
        }
        return "Le prix total à payer est de : " + total + "€";
    }
    //CORRECTION, en utilisant des fonctions avec des return
/*
* public static String posOrNot() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre ");
        int nbr1 = scanner.nextInt();
        System.out.println("Veuillez saisir le second nombre");
        int nbr2 = scanner.nextInt();

        //test si les 2 sont positif ou les 2 sont négatif => produit positif
        if((nbr1 <0 && nbr2 < 0) || (nbr1 > 0 && nbr2 > 0)) {
            return "Le produit de nbr 1  : " + nbr1 + " et nbr 2 : " + nbr2 + " est positif";
        }
        //cas ou un des 2 est négatif => produit négatif
        return "Le produit de nbr 1 : " + nbr1 + " et nbr 2 : " + nbr2 + " est négatif";
    }
    public static String posOrNotV2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre ");
        int nbr1 = scanner.nextInt();
        System.out.println("Veuillez saisir le second nombre");
        int nbr2 = scanner.nextInt();

        //test si les 2 sont positif ou les 2 sont négatif => produit positif
        if ((nbr1 <0 && nbr2 < 0) || (nbr1 > 0 && nbr2 > 0)) {
            return "Le produit de nbr 1 : " + nbr1 + " et nbr 2 : " + nbr2 + " est positif";
        }
        if ((nbr1 <0 && nbr2 > 0) || (nbr1 > 0  && nbr2 < 0)) {
            return "Le produit de nbr 1 : " + nbr1 + " et nbr 2 : " + nbr2 + " est négatif";
        }
        //cas ou un des 2 est vaut zero => produit vaut 0
        return "Le produit de nbr 1 : " + nbr1 + " et nbr 2 : " + nbr2 + " est null";
    }*/

    //CORRECTION DE LA FONCTION HEURE-MINUTE
//public static String minutes() {
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("Veuillez saisir l'heure");
//    int heure = scanner.nextInt();
//    System.out.println("Veuillez saisir les minutes");
//    int minute = scanner.nextInt();
//    minute++;
//    if(minute>59){
//        minute = 0;
//        heure++;
//    }
//    if(heure>23){
//        minute = 0;
//        heure = 0;
//    }
//    return "Dans 1 minute il sera : " + heure + "h" + minute;
//}
//IDEM AVEC LES SECONDES
    public static String secondes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir l'heure");
        int heure = scanner.nextInt();
        System.out.println("Veuillez saisir les minutes");
        int minute = scanner.nextInt();
        System.out.println("Veuillez saisir les secondes");
        int seconde = scanner.nextInt();
        seconde++;
        if(seconde>59){
            seconde = 0;
            minute++;
        }
        if(minute>59){
            minute = 0;
            heure++;
        }
        if(heure>23){
            minute = 0;
            heure = 0;
        }
        return "Dans 1 minute il sera : " + heure + "h" + minute + "min" + seconde;
    }
}

