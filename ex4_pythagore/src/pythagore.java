import java.util.Scanner;

public class pythagore {

    public static void main(String[] args){

        // Declaration des valeurs
        int A;
        int B;
        float C;
        Scanner sc = new Scanner(System.in);

        // Lecture des donnees
        System.out.println("Quel est la valeur A?");
        A = sc.nextInt();
        System.out.println("Quel est la valeur B?");
        B = sc.nextInt();

        // Calcul de la valeur de pyhtagore
        C = (float)(Math.sqrt((Math.pow(A, 2))+(Math.pow(B, 2))));

        // Affichage de la reponse
        System.out.println("Valeur de pythagore : " + C);

        // Fermeture du scanner
        sc.close();
    }
}
