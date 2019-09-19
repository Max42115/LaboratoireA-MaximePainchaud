import java.util.Scanner;

public class convertisseur2 {

    public static void main (String[] args){

        // Declaration des variables
        int angleDeg;
        float angleRad;
        Scanner sc = new Scanner(System.in);

        // Lecture de l'angle en degre
        System.out.print("Quel est l'angle en degre?");
        angleDeg = sc.nextInt();

        // Conversion de l'angle en radian
        angleRad =(float)(angleDeg*Math.PI / 180);

        // Affichage de l'angle en radian
        System.out.println("Valeur en radian : " + angleRad);

        // Fermeture du scanner
        sc.close();
    }
}
