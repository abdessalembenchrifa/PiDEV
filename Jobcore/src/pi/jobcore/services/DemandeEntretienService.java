/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.jobcore.services;

import com.mysql.cj.xdevapi.PreparableStatement;
import pi.jobcore.entities.DemandeEntretien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pi.jobcore.tools.MaConnexion;

public class DemandeEntretienService {
    Connection cnx;
    PreparedStatement ste;        


    public DemandeEntretienService() {
        cnx=MaConnexion.getInstance().getCnx();
    }
    
    public void ajouterDemandeEntretien(DemandeEntretien d){
        try {
            String sql ="insert into demande_entretien (user_id,recrut_id,description,etat, mail)"+"values(?,?,?,?,?)";
            ste=cnx.prepareStatement(sql);

            ste.setInt(1, d.getUser_id());
            ste.setInt(2, d.getRecrut_id());
            ste.setString(3, d.getDescription());
            ste.setString(4, d.getEtat());
            ste.setString(5, d.getMail());
            ste.executeUpdate();
            System.out.println("Dmande entretien ajoutée");
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    public List<DemandeEntretien> afficherDemande(){
    List<DemandeEntretien> demandes = new ArrayList<>();
   
        try {
             String sql = "select * from demande_entretien";
     
             ste = cnx.prepareStatement(sql);
             ResultSet rs = ste.executeQuery();
             while (rs.next()) {   
                 DemandeEntretien p = new DemandeEntretien();
                 p.setId(rs.getInt("id"));
                 p.setUser_id(rs.getInt(2));
                 p.setDescription(rs.getString("description"));
                 
                 demandes.add(p);
               
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    
    return  demandes;
    
}
}
