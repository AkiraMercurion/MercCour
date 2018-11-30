package sample.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



public class SignUpController {

    @FXML
    private PasswordField pass;

    @FXML
    private TextField login;

    @FXML
    private Button signUp;

    @FXML
    private Button signIn;


    public void onClickSignIn(ActionEvent actionEvent) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../fx/signInn.fxml"));

        try {
            Parent root2 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root2));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }

        Stage stage = (Stage) signIn.getScene().getWindow();
        stage.close();
    }


    public void onClickSignUp(ActionEvent actionEvent) {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../fx/chooseAct.fxml"));

        try {
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }

        Stage stage = (Stage) signUp.getScene().getWindow();
        stage.close();
    }
}
