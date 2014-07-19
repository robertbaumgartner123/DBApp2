/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package freunde.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Robert
 */
public class DBModelFreunde {
    Connection conn=null;
    static final String CONN_STRING = "jdbc:mysql://localhost/freundedb";
    
    public ObservableList<Freund> freunde = FXCollections.observableArrayList();
    
    public void connect()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(CONN_STRING,"root","");
            Statement stmt = conn.createStatement();
            ResultSet rs =stmt.executeQuery("SELECT * FROM freunde");
            while (rs.next()){
                Freund f = new Freund();
                f.setID(rs.getInt("id"));
                f.setVorname(rs.getString("vname"));
                f.setNachname(rs.getString("nname"));
                f.setGeburtsdatum(rs.getString("gebdatum"));
                f.setGröße(rs.getFloat("groesse"));
                f.setBild(rs.getString("bild"));
                freunde.add(f);
                
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver nicht gefunden");
        } catch (SQLException ex) {
            System.out.println("Verbundung zur Datenbank nicht möglich");
        }
  
    }
}
