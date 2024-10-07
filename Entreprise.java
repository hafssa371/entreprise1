package ma.projet.test;

import ma.projet.beans.Developpeur;
import ma.projet.beans.Manager;
import ma.projet.beans.DirecteurGeneral;

public class Entreprise {
    public static void main(String[] args) {
        // Créer deux développeurs
        Developpeur dev1 = new Developpeur( "SEBIHI", 3000);
        Developpeur dev2 = new Developpeur("NOUARI", 2800);

        // Créer un manager qui gère les deux développeurs
        Manager manager = new Manager( "SEDDIK",  4000);

        // Créer un 3ème développeur
        Developpeur dev3 = new Developpeur( "AMALI", 3200);

        // Créer un directeur général qui gère le manager et le 3ème employé
        DirecteurGeneral directeurGeneral = new DirecteurGeneral( "RAMI",6000);

        // Afficher les noms et les salaires des employés de haut en bas de la hiérarchie
        System.out.println("Directeur Général: " + directeurGeneral.getNom() + ", Salaire: " + directeurGeneral.getSalaire());
        System.out.println("Manager: " + manager.getNom() + ", Salaire: " + manager.getSalaire());
        System.out.println("Développeurs:");
        System.out.println("1. " + dev1.getNom() + ", Salaire: " + dev1.getSalaire());
        System.out.println("2. " + dev2.getNom() + ", Salaire: " + dev2.getSalaire());
        System.out.println("3. " + dev3.getNom() + ", Salaire: " + dev3.getSalaire());
    }
}