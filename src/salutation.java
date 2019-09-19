import java.util.Scanner;

public class salutation {

    public static void main (String[] args){

        // Declaration des variables
        String nom;
        Scanner sc = new Scanner(System.in);

        // Lecture du nom
        System.out.print("Quel est votre nom?");
        nom = sc.next();

        // Bonjour + Affichage du nom
        System.out.println("Bonjour " + nom);

        // Fermeture du scanner
        sc.close();
    }
}
