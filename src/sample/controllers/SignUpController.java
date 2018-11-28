package sample.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class SignUpController {

    @FXML
    private PasswordField pass;

    @FXML
    private TextField login;

    @FXML
    private Button signUp;

    @FXML
    private Button signIn;

    @FXML
    void setPass() {
        pass.setOnAction(event -> {
        });
    }
    @FXML
    void setLogin(){
        login.setOnAction(event -> {});
    }
    @FXML
    void setButUp(){
        signUp.setOnAction(event -> {});
    }
    @FXML
    void setButIn(){
        pass.setOnAction(event -> {});
    }
}