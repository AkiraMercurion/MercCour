
package sample.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import sample.Main;

    public class ChooseActController {

        @FXML
        private Button decrypt;

        @FXML
        void setDecrypt(){
            decrypt.setOnAction(event -> {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("fx/dec.fxml"));

            });

        }

        @FXML
        private Button encrypt;

        @FXML
        void setEncrypt(){
            encrypt.setOnAction(event -> { FXMLLoader loader = new FXMLLoader(getClass().getResource("fx/enc.fxml"));
                });
        }

        @FXML
        void init(){}

    }