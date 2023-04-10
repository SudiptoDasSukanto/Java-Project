package com.example.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class submitController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void submitTOdashboard(ActionEvent event2) throws IOException {
        root = FXMLLoader.load(getClass().getResource("deshboard.fxml"));
        stage = (Stage)((Node) event2.getSource()).getScene().getWindow();
        scene = new Scene(root,818,615);
        stage.setTitle("Deshboard");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }



}
