/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.dao;

import fr.solutec.model.NoteRapide;
import fr.solutec.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joelg
 */
public class NoteRapideDao {
    
    public static void insertNote(NoteRapide note) throws SQLException {
        String sql = "INSERT INTO note_rapide (contenue, person_id) VALUES (?, ?)";
        Connection connexion = AccessBD.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setString(1, note.getContenue());
        prepare.setInt(2, note.getPerson().getId());
        
        prepare.execute();
    }
    
    public static List<NoteRapide> getAllNoteByUser(User u) throws SQLException {
        List<NoteRapide> noteRapides = new ArrayList<>();
        
        String sql = "SELECT * FROM note_rapide n INNER JOIN person p ON n.person_id = p.id WHERE person_id = ?";
        Connection connexion = AccessBD.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setInt(1, u.getId());
        
        ResultSet rs = prepare.executeQuery();
        
        while (rs.next()) {            
            NoteRapide n = new NoteRapide();
            n.setId(rs.getInt("id"));
            n.setContenue(rs.getString("contenue"));
            n.setDateCreation(rs.getDate("date_creation"));
            
            User p = new User();
            p.setId(rs.getInt("person_id"));
            p.setNom(rs.getString("nom"));
            p.setLogin(rs.getString("login"));
            
            n.setPerson(p);
            
            noteRapides.add(n);
            
        }
        
        return noteRapides;
    }
    
}
