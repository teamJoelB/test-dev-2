package fr.solutec.dao;

import fr.solutec.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joelg
 */
public class UserDao {

    public static User getByLoginAndPassword(String login, String mdp) throws SQLException {
        User u = null;
        String slq = "SELECT * FROM person WHERE login =? AND mdp = ?";

        Connection connexion = AccessBD.getConnection();

        PreparedStatement prepare = connexion.prepareStatement(slq);
        prepare.setString(1, login);
        prepare.setString(2, mdp);

        ResultSet rs = prepare.executeQuery();
        if (rs.next()) {
            u = new User();
            u.setId(rs.getInt("id"));
            u.setNom(rs.getString("nom"));
            u.setLogin(rs.getString("login"));
        }

        return u;
    }

    public static void insert(User u) throws SQLException {
        String sql = "INSERT INTO person (nom, login, mdp) VALUES (?, ?, ?)";

        Connection connexion = AccessBD.getConnection();

        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setString(1, u.getNom());
        prepare.setString(2, u.getLogin());
        prepare.setString(3, u.getMdp());

        prepare.execute();
    }

    public static List<User> getAllPerson() throws SQLException {
        List<User> users = new ArrayList<>();

        String slq = "SELECT * FROM person";

        Connection connexion = AccessBD.getConnection();

        Statement statment = connexion.createStatement();
        

        ResultSet rs = statment.executeQuery(slq);
        
        while(rs.next()) {
            User u = new User();
            u.setId(rs.getInt("id"));
            u.setNom(rs.getString("nom"));
            u.setLogin(rs.getString("login"));
            
            users.add(u);
        }

        return users;
    }

}
