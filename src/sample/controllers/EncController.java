package sample.controllers;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class EncController {


    char[] characters = new char[] { 'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И',
            'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С',
            'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ь', 'Ы', 'Ъ','I','Ї','Ґ',
            'Э', 'Ю', 'Я', ' ','.',',','!','?',';',':','A','B','C','D','E','F','G','H','I','J','K','L','M',
            'N','O','P','Q','R','S','T','U','V','W','X','Y','Z', '1', '2', '3', '4', '5', '6', '7',
            '8', '9', '0' };

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
        } catch(Exception e) {
            e.printStackTrace();
        }

        Stage stage = (Stage) ret.getScene().getWindow();
        stage.close();
    }

    public void ClickOnEnc2(ActionEvent actionEvent) {
       encrypt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                cipher.setText(Rad(truemes.getText(), Integer.parseInt(key.getText())));
            }
        });
    }
    public String Rad(String text,int keyy){
//        text = truemes.getText();
//        keyy = Integer.parseInt(key.getText());
        String res = "";
        text.toUpperCase();
        char[] elem = text.toCharArray();
        for(int i = 0; i < text.length(); i++){
            for(int j = 0; j < characters.length; j++){
                if  (elem[i] == characters[j]){
                    res += characters[j + keyy];
                }
            }
        }
        return res;
    }
}
