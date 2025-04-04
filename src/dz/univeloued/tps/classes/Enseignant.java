package dz.univeloued.tps.classes;

public class Enseignant extends Employe{
    private String specialite;

    public Enseignant(int id, String prenom, String nom, double salaire, String specialite) {
        super(id, nom, prenom, salaire);
        this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Override
    public String toString() {
        return "Je suis " + prenom.toUpperCase() + " " + nom + " mon salaire est: " + String.format("%.2f",salaire)  + " DA ma spécialité est: " + specialite;
    }
}
