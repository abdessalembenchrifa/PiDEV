/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.jobcore.controller;

import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Pagination;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import pi.jobcore.entities.Chatroom;

/**
 * FXML Controller class
 *
 * @author abdes
 */
public class MeetViewController implements Initializable {

    @FXML
    private Pagination pagination;
    @FXML
    private TableView<Chatroom> tableview;
    @FXML
    private TableColumn<String, String> titre;
    @FXML
    private TableColumn<Date, String> Date;
    @FXML
    private TableColumn<String, String> condidat;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ObservableList<Chatroom> meetings = FXCollections.observableArrayList();  
        
        meetings.add(new Chatroom(1, 0, "interview", new Date(5, 5, 5)));
        tableview = new TableView<>(meetings);  


        
        
    }    

    @FXML
    private void AjouterMeet(ActionEvent event) {
    }
    
}
