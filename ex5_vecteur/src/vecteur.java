import java.util.Scanner;

public class vecteur {

    public static void main (String[] args){

        // Declaration des variables
        float xa;
        float ya;
        float za;
        float xb;
        float yb;
        float zb;
        float distance;
        Scanner sc = new Scanner(System.in);

        // Lecture des donnees du point A
        System.out.println("Quelles sont les coordonnées du point A?");
        System.out.println("xa : ");
        xa = sc.nextFloat();
        System.out.println("ya : ");
        ya = sc.nextFloat();
        System.out.println("za : ");
        za = sc.nextFloat();

        // Affichage du point A
        System.out.println("Le point A (" + xa +"," + ya + "," + za + ")");

        // Lecture des donnees du point B
        System.out.println("Quelles sont les coordonnées du point B?");
        System.out.println("xb : ");
        xb = sc.nextFloat();
        System.out.println("yb : ");
        yb = sc.nextFloat();
        System.out.println("zb : ");
        zb = sc.nextFloat();

        // Affichage du point B
        System.out.println("Le point B (" + xb +"," + yb + "," + zb + ")");

        // Calcul de la distance
        distance = (float)(Math.sqrt(Math.pow((xb - xa), 2)+(Math.pow((yb - ya), 2)+Math.pow((zb - za), 2))));

        // Affichage de la distance
        System.out.println("La distance est : " + distance);

        // Fermeture du scanner
        sc.close();
    }
}
