/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;

/**
 *
 * @author Oumayma
 */
public class Login extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // set title
        primaryStage.setTitle("JavaFX Welcome");
        /*
        ** Create root node (grid) and affect nodes ( buttons, text , text filed , password )
        */
        // create grid layout : GridPane is used while creating forms in JFX
        GridPane grid = new GridPane();
        // set pane alignment
        grid.setAlignment(Pos.CENTER);
        // set hgap : horizontal gap (ecart) between columns 
        grid.setHgap(10);
        // set vgap : vertical gap between rows
        grid.setVgap(10);
        // set padding 
        grid.setPadding(new Insets(10));
        // create welcome text
        Text welcomeTxt = new Text("Welcome");
        // set welcomeTxt font
        welcomeTxt.setFont(Font.font("Tahoma", FontWeight.LIGHT, 25));
        // add welcomeTxt to grid (grid,column,row)
        grid.add(welcomeTxt, 0, 0);
        // create username label
        Label usernameLbl = new Label("User Name: ");
        // add usernameLbl to grid
        grid.add(usernameLbl, 0, 1);
        // create username TextField
        TextField usernameTxtFld = new TextField();
        // set prompttext (like placeholder)
        usernameTxtFld.setPromptText("Enter user name");
        // add usernameTxtFld to grid
        grid.add(usernameTxtFld, 1, 1);
        // create password label
        Label passwordLbl = new Label("Password: ");
        // add passwordLbl to grid
        grid.add(passwordLbl, 0, 2);
        // create password Field
        PasswordField passworFld = new PasswordField();
        // set prompttext (like placeholder)
        passworFld.setPromptText("Enter password");
        // add passworFld to grid
        grid.add(passworFld, 1, 2);
        // create sign in button
        Button signinBtn = new Button("Sign in");
        // add button to grid 
        grid.add(signinBtn, 1, 3);
        // add event handler to signin button
        signinBtn.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                System.out.println("successfully signed in !");
                final Text actionTxt = new Text("Sign in button pressed");
                actionTxt.setFill(Color.FIREBRICK);
                grid.add(actionTxt,1,4);                
            }
            
        });
        
        /*
        * pass root node to scene
        */
        
        Scene scene = new Scene(grid,300,300);
        
          // add css effects
        scene.getStylesheets().add(Login.class.getResource("Login.css").toExternalForm());
        
        /*
        * pass scene to Stage
        */
        
        primaryStage.setScene(scene);
        // show primary stage
        primaryStage.show();
        
      

    }

}
