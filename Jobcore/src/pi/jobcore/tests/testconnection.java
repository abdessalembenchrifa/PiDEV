/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.jobcore.tests;
import pi.jobcore.entities.DemandeEntretien;
import pi.jobcore.services.DemandeEntretienService;
import pi.jobcore.tools.MaConnexion;
 
public class testconnection {
    
    public static void main(String[]args){
        MaConnexion cm = MaConnexion.getInstance();
        DemandeEntretien d = new DemandeEntretien(1,13,5,"description entretien 1","abdessalem@gmail.com");
        DemandeEntretienService des = new DemandeEntretienService();
        des.ajouterDemandeEntretien(d);
    }
}
