
package ma.projet.beans;

import java.util.List;

public class Manager extends Personne {
    private List<Developpeur> developpeurs;

    public Manager() {
    }

    public Manager(String nom, double salaire) {
        super(nom, salaire);
    }

    public Manager(List<Developpeur> developpeurs, String nom, double salaire) {
        super(nom, salaire);
        this.developpeurs = developpeurs;
    }

    public List<Developpeur> getDeveloppeurs() {
        return developpeurs;
    }

    public void setDeveloppeurs(List<Developpeur> developpeurs) {
        this.developpeurs = developpeurs;
    }

    @Override
    public void setSalaire(double salaire) {
        super.setSalaire(salaire); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getSalaire() {
        return super.getSalaire(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNom(String nom) {
        super.setNom(nom); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNom() {
        return super.getNom(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setId(int id) {
        super.setId(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getId() {
        return super.getId(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
