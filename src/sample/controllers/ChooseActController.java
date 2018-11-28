
    package sample.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
    public class ChooseActController {

        @FXML
        private Button decrypt;

        @FXML
        void setDecrypt(){
            decrypt.setOnAction(event -> {});
        }

        @FXML
        private Button encrypt;

        @FXML
        void setEncrypt(){
            encrypt.setOnAction(event -> {});
        }

        @FXML
        void init(){}

    }