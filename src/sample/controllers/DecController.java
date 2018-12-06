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
    private char[] characters = Table.c;

    @FXML
    private Button decrypt;

    @FXML
    private TextArea cipher;

    @FXML
    private TextArea truemes;

    @FXML
    private TextField key2;

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


    public void ClickOnDec2(ActionEvent actionEvent) {

        truemes.setText(Decrypt(cipher.getText(), Integer.valueOf(key2.getText())));
        System.out.println(characters.length);

    }
    private String Decrypt(String text, int key2){
        StringBuilder res = new StringBuilder();
        System.out.println(text);
        char[] elem = text.toCharArray();
        boolean b;
        for(int i = 0; i < text.length(); i++){
            b = true;
            for(int j = 0; j < characters.length; j++){
                if  (elem[i] == characters[j]){
                    b = false;
                    res.append(characters[Math.abs( Math.abs(j - key2)- characters.length) ]);
                }
            }
            if (b) {
                res.append(elem[i]);
            }
        }
        return res.toString();
    }}







