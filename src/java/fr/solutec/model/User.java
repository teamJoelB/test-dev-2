
package fr.solutec.model;

/**
 *
 * @author joelg
 */
public class User {
    private int id;
    private String nom;
    private String login;
    private String mdp;

    public User() {
    }

    public User(int id, String nom, String login, String mdp) {
        this.id = id;
        this.nom = nom;
        this.login = login;
        this.mdp = mdp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
    
    
}
