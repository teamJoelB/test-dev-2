/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.model;

import java.sql.Date;

/**
 *
 * @author joelg
 */
public class NoteRapide {
    private int id;
    private String contenue;
    private Date dateCreation;
    private User person;

    public NoteRapide() {
    }

    public NoteRapide(int id, String contenue, Date dateCreation, User person) {
        this.id = id;
        this.contenue = contenue;
        this.dateCreation = dateCreation;
        this.person = person;
    }

    public User getPerson() {
        return person;
    }

    public void setPerson(User person) {
        this.person = person;
    }

  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContenue() {
        return contenue;
    }

    public void setContenue(String contenue) {
        this.contenue = contenue;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
    
    
}
