package com.example.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.sql.*;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class submitController {

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TextField GardiansPhnNo;

    @FXML
    private TextField HomeTown;

    @FXML
    private TextField bloodGrp;

    @FXML
    private Button clear;

    @FXML
    private TextField depertment;

    @FXML
    private TextField registrationNo;

    @FXML
    private TextField roomNo;

    @FXML
    private TextField session;

    @FXML
    private TextField studentEmail;

    @FXML
    private TextField studentPhnNo;

    @FXML
    private TextField student_name;

    @FXML
    private Button submit;

    private Stage stage11;
    private Scene scene11;
    private Parent root11;

    public void submitTOdashboard(ActionEvent event2) throws IOException {
        String StudentName=student_name.getText();
        String Department=depertment.getText();
        Integer Session_student = Integer.valueOf(session.getText());
        Integer RegistrationNo= Integer.valueOf(registrationNo.getText());
        String BloodGrp=bloodGrp.getText();
        Integer RoomNumber = Integer.valueOf(roomNo.getText());
        Integer GurdianPhoneNumber= Integer.valueOf(GardiansPhnNo.getText());
        Integer StudentPhoneNumber= Integer.valueOf(studentPhnNo.getText());
        String Home_Town=HomeTown.getText();
        String StudentEmail=studentEmail.getText();

       insertData(StudentName,Department,Session_student,RegistrationNo,BloodGrp,RoomNumber,GurdianPhoneNumber,StudentPhoneNumber,Home_Town,StudentEmail);
    }


    public void insertData(String StudentName,String Department,Integer Session_student,Integer RegistrationNo,String BloodGrp,Integer RoomNumber,Integer GurdianPhoneNumber,Integer StudentPhoneNumber,String Home_Town,String StudentEmail) {
        try {

            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            String databaseName = "DatabaseCOnnection" ;
            String databaseUser = "root" ;
            String databasePassword = "" ;
            String url = "jdbc:mysql://localhost/" + databaseName ;
            // Connect to the database
            Connection connection = DriverManager.getConnection(url,databaseUser , databasePassword);

            // Create a prepared statement with parameterized SQL
            String sql =  "INSERT INTO studentInformation (StudentName, Department, SessionStudent , Regestration_No, BloodGrp, RoomNo, GurdiansPhoneNumber,StudentPhnNum, HomeTown , StudentEmail) VALUES (?, ?,?, ?,?, ?,?, ?,?,?)";

            PreparedStatement statement = connection.prepareStatement(sql);

            // Set the parameter values for the prepared statement
            statement.setString(1, StudentName);
            statement.setString(2, Department);
            statement.setInt(3, Session_student);
            statement.setInt(4, RegistrationNo);
            statement.setString(5, BloodGrp);
            statement.setInt(6, RoomNumber);
            statement.setInt(7, GurdianPhoneNumber);
            statement.setInt(8, StudentPhoneNumber);
            statement.setString(9, Home_Town);
            statement.setString(10, StudentEmail);


            //statement.setString(3, email);

            // Execute the prepared statement to insert the data
            int numRowsInserted = statement.executeUpdate();

            // Print the number of rows inserted
            System.out.println(numRowsInserted + " rows inserted");

            // Close the statement and connection
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deshboardFromRegi(ActionEvent event) throws IOException{
        root11 = FXMLLoader.load(getClass().getResource("deshboard.fxml"));
        stage11 = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene11 = new Scene(root11,818,615);
        stage11.setTitle("Deshboard");
        stage11.setResizable(false);
        stage11.setScene(scene11);
        stage11.show();
    }



}
