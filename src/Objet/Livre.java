package Objet;

public class Livre {

    private static String auteur;
   private static String titre;
   private static String parution;
   private static String colone ;
   private static String rangée ;
   private static String résumé;

    public Livre(String myTitre, String myAuteur, String myParution, String myColone, String myRangée, String myRésumé) {
        this.auteur = myAuteur.toString();
        this.titre = myTitre.toString();
        this.parution = myParution.toString();
        this.colone = myColone.toString();
        this.rangée = myRangée.toString();
        this.résumé = myRésumé.toString();
    }

    public static String getAuteur() {
        return auteur;
    }

    public static String getTitre() {
        return titre;
    }

    public static String getParution() {
        return parution;
    }

    public static String getColone() {
        return colone;
    }

    public static String getRangée() {
        return rangée;
    }

    public static String getRésumé() {
        return résumé;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setParution(String parution) {
        this.parution = parution;
    }

    public void setColone(String colone) {
        this.colone = colone;
    }

    public void setRangée(String rangée) {
        this.rangée = rangée;
    }

    public void setRésumé(String résumé) {
        this.résumé = résumé;
    }
}
