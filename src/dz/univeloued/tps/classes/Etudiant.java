package dz.univeloued.tps.classes;

public class Etudiant extends Personne{
    private String mat;
    public String domain;

    public Etudiant(int id, String prenom ,String nom, String mat, String domain) {
        super(id, nom, prenom);
        this.mat = mat;
        this.domain = domain;
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Override
    public String toString() {
        return "Je suis " + prenom.toUpperCase() + " " + nom + " mon MAT est: " + mat ;
    }
}