public class geometrie {

    public static void main (String[] args){

        // Declaration des variables
        float rayonCercle = 10;
        float longueurCube = 7;
        float rayonCylindre = 10;
        float hauteurCylindre = 5;
        float rayonCone = 3;
        float hauteurCone = 7;
        float apothemeCone;
        float surface;
        float volume;

        // Calcul des donnees du cercle
        surface = (float)(Math.pow(rayonCercle, 2)*Math.PI);

        // Affichage des donnees du cercle
        System.out.println("Le cercle");
        System.out.println("- Rayon     : " + rayonCercle);
        System.out.println("- Surface   : " + surface);

        // Calcul des donnees du cube
        surface = (float)(6*Math.pow(longueurCube, 2));
        volume = (float)(Math.pow(longueurCube,3));

        // Affichage des donnees du cube
        System.out.println("Le cube");
        System.out.println("- Longueur  : " + longueurCube);
        System.out.println("- Surface   : " + surface);
        System.out.println("-Volume     : " + volume);

        // Calcul des donnees du cylindre
        surface = (float)((2*Math.PI*rayonCylindre*hauteurCylindre)+(2*Math.PI*Math.pow(rayonCylindre,2)));
        volume = (float)(Math.PI*Math.pow(rayonCylindre,2)*hauteurCylindre);

        // Affichage des donnees du cylindre
        System.out.println("Le cylindre");
        System.out.println("- Rayon     : " + rayonCylindre);
        System.out.println("-Hauteur    : " + hauteurCylindre);
        System.out.println("-Surface    : " + surface);
        System.out.println("-Volume     : " + volume);

        // Calcul des donnees du cone
        apothemeCone = (float)(Math.sqrt((Math.pow(rayonCone,2))+Math.pow(hauteurCone,2)));
        surface = (float)((Math.PI*rayonCone*apothemeCone)+(Math.PI*Math.pow(rayonCone,2)));
        volume = (float)((Math.PI*Math.pow(rayonCone,2)*hauteurCone)/3);

        // Affichage des donnes du cone
        System.out.println("Le cone");
        System.out.println("-Rayon      : " + rayonCone);
        System.out.println("-Hauteur    : " + hauteurCone);
        System.out.println("-Apotheme   : " + apothemeCone);
        System.out.println("-Surface    : " + surface);
        System.out.println("-Volume     : " + volume);
    }
}
