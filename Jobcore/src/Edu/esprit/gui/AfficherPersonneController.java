/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.esprit.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author abdes
 */
public class AfficherPersonneController implements Initializable {

    @FXML
    private TableView<?> tableviewdemande;
    @FXML
    private TableColumn<?, ?> useridcall;
    @FXML
    private TableColumn<?, ?> mail;
    @FXML
    private TableColumn<?, ?> description;
    @FXML
    private TableColumn<?, ?> etat;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
