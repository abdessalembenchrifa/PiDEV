/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.jobcore.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import pi.jobcore.entities.DemandeEntretien;
import pi.jobcore.services.DemandeEntretienService;

/**
 * FXML Controller class
 *
 * @author abdes
 */
public class DemanderentretienController implements Initializable {

    @FXML
    private TextField txtmail;
    @FXML
    private TextArea txtdesc;
    @FXML
    private TextField txtrecid;
    @FXML
    private TextField txtuserid;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ajouterDemandeEntretien(ActionEvent event) {
        int recid=Integer.parseInt(txtrecid.getText());
        int userid=Integer.parseInt(txtuserid.getText());
        String mail= txtmail.getText();
        String description = txtdesc.getText();
        DemandeEntretien d = new DemandeEntretien(1, userid, recid, description, mail);
        DemandeEntretienService des = new DemandeEntretienService();
        des.ajouterDemandeEntretien(d);
        
        
    }
    
}
