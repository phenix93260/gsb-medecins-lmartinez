/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author lmartinez
 */
public class Connect {

    private static Connection con = null;

    private static Connection open() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Pilote mal installé..." + e);
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/medecins","root","");
        } catch (SQLException e) {
            System.out.println("Erreur SQL :" + e);
        }
        return con;
    }

    public static Connection get() {
        if (con == null) {
            con = Connect.open();
        }
        return con;
    }

    public static void close() {
        try {
            con.close();
        } catch (SQLException e) {
            System.out.println("Erreur SQL :" + e);
        }
    }
}
