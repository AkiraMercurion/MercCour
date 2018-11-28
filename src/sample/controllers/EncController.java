package sample.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class EncController {

    @FXML
    private Button encrypt;

    @FXML
    private TextArea cipher;

    @FXML
    private TextArea truemes;

    @FXML
    private TextField key;

    @FXML
    private Button ret;

    @FXML
    void setEncrypt(){
        encrypt.setOnAction(event -> {});
    }
//    @FXML
//    void setCipher(){
//        cipher.setOnAction(event -> {});
//    }
    @FXML
    void setKey(){
    key.setOnAction(event -> {});
}
    @FXML
    void setRet(){
        ret.setOnAction(event -> {});
    }
//    @FXML
//    void setTruemes(){
//        truemes.setOnAction(event -> {});
//    }
//    @FXML
//    void init(){}

}
