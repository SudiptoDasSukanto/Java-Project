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

import java.io.IOException;
import java.sql.*;

public class stuffController {

    private Stage stage11;
    private Scene scene11;
    private Parent root11;



//    @FXML
//    private TableView<studentList> stuffTableVIew;
//
//    @FXML
//    private TextField searchField;
//
//    private static final String URL = "jdbc:mysql://localhost:3306/DatabaseCOnnection";
//    private static final String USERNAME = "root";
//    private static final String PASSWORD = "";
//    @FXML
//    TableColumn<stuffList, String> NameColumn;
//    @FXML
//    TableColumn<stuffList, Integer> IDcol;
//    @FXML
//    TableColumn<stuffList, Integer> roomNoColumn;
//    @FXML
//    TableColumn<stuffList, String> addressColumn;
//    @FXML
//    TableColumn<stuffList, String> bloodGroupColumn;
//    @FXML
//    TableColumn<stuffList, Integer> stuffPhnColumn;
//    @FXML
//    TableColumn<stuffList, String> sEmail;
//
//    @FXML
//    TableColumn<stuffList, String> work;
//    ObservableList<studentList> data = FXCollections.observableArrayList();
//
//
//
//    @FXML
//    public void initialize() throws SQLException {
//
//        NameColumn.setCellValueFactory(new PropertyValueFactory<>("NAME"));
//
//
//        IDcol.setCellValueFactory(new PropertyValueFactory<>("ID"));
//
//
//        bloodGroupColumn.setCellValueFactory(new PropertyValueFactory<>("BLOODGroup"));
//
//
//        roomNoColumn.setCellValueFactory(new PropertyValueFactory<>("ROOMno"));
//
//
//        work.setCellValueFactory(new PropertyValueFactory<>("work"));
//
//
//        stuffPhnColumn.setCellValueFactory(new PropertyValueFactory<>("stuffPhn"));
//
//        addressColumn.setCellValueFactory(new PropertyValueFactory<>("ADDRESS"));
//
//
//        sEmail.setCellValueFactory(new PropertyValueFactory<>("Email"));
//
//        // studentTableVIew.getColumns().addAll(stdentNameColumn, departmentColumn, sessionColumn, rgistrationCol, bloodGroupColumn, roomNoColumn, gurdiansPhnNo, studentPhnColumn, addressColumn,studentEmail);
//
//        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery("SELECT * FROM stuffInfo")) {
//
//
//            while (rs.next()) {
//                data.add(new stuffList(
//                        rs.getString("Name"),
//                        rs.getInt("ID"),
//                        rs.getString("Blood Grp"),
//                        rs.getInt("Room No"),
//                        rs.getInt("Phone No"),
//                        rs.getString("HomeTown"),
//                        rs.getString("Email"),
//                        rs.getString("Work")
//                ));
//            }
//            stuffTableVIew.setItems(data);
////            while (rs.next()) {
////
////                System.out.println(rs.getString("StudentName"));
////
////
////            }
//
//
//        } catch (SQLException e) {
//            System.out.println("SQL Exception: " + e.getMessage());
//        }
//
//    }
   public void gotoDeshBoard(ActionEvent event) throws IOException{
        root11 = FXMLLoader.load(getClass().getResource("deshboard.fxml"));
        stage11 = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene11 = new Scene(root11,818,615);
        stage11.setTitle("Deshboard");
        stage11.setResizable(false);
        stage11.setScene(scene11);
        stage11.show();
    }
}
