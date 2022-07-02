/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 *
 * @author Oumayma
 */
public class Hper extends Application {

    // tableau de url
    private String[] tUrl = {"http://fxexperience.com/", "http://jfxtras.org/", "https://guigarage.com/"};
    // tableau de link
    private Hyperlink[] tLinks = new Hyperlink[tUrl.length];
    // tableau de caption
    private String[] tCaption = {"FX-Experience", "JFxtras", "GUI Garage"};

    @Override
    public void start(Stage primaryStage) {
        // set Title
        primaryStage.setTitle("Hyperlink Test");
        // create web view and webengine
        /*
        * webengine : to load data
        * webview : display data loaded by webengine
         */
        WebView webView = new WebView();
        // obtain web engine from web view
        WebEngine webEngine = webView.getEngine();

        // affect to each url hyperlink
        for (int i = 0; i < tUrl.length; i++) {
            // get url from here because it not accessible inside setOnAction
            final String url = tUrl[i];
            // create hyperlnk
            tLinks[i] = new Hyperlink(tCaption[i]);
            tLinks[i].setOnAction(event -> {
                webEngine.load(url);
                
            }
                   
            );
        }
        // create hbox to append all links
        HBox hbox = new HBox();
        hbox.getChildren().addAll(tLinks);

        // create vbox (root node)and vbox to it
        VBox vbox = new VBox();
        vbox.getChildren().addAll(hbox, webView);

        // create scene and add it to Stage and then display Stage
        Scene scene = new Scene(vbox, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
