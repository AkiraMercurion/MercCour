package sample.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DecController {

    @FXML
    private Button decrypt;

    @FXML
    void setDecrypt(){
        decrypt.setOnAction(event -> {});
    }

    @FXML
    private TextArea cipher;

    @FXML
    private TextArea truemes;

    @FXML
    private TextField key;
    @FXML
    void setKey(){
        key.setOnAction(event -> {});
    }

    @FXML
    private Button ret;

    @FXML
    void setRet(){
        ret.setOnAction(event -> {});
    }



    @FXML
    void init(){}

}

