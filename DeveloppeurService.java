package ma.projet.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ma.projet.connexion.Connexion;
import ma.projet.dao.IDao;
import ma.projet.beans.Developpeur;
import ma.projet.beans.Manager;

public class DeveloppeurService implements IDao<Developpeur> {

    @Override
    public boolean create(Developpeur o) {
        try {
            String req = "INSERT INTO developpeur (nom, salaire) VALUES (?,?)";
            PreparedStatement ps = Connexion.getCn().prepareStatement(req);
            ps.setString(1, o.getNom());
            ps.setDouble(2, o.getSalaire());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(DeveloppeurService.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return false;
    }

    @Override
    public boolean update(Developpeur o) {
        try {
            String req = "UPDATE developpeur SET nom=?, salaire=? WHERE id=?";
            PreparedStatement ps = Connexion.getCn().prepareStatement(req);
            ps.setString(1, o.getNom());
            ps.setDouble(2, o.getSalaire());
            ps.setInt(3, o.getId());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(DeveloppeurService.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return false;
    }

    @Override
    public boolean delete(Developpeur o) {
        try {
            String req = "DELETE FROM developpeur WHERE id=?";
            PreparedStatement ps = Connexion.getCn().prepareStatement(req);
            ps.setInt(1, o.getId());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(DeveloppeurService.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return false;
    }

    @Override
    public Developpeur findById(int id) {
        Developpeur developpeur = null;
        try {
            String req = "SELECT * FROM developpeur WHERE id=?";
            PreparedStatement ps = Connexion.getCn().prepareStatement(req);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                developpeur = new Developpeur(
                    rs.getInt("id"),
                    rs.getString("nom"),
                    rs.getDouble("salaire")
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(DeveloppeurService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return developpeur;
    }

    @Override
    public List<Developpeur> findAll() {
        List<Developpeur> developpeurs = new ArrayList<>();
        try {
            String req = "SELECT * FROM developpeur";
            Statement st = Connexion.getCn().createStatement();
            ResultSet rs = st.executeQuery(req);

            while (rs.next()) {
                developpeurs.add(new Developpeur(
                    rs.getInt("id"), 
                    rs.getString("nom"), 
                    rs.getDouble("salaire")
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DeveloppeurService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return developpeurs;
    }
}