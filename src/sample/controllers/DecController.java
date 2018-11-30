package sample.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DecController {

    @FXML
    private Button decrypt;

    @FXML
    private TextArea cipher;

    @FXML
    private TextArea truemes;

    @FXML
    private TextField key;

    @FXML
    private Button ret;

    @FXML
    void init(){}

    public void ClickOnRet(ActionEvent actionEvent) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../fx/chooseAct.fxml"));

        try { Parent root6 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root6));
            stage.show(); }

        catch(Exception e) {
            e.printStackTrace();
        }

        Stage stage = (Stage) ret.getScene().getWindow();
        stage.close();
    }
    }


