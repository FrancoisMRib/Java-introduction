import com.testcda3.classe.Utilisateur;
import com.testcda3.classe.Habitation;
import com.testcda3.classe.Vehicule;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        System.out.println(nombreDemande());
//        System.out.println(grandNombreDemande());
//        multiNombre();
//        System.out.println(lookminTab());
//        System.out.println(lookmaxTab());
//        moyenTab();
//        tabUserMoy();
//        tabUserMoyV2();
        //EXERCICE 25
//        Habitation premHab = new Habitation();
//        Habitation villa = new Habitation("villa", 15, 78,3);
//        Habitation nouvHab = new Habitation("maison", 120, 160,2);
//
//        Utilisateur francois = new Utilisateur("Ribere", "François", "fribere@gmail.com", "1234");
//        System.out.println("L'habitation qui se nomme " + villa.getName() + " a une surface de " + villa.toSurface() + "m2");
//        System.out.println("L'habitation qui se nomme " + nouvHab.getName() + " a une surface de " + nouvHab.toSurface() + "m2");
//        System.out.println(villa.phrase());

        //EXERCICE 26
        Vehicule premVeh = new Vehicule();
        Vehicule mob = new Vehicule("Peugeot 101", 2, 150);
        Vehicule car = new Vehicule("Peugeot 106", 4, 210);
        Vehicule bagn = new Vehicule("Citroën Jumpy", 6, 220);
        System.out.println("Le véhicule " + mob.getNom() + " est de type " + mob.detect());
        System.out.println("Le véhicule " + car.getNom() + " est de type " + car.detect());
        System.out.println("Le véhicule " + bagn.getNom() + " est de type " + bagn.detect());

        System.out.println("Le véhicule " + mob.getNom() + " a une vitesse de " + mob.getVitesse());
        mob.boost();
        System.out.println("Le véhicule " + mob.getNom() + " a une nouvelle vitesse de " + mob.getVitesse());

        //test de la méthode plusRapide
        System.out.println("Le véhicule le plus rapide est : " + mob.plusRapide(car));
        System.out.println("Le véhicule le plus rapide est : " + car.plusRapide(bagn));
        System.out.println("Le véhicule le plus rapide est : " + car.plusRapide(mob));


    }




    public static String nombreDemande() {
        Scanner scanner = new Scanner(System.in);
//        for(boolean test = false)
        System.out.println("Veuillez saisir un nombre compris entre 1 et 3");
        int nbr = scanner.nextInt();
        while (nbr <= 1 || nbr >= 3) {
            System.out.println("Le nombre " + nbr + " est incorrect, veuillez réessayer");
            nbr = scanner.nextInt();
        }
        return "Félicitations !";

    }

    public static String grandNombreDemande() {
        Scanner scanner = new Scanner(System.in);
//        for(boolean test = false)
        System.out.println("Veuillez saisir un nombre compris entre 10 et 20");
        int nbr = scanner.nextInt();
        while (nbr <= 10 || nbr >= 20) {
            if (nbr <= 10) {
                System.out.println("Plus grand !");
            } else {
                //Il vaut mieux faire un autre if, pour rester précis
                System.out.println("Plus petit !");
            }
            nbr = scanner.nextInt();
        }
        return "Bravo c'est ça !";

    }
