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

import java.lang.reflect.Array;
import java.util.Scanner;

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
    }}

//    public void Key(){
//        String keyy;
//        keyy = key.getText();
//        System.out.println(keyy);
//    }


//    public class ClickOnEnc (ActionEvent actionEvent) {
//  String keyy;
//        keyy = key.getText();
////        String cif;
////        cif = cipher.getText();
//
//        char[] characters = new char[] { 'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И',
//                'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С',
//                'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ь', 'Ы', 'Ъ',
//                'Э', 'Ю', 'Я', ' ','.',',','!','?',';',':','A','B','C','D','E','F','G','H','I','J','K','L','M',
//                'N','O','P','Q','R','S','T','U','V','W','X','Y','Z', '1', '2', '3', '4', '5', '6', '7',
//                '8', '9', '0' };
//
//        int N = characters.length;
//        String input = null;
//        input = input.toUpperCase();
//        keyy = keyy.toUpperCase();
//        String result = "";
//        int keyIndex = 0;
//        for (char symbol : input) {
//            int a = (Array.indexOf(characters, symbol)+(Array.indexOf(characters, keyy[keyIndex])))% N;
//            result += characters[a];
//            keyIndex++;
//
//            if ((keyIndex + 1)== keyy.length()) keyIndex=0;
//        }
//        return result;
//    }
//}
