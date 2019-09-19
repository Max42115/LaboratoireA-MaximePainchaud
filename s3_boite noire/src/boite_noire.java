public class boite_noire {

    public static void main (String[] args){

        // Declaration des variables
        float volumeBoite = 125;
        float poidsBoite = 375;
        float mVolSphere = 3517;
        double rayonSphere = 2.15;
        double mVolSubstanceIsolation = 13545.88;
        double poidsSphere;
        double volumeSphere;
        double poidsSubstanceIsolation;
        double volumeSubstanceIsolation;
        double quantiteSubstanceIsolation;
        double poidsTotal;

        // Calcul des donnees de la sphere
        volumeSphere = (double)((4*Math.PI*Math.pow(rayonSphere, 3))/3);
        poidsSphere = (double)(volumeSphere*mVolSphere);

        // Calcul des donnees de la substance d'isolation
        volumeSubstanceIsolation = (double)(volumeBoite - volumeSphere);
        poidsSubstanceIsolation = (double)(mVolSubstanceIsolation*volumeSubstanceIsolation);
        quantiteSubstanceIsolation = (double)(volumeSubstanceIsolation*1000);

        // Calcul du poids total
        poidsTotal = (double)(poidsBoite + poidsSphere + poidsSubstanceIsolation);

        // Affichage du rapport d'informations
        System.out.println("-------------------------------------------");
        System.out.println("-RAPPORT D'INFORMATIONS");
        System.out.println("  Sphere");
        System.out.println("   * Masse volumique : " + mVolSphere + " kg/m3");
        System.out.println("   * Poids : " + poidsSphere + " kg");
        System.out.println("   * Rayon : " + rayonSphere + " m");
        System.out.println("   * Volume : " + volumeSphere + " m3");
        System.out.println("  Substance isolante");
        System.out.println("   * Masse volumique : " + mVolSubstanceIsolation + " kg/m3");
        System.out.println("   * Poids : " + poidsSubstanceIsolation + " kg");
        System.out.println("   * Volume : " + volumeSubstanceIsolation + " m3");
        System.out.println("   * Quantite: " + quantiteSubstanceIsolation+ " l");
        System.out.println("  Boite noire");
        System.out.println("   * Poids : " + poidsBoite+ " kg");
        System.out.println("   * Volume : " + volumeBoite + " m3");
        System.out.println("   * Poids total : " + poidsTotal + " kg");
        System.out.println("-------------------------------------------");
    }
}
