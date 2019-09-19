import java.util.Scanner;

public class Resolution {

    public static void main (String[] args){

        // Declaration des variables
        float a;
        float b;
        float c;
        float discriminant;
        float x1;
        float x2;
        Scanner sc = new Scanner(System.in);

        // Lecture des donnees
        System.out.println("Entrez des valeurs...");
        System.out.println("a");
        a = sc.nextFloat();
        System.out.println("b");
        b = sc.nextFloat();
        System.out.println("c"); c = sc.nextFloat();

        // Calcul des donnees
        discriminant = (float)(Math.pow(b, 2)-(4*a*c));
        x1 = (float)(-b + Math.sqrt(discriminant))/(2*a);
        x2 = (float)(-b - Math.sqrt(discriminant))/(2*a);

        // Affichage des donnees
        System.out.println("Valeurs entrées :");
        System.out.println("a  > " + a);
        System.out.println("b  > " + b);
        System.out.println("c  > " + c);
        System.out.println("Équation : " + a +"x2+" + b +"x+" + c);
        System.out.println("disciminant : " + discriminant);
        System.out.println("x1 : " + x1);
        System.out.println("x2 : " + x2);

        // Fermeture du scanner
        sc.close();
    }
}
