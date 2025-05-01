package dz.univeloued.tps.Apps;// Create a package 
import dz.univeloued.tps.classes.*;// Package recall 
public class Application {
    public static void main(String[] args){
        Employe emp1 = new Employe(1,"dou","Rachid",10000.0);// New Object _ Constructor avec parameters 
        Employe emp2 = new Employe(2,"farh","Djamel", 10000.0);// New Object _ Constructor avec parameters

        Etudiant e1 = new Etudiant(3, "obaka"," Med", "65678754","Informatique");// New Object _ Constructor avec parameters
        Etudiant e2 = new Etudiant(4, "khalfi"," KHALFI", "87543543","Maths");// New Object _ Constructor avec parameters

        Enseignant ens1 = new Enseignant(5,"okba","Kamal", 67000.0,"JAVA/JEE");// New Object _ Constructor avec parameters
        Enseignant ens2 = new Enseignant(6,"Mohamed","Cheick",  55000.0,"Mathématique");// New Object _ Constructor avec parameters

        System.out.println("La liste des employes :");
        System.out.println("\t" + emp1);
        System.out.println("\t" + emp2);

        System.out.println("La liste des étudiants :");
        System.out.println("\t" + e1);
        System.out.println("\t" + e2);

        System.out.println("La liste des professeurs :");
        System.out.println("\t" + ens1);
        System.out.println("\t" + ens2);

        System.out.println("Nb objet de type Personne="+Personne.count);
    }
}
