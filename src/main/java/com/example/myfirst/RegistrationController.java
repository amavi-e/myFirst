package com.example.myfirst;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class RegistrationController {
    @FXML
    public TextField fullNameText;

    @FXML
    public TextField EmailIdText;

    @FXML
    public TextField passwordText;

    @FXML
    public Button submitButton;



    public void onSubmitButtonClick() throws Exception{
        String fullName = fullNameText.getText();
        String emailId = EmailIdText.getText();
        String password = passwordText.getText();
        if (!(fullName.isEmpty() || emailId.isEmpty() || password.isEmpty())) {
            Stage previousStage = (Stage) submitButton.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
            previousStage.setScene(new Scene(root, 550, 300));
            previousStage.show();
        }
        else {
            System.out.println("You have to enter all the required fields");
        }

    }
}
