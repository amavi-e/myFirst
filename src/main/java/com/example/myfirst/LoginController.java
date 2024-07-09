package com.example.myfirst;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    public MenuItem closeMenuButton;
    @FXML
    public TextField usernameText;
    @FXML
    public PasswordField passwordText;
    @FXML
    public Label myspacelabel;

    @FXML
    protected void onHelloButtonClick() {
        System.exit(0);
    }

    @FXML
    protected void onLoginButtonClick() {
        String username = usernameText.getText();
        String password = passwordText.getText();
        if (username.isEmpty() || password.isEmpty()) {
            myspacelabel.setMaxSize(200, 50);
            myspacelabel.setText("Please enter your username and password");
        }
    }
}