// EXERCICE 16
    public static void suiteNombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre");
        int nbr = scanner.nextInt();
        for(int i=0; i<10; i++) {
            System.out.println(nbr + i + 1);
        }
    }

    // EXERCICE 17
    public static void multiNombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre");
        int nbr = scanner.nextInt();
        for(int i=0; i<11; i++) {
            System.out.println(nbr + "X"+ (i) + "=" + (nbr * i) );
        }
    }

    //EXERCICE 18
    public static void somme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre");
        int nbr = scanner.nextInt();
        int total = 0;
        for (int i = 1; i < nbr + 1 ; i++) {
            total += i;
        }
        System.out.println("La somme est égal à " + total);
    }

    //EXERCICE 19
    public static int lookminTab() {

        int [] tab = {10,33,56,89,7,11,3,16};
//        for (int value : tab)
//            System.out.println(value+"");
        int minVal = tab[0];
        for (int i = 0; i < tab.length; i++) {
           if(tab[i] < minVal) {
               minVal = tab[i];
           }
//           System.out.println("Valeur minimale = " + maxVal);
        }
        return minVal;
    }
    //CORRECTION
    public static String minimal(int [] tab) {
        int min = tab[0];
        for (int i = 0; i < tab.length ; i++) {
            if (min > tab[i]) {
                min = tab[i];
            }
        }
        return "La valeur la plus petite est : " + min;
    }


    // EXERCICE 20
    public static int lookmaxTab() {

        int [] tab = {10,33,56,89,7,11,3,16};
        int maxVal = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] > maxVal) {
                maxVal = tab[i];
            }
        }
        return maxVal;
    }
    //CORRECTION
    public static String maximal(int [] tab) {
        int max = tab[0];
        for (int i = 0; i < tab.length ; i++) {
            if (max < tab[i]) {
                max = tab[i];
            }
        }
        return "La valeur la plus grande est : " + max;
    }

    // EXERCICE 21
    public static void moyenTab() {
        int [] tab = {10,33,56,89,7,11,2,16} ;
        int moyVal = 0;
        for (int value : tab) {
            moyVal = moyVal + value;
        }
        System.out.println("La moyenne est : " + moyVal/8);
//       return moyVal;
    }
    // CORRECTION
    public static String tabMoyenne(int [] tab) {
        int somme = 0;
        for (int i = 0; i < tab.length ; i++) {
            somme += tab[i];
        }
        return "La moyenne est de : " + somme/ tab.length;
    }

    //EXERCICE 22
    public static void tabUserMoy() {
        Scanner scanner = new Scanner(System.in);
        int[] tab = new int [0];
        int moy = 0;
        System.out.println("Veuillez entrer les éléments");
        for (int i=0; i < tab.length; i++) {
            tab[i] = scanner.nextInt();
        }
        for (int i : tab) {
            moy = moy + i;
        }
        System.out.println("La moyenne est égale à " + moy/tab.length);
    }
    //Non à mon avis ce n'est pas bon car je n'utilise pas la commande ArrayList<Integer>
    //EXERCICE 22
    public static void tabUserMoyV2() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> notes = new ArrayList<Integer>();
        System.out.println("Veuillez saisir une note ou -1 pour arrêter");
        int note = scanner.nextInt();
        while (note > 0) {
            notes.add(note);
            System.out.println("Veuillez saisir une note ou -1 pour arrêter");
            note = scanner.nextInt();
        }
        int moy = 0;
        for (int i = 0; i<notes.size(); i++) {
            moy += notes.get(i);
        }
        System.out.println("La moyenne est égale à " + moy/8);
    }

    //EXERCICE 23 : CORRECTION
    public static void stockAff() {
        //instancier un objet Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer le nombre de valeurs que vous souhaitez utiliser");
        //récupérer le nombre de notes
        int nbr = scanner.nextInt();
        //compteurs notes positives, négatives et nulles
        int pos = 0;
        int neg = 0;
        int zero = 0;
        //créer un tableau de notes
        ArrayList<Integer> notes = new ArrayList<>();
        //ajouter les notes au tableau (ArrayList)
        for (int i = 0; i < nbr; i++) {
            System.out.println("Saisir une note");
            int note = scanner.nextInt();
            //ajouter la note au tableau
            notes.add(note);
        }
        //parcourir l'arrayList pour compter combien on à de notes positives, négatives et nulles
        for (int i = 0; i < notes.size(); i++) {
            //test si la note est négative
            if(notes.get(i) < 0 ) {
                neg++;
            }
            //test si la note est positive
            if(notes.get(i) > 0) {
                pos++;
            }
            if(notes.get(i) == 0) {
                zero++;
            }
        }
        System.out.println("Dans la liste des notes il y à : " + neg + " notes négatives " + pos + " notes positives " + zero + " notes nulles");
    }

    //EXERCICE 24 : CORRECTION
    public static void absolu(int [] tab) {
        int min = tab[0];
        for (int i = 0; i < tab.length ; i++) {
            if(min > Math.abs(tab[i])) {
                min = Math.abs(tab[i]);
            }
        }
        System.out.println("La valeur absolue minimale est : " + min);
    }

}
