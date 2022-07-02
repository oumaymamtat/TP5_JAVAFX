/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Hyperlink;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 * FXML Controller class
 *
 * @author Oumayma
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    // id of fc_exp hyperlink created in scene builder
    private Hyperlink fx_exp;
    @FXML
    private WebView webView;
    @FXML
    private Hyperlink jfxtras;
    @FXML
    private Hyperlink guigarage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    // mathod to handle FxExperience Button
    @FXML
    private void handleFxExp(ActionEvent event) {
        webView.getEngine().load("http://fxexperience.com/");
    }
    
    @FXML
    private void handleJfxtras(ActionEvent event) {
        webView.getEngine().load("http://jfxtras.org/");
    }
    
    @FXML
    private void handleguigarage(ActionEvent event) {
        webView.getEngine().load("https://guigarage.com/");
    }
    
}
