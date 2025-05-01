package dz.univeloued.tps.classes;

public class Employe extends Personne {// inheritance 
    protected double salaire;

    // Constructor avec parameters
    public  Employe(int id, String prenom,String nom, double salaire) {
        super(id, nom, prenom);
        this.salaire = salaire;
    }

    //Methods Get
    public double getSalaire() {
        return salaire;
    }

    //Methods Set
    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    // Override
    public String toString() {
        return "Je suis " + prenom.toUpperCase() + " " + nom + " mon salaire est: " + salaire + " DA";
    }
}
