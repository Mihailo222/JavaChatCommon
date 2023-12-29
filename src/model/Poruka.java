/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Acer
 */
public class Poruka implements Serializable{
    
    
    private int id;
    private Date datumVreme;
    private String text;
    private User sender;
    private User reciever; 

    public Poruka() {
    }

    public Poruka(int id, Date datumVreme, String text, User sender, User reciever) {
        this.id = id;
        this.datumVreme = datumVreme;
        this.text = text;
        this.sender = sender;
        this.reciever = reciever;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDatumVreme() {
        return datumVreme;
    }

    public void setDatumVreme(Date datumVreme) {
        this.datumVreme = datumVreme;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReciever() {
        return reciever;
    }

    public void setReciever(User reciever) {
        this.reciever = reciever;
    }

    @Override
    public String toString() {
        return  datumVreme + " " + text + " FROM: " + sender + "TO: " + reciever;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Poruka other = (Poruka) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.text, other.text)) {
            return false;
        }
        if (!Objects.equals(this.datumVreme, other.datumVreme)) {
            return false;
        }
        if (!Objects.equals(this.sender, other.sender)) {
            return false;
        }
        return Objects.equals(this.reciever, other.reciever);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
