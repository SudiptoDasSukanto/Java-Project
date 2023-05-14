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
    private Parent root2 , root3 , root4,root5,root6;

    public void studentInformation(ActionEvent event2) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Student.fxml"));
        stage = (Stage)((Node) event2.getSource()).getScene().getWindow();
        scene = new Scene(root);
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
    public void provostPage(ActionEvent event1) throws IOException {

        root2 = FXMLLoader.load(getClass().getResource("Provost.fxml"));
        stage = (Stage)((Node) event1.getSource()).getScene().getWindow();
        scene = new Scene(root2);
        stage.setTitle("Provost Form");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public void goLogeINpage(ActionEvent event) throws IOException{
        root3 = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root3);
        stage.setTitle("Hall Managment");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public void gotoStuffPage(ActionEvent event) throws IOException{
        root4 = FXMLLoader.load(getClass().getResource("Stuff.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root4);
        stage.setTitle("Stuff Managment");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public void Canteen(ActionEvent event) throws IOException{
        root5 = FXMLLoader.load(getClass().getResource("Canteen.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root5);
        stage.setTitle("Canteen");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public void About(ActionEvent event) throws IOException{
        root6 = FXMLLoader.load(getClass().getResource("About.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root6);
        stage.setTitle("Canteen");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }



}
