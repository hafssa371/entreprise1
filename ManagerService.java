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
import ma.projet.beans.Manager;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ma.projet.beans.Manager;
import ma.projet.connexion.Connexion;

public class ManagerService implements IDao<Manager> {

    @Override
    public boolean create(Manager o) {
        try {
            String req = "INSERT INTO manager (nom, salaire) VALUES (?, ?)";
            PreparedStatement ps = Connexion.getCn().prepareStatement(req);
            ps.setString(1, o.getNom());
            ps.setDouble(2, o.getSalaire());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(ManagerService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean update(Manager o) {
        try {
            String req = "UPDATE manager SET nom=?, salaire=? WHERE id=?";
            PreparedStatement ps = Connexion.getCn().prepareStatement(req);
            ps.setString(1, o.getNom());
            ps.setDouble(2, o.getSalaire());
            ps.setInt(4, o.getId());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(ManagerService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean delete(Manager o) {
        try {
            String req = "DELETE FROM manager WHERE id=?";
            PreparedStatement ps = Connexion.getCn().prepareStatement(req);
            ps.setInt(1, o.getId());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(ManagerService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public Manager findById(int id) {
        Manager manager = null;
        try {
            String req = "SELECT * FROM manager WHERE id=?";
            PreparedStatement ps = Connexion.getCn().prepareStatement(req);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                manager = new Manager(
                    rs.getString("nom"),
                    rs.getDouble("salaire")
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return manager;
    }

    @Override
    public List<Manager> findAll() {
        List<Manager> managers = new ArrayList<>();
        try {
            String req = "SELECT * FROM manager";
            Statement st = Connexion.getCn().createStatement();
            ResultSet rs = st.executeQuery(req);

            while (rs.next()) {
                managers.add(new Manager( 
                    rs.getString("nom"), 
                    rs.getDouble("salaire")
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return managers;
    }
}
