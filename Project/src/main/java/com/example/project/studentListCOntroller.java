package com.example.project;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import javax.xml.transform.Source;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class studentListCOntroller {

    @FXML
    private TableView<studentList> studentTableVIew;

    @FXML
    private TextField searchField;

    private static final String URL = "jdbc:mysql://localhost:3306/DatabaseCOnnection";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    @FXML
    TableColumn<studentList, String> stdentNameColumn;
    @FXML
    TableColumn<studentList, String> departmentColumn ;
    @FXML
    TableColumn<studentList, Integer> sessionColumn;
    @FXML
    TableColumn<studentList, Integer> rgistrationCol;
    @FXML
    TableColumn<studentList, Integer> roomNoColumn;
    @FXML
    TableColumn<studentList, Integer> addressColumn;
    @FXML
    TableColumn<studentList, Integer> bloodGroupColumn;
    @FXML
    TableColumn<studentList, Integer> studentPhnColumn;
    @FXML
    TableColumn<studentList, Integer> gurdiansPhnNo;
    @FXML
    TableColumn<studentList, Integer> studentEmail;
    ObservableList<studentList> data = FXCollections.observableArrayList();

    private Stage stage11;
    private Scene scene11;
    private Parent root11;


    @FXML
    public void initialize() throws SQLException {

        stdentNameColumn.setCellValueFactory(new PropertyValueFactory<>("StudentNAME"));


        departmentColumn.setCellValueFactory(new PropertyValueFactory<>("DEPARTMENT"));


        sessionColumn.setCellValueFactory(new PropertyValueFactory<>("Session"));


        rgistrationCol.setCellValueFactory(new PropertyValueFactory<>("RegistrationNo"));


        bloodGroupColumn.setCellValueFactory(new PropertyValueFactory<>("BLOODGroup"));


        roomNoColumn.setCellValueFactory(new PropertyValueFactory<>("ROOMno"));


        gurdiansPhnNo.setCellValueFactory(new PropertyValueFactory<>("GurdianPHNno"));


        studentPhnColumn.setCellValueFactory(new PropertyValueFactory<>("studentPhn"));

        addressColumn.setCellValueFactory(new PropertyValueFactory<>("ADDRESS"));


        studentEmail.setCellValueFactory(new PropertyValueFactory<>("Email"));

       // studentTableVIew.getColumns().addAll(stdentNameColumn, departmentColumn, sessionColumn, rgistrationCol, bloodGroupColumn, roomNoColumn, gurdiansPhnNo, studentPhnColumn, addressColumn,studentEmail);

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM studentInformation")) {


            while (rs.next()) {
                data.add(new studentList(
                        rs.getString("StudentName"),
                        rs.getString("Department"),
                        rs.getInt("SessionStudent"),
                        rs.getInt("Regestration_No"),
                        rs.getString("BloodGrp"),
                        rs.getInt("RoomNo"),
                        rs.getInt("GurdiansPhoneNumber"),
                        rs.getInt("StudentPhnNum"),
                        rs.getString("HomeTown"),
                        rs.getString("StudentEmail")
                ));
            }
            studentTableVIew.setItems(data);
//            while (rs.next()) {
//
//                System.out.println(rs.getString("StudentName"));
//
//
//            }


        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }

    }
    void query(ResultSet rs){

    }

    @FXML
    void searchStudentInfo(ActionEvent event) throws SQLException {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement stmt = conn.createStatement()) {

            String searchString = searchField.getText();
            String query = "SELECT * FROM studentInformation WHERE " +
                    "StudentName LIKE '%" + searchString + "%' OR " +
                    "Department LIKE '%" + searchString + "%' OR " +
                    "SessionStudent LIKE '%" + searchString + "%' OR " +
                    "Regestration_No LIKE '%" + searchString + "%' OR " +
                    "BloodGrp LIKE '%" + searchString + "%' OR " +
                    "RoomNo LIKE '%" + searchString + "%' OR " +
                    "GurdiansPhoneNumber LIKE '%" + searchString + "%' OR " +
                    "StudentPhnNum LIKE '%" + searchString + "%' OR " +
                    "HomeTown LIKE '%" + searchString + "%' OR " +
                    "StudentEmail LIKE '%" + searchString + "%'";
            ResultSet rs = stmt.executeQuery(query);


            ObservableList<studentList> data = FXCollections.observableArrayList();
            while (rs.next()) {
                data.add(new studentList(
                        rs.getString("StudentName"),
                        rs.getString("Department"),
                        rs.getInt("SessionStudent"),
                        rs.getInt("Regestration_No"),
                        rs.getString("BloodGrp"),
                        rs.getInt("RoomNo"),
                        rs.getInt("GurdiansPhoneNumber"),
                        rs.getInt("StudentPhnNum"),
                        rs.getString("HomeTown"),
                        rs.getString("StudentEmail")
                ));
            }
            studentTableVIew.setItems(data);

        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }

    @FXML
    void deleteStudentInfo(ActionEvent event) throws SQLException {
        // Get the selected row from the TableView
        studentList selectedStudent = studentTableVIew.getSelectionModel().getSelectedItem();

        if (selectedStudent != null) {
            try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                 PreparedStatement stmt = conn.prepareStatement("DELETE FROM studentInformation WHERE Regestration_No = ?")) {
                // Build the SQL DELETE statement
                stmt.setInt(1, selectedStudent.getRegistrationNo());

                // Execute the DELETE statement on the database
                stmt.executeUpdate();

                // Remove the selected row from the TableView
                studentTableVIew.getItems().remove(selectedStudent);
            } catch (SQLException e) {
                System.out.println("SQL Exception: " + e.getMessage());
            }
        }
    }

    public void gotoDeshBoard(ActionEvent event) throws IOException {
        root11 = FXMLLoader.load(getClass().getResource("deshboard.fxml"));
        stage11 = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene11 = new Scene(root11,818,615);
        stage11.setTitle("Deshboard");
        stage11.setResizable(false);
        stage11.setScene(scene11);
        stage11.show();
    }


}

