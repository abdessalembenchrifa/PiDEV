/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.jobcore.entities;

/**
 *
 * @author abdes
 */
public class DemandeEntretien {
    private int id,user_id,recrut_id;
    private String description,mail;
    private String etat="en attente";

    public DemandeEntretien(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    
    public int getRecrut_id() {
        return user_id;
    }

    public void setRecrut_id(int user_id) {
        this.user_id = user_id;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
    
    public DemandeEntretien(int id, int user_id, int recrut_id, String description, String mail) {
        this.id = id;
        this.user_id = user_id;
        this.recrut_id = recrut_id;
        this.description = description;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "demande_entretien{" + "id=" + id + ", user_id=" + user_id + ", recrut_id=" + recrut_id + ", description=" + description + ", mail=" + mail + ", etat=" + etat + '}';
    }
    
    
}
