import java.util.Scanner;

public class Main {

    public static int soustraction(int i, int j, int k) {
        return i - j - k ;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
//        int nbr = 10;
//        boolean etat = true;
//        double longnbr = 10.52;
//        int nbr2 = 20;
//        String chaine = "ma chaine";
//        nbr = 52;
        //C'était notre première fonction
//        System.out.println("Le résultat est égal à " + addition(10,25));
//        System.out.println();
//        System.out.println("La moyenne est égale à " + moyenne(10,14,18,20));
//        System.out.println("On a inversé les valeurs : " + inversion(12, 15));
//        System.out.println("Le résultat est égal à " + soustraction(25,12,3));
//        lecture();
//        carre();
//        somme();
//        System.out.println("La moyenne des trois est égale à : " + tripleMoy());
        System.out.println("Le prix TTC des articles est égal à : " + prixTTC());
        System.out.println("Le prix TTC des articles est égal à : " + calculPrixTtc());

    }
//    public static int addition(int nbr1, int nbr2) {
//        return nbr1 + nbr2 ;
//    }
    public static double moyenne(int i, int j, int k, int l) {
        return (double) (i+j+k+l)/4 ;
    }
    public static double tripleMoy() {
        //importer un objet scanner
        Scanner scanner = new Scanner(System.in);
        //afficher un message dans la console
        System.out.println("Veuillez saisir un nombre");
        //récuperer le premier nombre saisi
        double nbr = scanner.nextDouble();
        System.out.println("Veuillez saisir un nombre");
        //récuperer le deuxième nombre saisi
        double nbr2 = scanner.nextDouble();
        System.out.println("Veuillez saisir un nombre");
        //récuperer le troisième nombre saisi
        double nbr3 = scanner.nextDouble();
        return (nbr + nbr2 + nbr3)/3;
    }

//    public static double lectureV2(Scanner scanner, String msg) {
//        System.out.println(msg);
//        double nbr = scanner.nextDouble();
//        return nbr;
//    }
//    public static float moyen2(Scanner scanner){
//        Scanner scanner = new Scanner(System.in);
//        double nbr = lectureV2(scanner, "Veuillez saisir un nombre");
//        double nbr2 = lectureV2(scanner, "Veuillez saisir un nombre");
//        double nbr3 = lectureV2(scanner, "Veuillez saisir un nombre");
//        return (nbr + nbr2 + nbr3)/3;

    public static double prixTTC() {
        //importer un objet scanner
        Scanner scanner = new Scanner(System.in);
        //afficher un message dans la console
        System.out.println("Veuillez saisir le prix HT de l'article individuel");
        //récuperer le premier nombre saisi
        double nbr = scanner.nextDouble();
        System.out.println("Veuillez saisir le nombre d'articles acquis");
        //récuperer le deuxième nombre saisi
        double nbr2 = scanner.nextDouble();
        System.out.println("Veuillez saisir en % le taux de TVA");
        //récuperer le troisième nombre saisi
        double nbr3 = scanner.nextDouble();
        return ((nbr*nbr2)*nbr3/100)+(nbr*nbr2) ;
//        return (double) Math.round((nbr * nbr2 * nbr3) * 100) /100;
    }
    public static float calculPrixTtc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir le prix HT de l'article");
        float prixHt = scanner.nextFloat();
        System.out.println("Saisir le taux de TVA ( exemple 20% -> 1,2)");
        float tva = scanner.nextFloat();
        System.out.println("Saisir le nombre de produit ");
        float quantite = scanner.nextFloat();
        return (float) Math.round((prixHt * quantite * tva) * 100) /100;
    }

//    public static String inversion (int i, int j) {
//        int x = i;
//        i = j;
//        j = x;
//        return (String) "La nouvelle valeur de i est " + i + " et celle de j " + j ;
//    }
//
//    public static void lecture() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Veuillez saisir un nombre");
//        //récupérer le nombre saisi
//        int nbr = scanner.nextInt();
//        System.out.println("Vous avez saisi : " + nbr);
//    }
//
//    public static void carre() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Veuillez saisir un nombre");
//        //récupérer le nombre saisi
//        int nbr = scanner.nextInt();
//        System.out.println("Le carré de ce nombre est égal à : " + (nbr*nbr));
//    }
//
//    public static void somme() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Veuillez saisir deux nombres");
//        //récupérer le nombre saisi
//        int nbr1 = scanner.nextInt();
//        int nbr2 = scanner.nextInt();
//        System.out.println("La somme de ces nombres est égal à : " + (nbr1+nbr2));
//    }

    //CORRECTION DES FONCTIONS CARRE ET SOMME
    /*
    *     //exécution du code (méthode main)
     //System.out.println("Le résultat est égal à : " + carre());
        System.out.println("Le résultat est égal à : " + carreV2());


    //méthode qui demand un nombre et retourne son carre
    public static int carre() {
        //importer un objet scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre");
        int nbr = scanner.nextInt();
        return nbr * nbr;
    }
    //méthode lecture qui demande et retourne le nombre saisie
    public static int lecture() {
        //importer un objet scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre");
        int nbr = scanner.nextInt();
        return nbr;
    }
    //méthode retourne le carre du nombre saisie (alternative)
    public static int carreV2() {
        return (int) Math.pow(lecture(),2);
    }
    *
    public static void main(String[] args) {
        //instancier un objet scanne
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Le résultat est égal à : " + carre());
        //System.out.println("Le résultat est égal à : " + carreV2());
        //System.out.println("Le résultat est égal à : " + sommeV3());
        System.out.println("Le résultat est égal à : " + sommeV4(scanner));
    }

    //méthode qui demand un nombre et retourne son carre
    public static int carre() {
        //importer un objet scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre");
        int nbr = scanner.nextInt();
        return nbr * nbr;
    }
    //méthode lecture qui demande et retourne le nombre saisie
    public static int lecture() {
        //importer un objet scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre");
        int nbr = scanner.nextInt();
        return nbr;
    }
    * //méthode qui demande 2 nombres et retourne la somme de ceux-ci
    public static int somme() {
        //importer un objet scanner
        Scanner scanner = new Scanner(System.in);
        //afficher un message dans la console
        System.out.println("Veuillez saisir un nombre");
        //récuperer le premier nombre saisi
        int nbr = scanner.nextInt();
        System.out.println("Veuillez saisir un nombre");
        //récuperer le premier nombre saisi
        int nbr2 = scanner.nextInt();
        return nbr + nbr2;
    }
    //méthode pour additionner 2 nombres (version en utilisant la méthode lecture)
    public static int sommeV2() {
        //importer un objet scanner
        Scanner scanner = new Scanner(System.in);
        //afficher un message dans la console
        System.out.println("Veuillez saisir un nombre");
        //récuperer le premier nombre saisi
        int nbr = scanner.nextInt();
        System.out.println("Veuillez saisir un nombre");
        //récuperer le premier nombre saisi
        nbr += scanner.nextInt();
        return nbr;
    }
    //méthode alternative
    public static int sommeV3() {
         int nbr = lecture();
         nbr += lecture();
         return nbr;
    }
    public static int lectureV2(Scanner scanner, String msg) {
        System.out.println(msg);
        int nbr = scanner.nextInt();
        return nbr;
    }
    //méthode pour additionner 2 nombres (version en utilisant la méthode lectureV2)
    public static int sommeV4(Scanner scanner){
        int nbr = lectureV2(scanner, "Veuillez saisir un nombre");
        nbr += lectureV2(scanner, "veuillez saisir un nombre");
        return nbr;
    }
    * */
}
