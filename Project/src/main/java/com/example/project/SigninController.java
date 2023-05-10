package com.example.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collections;

public class SigninController {

    @FXML
    private Button login;
    @FXML
    private Label loginmessageLabel;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField passwordPasswordField;
    private Stage stage;
    private Scene scene;
    private Parent root1;
    private Parent root2;



    public void teacherLogin(ActionEvent event) throws IOException {

        if(!usernameTextField.getText().isBlank() && !passwordPasswordField.getText().isBlank()){

            DatabaseConnection connect = new DatabaseConnection();
            Connection connectDatabase =  connect.getConnection();

            String verifyLogin =  "SELECT count(1) FROM registration WHERE Username= '"+usernameTextField.getText()+"' AND Password ='"+passwordPasswordField.getText()+"'";
            try{
                Statement statement = connectDatabase.createStatement();
                ResultSet quaryResult = statement.executeQuery(verifyLogin);

                while(quaryResult.next()){
                    if(quaryResult.getInt(1)==1){

                        root1 = FXMLLoader.load(getClass().getResource("deshboard.fxml"));
                        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
                        scene = new Scene(root1,818,615);
                        stage.setTitle("Deshboard");
                        stage.setResizable(false);
                        stage.setScene(scene);
                        stage.show();
                    }else{
                        loginmessageLabel.setText("Invalid Username and Password");
                    }
                }

            }catch(Exception e){
                e.printStackTrace();
            }


        }else{
            loginmessageLabel.setText("Please set Username and Password");
        }

    }



}
