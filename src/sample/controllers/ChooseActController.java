
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
        private Button enc;


        public void ClickOnDec(ActionEvent actionEvent) {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../fx/dec.fxml"));

                try {
                    Parent root5 = fxmlLoader.load();
                    Stage stage = new Stage();
                    stage.setScene(new Scene(root5));
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
                    Parent root6 = fxmlLoader.load();
                    Stage stage = new Stage();
                    stage.setScene(new Scene(root6));
                    stage.show();
                } catch(Exception e) {
                    e.printStackTrace();
                }

                Stage stage = (Stage) enc.getScene().getWindow();
                stage.close();

        }
    }