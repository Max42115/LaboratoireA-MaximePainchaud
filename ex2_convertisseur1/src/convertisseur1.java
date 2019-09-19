import java.util.Scanner;

public class convertisseur1 {

    public static void main (String[] args){

        // Declaration des variables
        float angleRad;
        int angleDeg;
        Scanner sc = new Scanner(System.in);

        // Lecture de l'angle en radian
        System.out.print("Quel est l'angle en radian?");
        angleRad = sc.nextFloat();

        // Conversion de l'angle en degre
        angleDeg =(int) (180*angleRad / Math.PI);

        // Affichage de l'angle en degre
        System.out.println("Valeur en degre : " + angleDeg);

        // Fermeture du scanner
        sc.close();
    }
}
