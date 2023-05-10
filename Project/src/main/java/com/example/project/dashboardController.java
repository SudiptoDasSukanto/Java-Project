package com.example.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class dashboardController {

    private Stage stage;
    private Scene scene;
    private Parent root;
    private Parent root1;

    public void studentInformation(ActionEvent event2) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Student.fxml"));
        stage = (Stage)((Node) event2.getSource()).getScene().getWindow();
        scene = new Scene(root,1150,650);
        stage.setTitle("Student Info");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public void enterRegistration(ActionEvent event) throws IOException {

        root1 = FXMLLoader.load(getClass().getResource("Registration.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root1,818,800);
        stage.setTitle("Registration Form");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
}
