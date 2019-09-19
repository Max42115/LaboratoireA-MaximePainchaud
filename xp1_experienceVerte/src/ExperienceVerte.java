import java.util.Scanner;

public class ExperienceVerte {

    public static void main(String[] args) {

        // Declaration des variables
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int k1;
        int k2;
        int k3;
        int co2;
        Scanner sc = new Scanner(System.in);

        // Lecture des donnees
        System.out.println("Entrez des quantites...");
        System.out.println("A  > ");
        a = sc.nextInt();
        System.out.println("B  > ");
        b = sc.nextInt();
        System.out.println("C  > ");
        c = sc.nextInt();
        System.out.println("D  > ");
        d = sc.nextInt();
        System.out.println("E  > ");
        e = sc.nextInt();
        System.out.println("F  > ");
        f = sc.nextInt();

        // Affichage des donnees lues
        System.out.println("A_" + a + " B_" + b + " C_" + c + " D_" + d + " E_" + e + " F_" + f + " co2_0");

        // Calcul des donnees de la premiere reaction
        k1 = Math.min(a/2 , c/4);
        co2 = k1;

        // Affichage des donnees de la premiere reaction
        System.out.println("A_1{" + (a - 2*k1) + "} B_1{" + b + "} C_1{" + (c - 4*k1) + "} D_1{" + (d + 3*k1) +
                "} E_1{" + e + "} F_1{" + f + "} co2_1{" + co2 + "}");

        // Calcul des donnees de la deuxieme reaction
        k2 = Math.min(b , (c - 4*k1)/2 );
        co2 = k1 + (4*k2);

        // Affichage des donnees de la deuxieme reaction
        System.out.println("A_2{" + (a - 2*k1) + "} B_2{" + (b - k2) + "} C_2{" + ((c - 4*k1) - 2*k2) + "} D_2{" +
                (d + 3*k1) + "} E_2{" + (e - k2) + "} F_2{" + (f + 4*k2) + "} co2_2{" + co2 + "}");

        // Calcul des donnees de la troisieme reaction
        k3 = Math.min((a - 2*k1)*2 , (f + 4*k2)/4);
        co2 = k1 + (4*k2) + k3;

        // Affichage des donnees de la troisieme reaction
        System.out.println("A_2{" + ((a - 2*k1) - k3/2) + "} B_2{" + ((b - k2) + k3) + "} C_2{" + ((c - 4*k1) - 2*k2) +
                "} D_2{" + (d + 3*k1) + "} E_2{" + ((e - k2) + 4*k3) + "} F_2{" + ((f + 4*k2) - 4*k3) +
                "} co2_2{" + co2 + "}");

        // Fermeture du scanner
        sc.close();
    }
}
