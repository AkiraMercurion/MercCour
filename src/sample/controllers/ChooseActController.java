
package sample.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import sample.Main;

    public class ChooseActController {

        @FXML
        private Button dec;

        @FXML
        private Button ret;

        @FXML
        private Button enc;


        public void ClickOnDec(ActionEvent actionEvent) {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../fx/dec.fxml"));

            try {
                Parent root20 = fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root20));
                stage.show();
            } catch(Exception e) {
                e.printStackTrace();
            }

            Stage stage = (Stage) dec.getScene().getWindow();
            stage.close();
        }


        public void ClickOnEnc(ActionEvent actionEvent) {

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../fx/enc.fxml"));

                try {
                    Parent root1 = fxmlLoader.load();
                    Stage stage = new Stage();
                    stage.setScene(new Scene(root1));
                    stage.show();
                } catch(Exception e) {
                    e.printStackTrace();
                }

                Stage stage = (Stage) enc.getScene().getWindow();
                stage.close();

        }

        public void ClickOnRet(ActionEvent actionEvent) {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../fx/signUp.fxml"));

            try {
                Parent root10 = fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root10));
                stage.show();
            } catch(Exception e) {
                e.printStackTrace();
            }

            Stage stage = (Stage) ret.getScene().getWindow();
            stage.close();
        }
    }