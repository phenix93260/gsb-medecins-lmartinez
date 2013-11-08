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
            ResultSet rs = req.executeQuery("select distinct departement from medecin");

            while (rs.next()) {

                Collection<Med> medecins = new HashSet<Med>();
                
                Statement req2;
                req2 = con.createStatement();
                ResultSet rs2 = req2.executeQuery("select * from medecin where departement =" + rs.getString("departement"));
                while (rs2.next()) {
                    medecins.add(new Med(rs2.getString("nom") , rs2.getString("prenom"),rs2.getString("adresse"),rs2.getString("tel"),rs2.getString("specialitecomplementaire"),rs2.getString("id")));
                }
                departements.add(new Dep(rs.getString("departement"), medecins));


                /*
                 * Connection con = Connect.get(); Statement req; req =
                 * con.createStatement(); ResultSet rs = req.executeQuery(
                 * "select * from brocante"); rs.next();
                 * b.setNom(rs.getString("nombroc"));
                 * b.setLieu(rs.getString("lieubroc"));
                 * b.setDate(rs.getDate("datebroc")); Statement req2; req2 =
                 * con.createStatement(); ResultSet rs2 =
                 * req2.executeQuery("select * from typeemplacement order by
                 * prix"); while ( rs2.next() ) { HashSet<Emplacement> e =new
                 * HashSet<Emplacement>(); Statement req3;
                 * req3=con.createStatement(); ResultSet rs3=
                 * req3.executeQuery("select * from emplacement where
                 * idtype="+rs2.getString("idtype")); while(rs3.next()){
                 * e.add(new
                 * Emplacement(rs3.getString("code"),rs3.getString("nomabonne")));
                 * }
                 *
                 *
                 *
                 *
                 *
                 *
                 *
                 * Type t = new
                 * Type(rs2.getString("idtype"),rs2.getString("description"),rs2.getDouble("prix"),e);
                 * b.addType(t); } //Parcours rs.close();
                 */
            }
        } catch (SQLException e) {
            System.out.println("Erreur SQL :" + e);
        }
        return departements;


    }
}