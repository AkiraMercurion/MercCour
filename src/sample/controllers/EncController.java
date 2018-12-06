package sample.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class EncController {


    char[] characters = Table.c;

    @FXML
    private Button encrypt;

    @FXML
    private TextArea cipher;

    @FXML
    private TextArea truemes;

    @FXML
    private TextArea key;

    @FXML
    private Button ret;


    public void ClickOnRet(ActionEvent actionEvent) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../fx/chooseAct.fxml"));

        try {
            Parent root6 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root6));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Stage stage = (Stage) ret.getScene().getWindow();
        stage.close();
    }

    public void ClickOnEnc2(ActionEvent actionEvent) {

        cipher.setText(Encript(truemes.getText(), Integer.valueOf(key.getText())));}

    private String Encript(String textUP, int keyy) {
        StringBuilder res = new StringBuilder();
        char[] elem = textUP.toCharArray();
        boolean b;
        for (int i = 0; i < textUP.length(); i++) {
            b = true;
            for (int j = 0; j < characters.length; j++) {
                if (elem[i] == characters[j]) {
                    b = false;
                    res.append(characters[(j + keyy) % characters.length]);
                }
            }
            if (b) {
                res.append(elem[i]);
            }
        }
        return res.toString();
    }
}
