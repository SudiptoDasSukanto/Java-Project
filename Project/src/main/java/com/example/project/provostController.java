package com.example.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class provostController {

    private Stage stage11;
    private Scene scene11;
    private Parent root11;

    public void gotoDeshBoardpage(ActionEvent event) throws IOException{
        root11 = FXMLLoader.load(getClass().getResource("deshboard.fxml"));
        stage11 = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene11 = new Scene(root11,818,615);
        stage11.setTitle("Deshboard");
        stage11.setResizable(false);
        stage11.setScene(scene11);
        stage11.show();
    }
}
