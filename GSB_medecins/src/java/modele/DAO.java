/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author lmartinez
 */
class DAO {

    public static Collection<Dep> getLesDeps() {
        Collection<Dep> departements = new TreeSet<Dep>();

        try {
            Connection con = Connect.get();
            Statement req;
            req = con.createStatement();
            ResultSet rs = req.executeQuery("select distinct departement from medecin ");

            while (rs.next()) {

//                Collection<Med> medecins = new TreeSet<Med>();
//                
//                Statement req2;
//                req2 = con.createStatement();
//                ResultSet rs2 = req2.executeQuery("select * from medecin where departement =" + rs.getString("departement"));
//                while (rs2.next()) {
//                    medecins.add(new Med(rs2.getString("nom") , rs2.getString("prenom"),rs2.getString("adresse"),rs2.getString("tel"),rs2.getString("specialitecomplementaire"),rs2.getString("id")));
//                }
                departements.add(new Dep(rs.getString("departement")));


            }
        } catch (SQLException e) {
            System.out.println("Erreur SQL :" + e);
        }
        return departements;


    }

    static Collection<Spe> getLesSpes() {
        Collection<Spe> specialites = new TreeSet<Spe>();
        try {
            Connection con = Connect.get();
            Statement req;
            req = con.createStatement();
            ResultSet rs = req.executeQuery("select distinct specialitecomplementaire from medecin where specialitecomplementaire is not null");

            while (rs.next()) {

              
                specialites.add(new Spe(rs.getString("specialitecomplementaire")));


            }
        } catch (SQLException e) {
            System.out.println("Erreur SQL :" + e);
        }
        return specialites;
        
    }

    static Collection<Med> getLesMeds() {
         Collection<Med> medecins = new TreeSet<Med>();
        try {
            Connection con = Connect.get();
            Statement req;
            req = con.createStatement();
            ResultSet rs = req.executeQuery("select * from medecin");

            while (rs.next()) {

              
                medecins.add(new Med(rs.getString("nom"),rs.getString("prenom"),rs.getString("adresse"),rs.getString("tel"),rs.getString("specialitecomplementaire"),rs.getString("id"),rs.getString("departement")));


            }
        } catch (SQLException e) {
            System.out.println("Erreur SQL :" + e);
        }
        return medecins;
    }
}