package sample.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignInController {

    @FXML
    private PasswordField pass;

    @FXML
    private TextField login;

    @FXML
    private Button signIn;

    @FXML
    private TextField name;

    @FXML
    private TextField surname;

    @FXML
    void setPass(){
        pass.setOnAction(event -> {});
    }
    @FXML
    void setLogin(){
        login.setOnAction(event -> {});
    }
    @FXML
    void setButton(){
        signIn.setOnAction(event -> {});
    }
    @FXML
    void setName(){
        name.setOnAction(event -> {});
    }
    @FXML
    void setSurname(){
        surname.setOnAction(event -> {});
    }

}


