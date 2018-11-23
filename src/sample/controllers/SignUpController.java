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
    private Label labpass;

    @FXML
    private TextField login;

    @FXML
    private Button signUp;

    @FXML
    private Button signIn;


    @FXML
    public void init(){
// signUp.setOnAction(event -> { Parent root = FXMLLoader.(getClass().getResource("fx/signUp.fxml")) ;



    }

    public void signUp(ActionEvent actionEvent) {

    }

    public void signIn(ActionEvent actionEvent) {
    }
}
