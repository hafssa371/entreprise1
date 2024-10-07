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
import ma.projet.beans.DirecteurGeneral;

public class DirecteurGeneralService implements IDao<DirecteurGeneral> {

    @Override
    public boolean create(DirecteurGeneral o) {
        boolean r = false;
        try {
            String req = "INSERT INTO directeur_general (nom,  salaire) VALUES (?, ?)";
            PreparedStatement ps = Connexion.getCn().prepareStatement(req);

            ps.setString(1, o.getNom());
            ps.setDouble(2, o.getSalaire());

            int n = ps.executeUpdate();
            if (n == 1) {
                r = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DirecteurGeneralService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    @Override
    public boolean update(DirecteurGeneral o) {
        boolean r = false;
        try {
            String req = "UPDATE directeur_general SET nom = ?, salaire = ? WHERE id = ?";
            PreparedStatement ps = Connexion.getCn().prepareStatement(req);

            ps.setString(1, o.getNom());
            ps.setDouble(2, o.getSalaire());
            ps.setInt(3, o.getId());

            int n = ps.executeUpdate();
            if (n == 1) {
                r = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DirecteurGeneralService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    @Override
    public boolean delete(DirecteurGeneral o) {
        boolean r = false;
        try {
            String req = "DELETE FROM directeur_general WHERE id = ?";
            PreparedStatement ps = Connexion.getCn().prepareStatement(req);

            ps.setInt(1, o.getId());

            int n = ps.executeUpdate();
            if (n == 1) {
                r = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DirecteurGeneralService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    @Override
    public DirecteurGeneral findById(int id) {
        try {
            String req = "SELECT * FROM directeur_general WHERE id = ?";
            PreparedStatement ps = Connexion.getCn().prepareStatement(req);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new DirecteurGeneral(rs.getString("nom"), rs.getDouble("salaire"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DirecteurGeneralService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<DirecteurGeneral> findAll() {
        List<DirecteurGeneral> directeursGeneraux = new ArrayList<>();
        try {
            String req = "SELECT * FROM directeur_general";
            Statement st = Connexion.getCn().createStatement();
            ResultSet rs = st.executeQuery(req);

            while (rs.next()) {
                directeursGeneraux.add(new DirecteurGeneral( rs.getString("nom"), rs.getDouble("salaire")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DirecteurGeneralService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return directeursGeneraux;
    }
}
