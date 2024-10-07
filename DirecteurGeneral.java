package ma.projet.beans;


public class DirecteurGeneral extends Personne {

    public DirecteurGeneral() {
    }

    public DirecteurGeneral(String nom, double salaire) {
        super(nom, salaire);
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
