package com.example.project;

import javafx.beans.Observable;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class studentListCOntroller {
//    @FXML
//    private TableView<studentList> studentTableView ;
//    @FXML
//    private TableColumn<studentList , Integer> studentIdColumn ;
//    @FXML
//    private TableColumn<studentList , String> studentNameColumn ;
//    @FXML
//    private TableColumn<studentList , String> departmentColumn ;
//    @FXML
//    private TableColumn<studentList , String> studentPhnColumn ;
//    @FXML
//    private TableColumn<studentList , String> roomNoColumn ;
//    @FXML
//    private TableColumn<studentList , String> sessionColumn ;
//    @FXML
//    private TableColumn<studentList , String> addressColumn ;
//    @FXML
//    private TableColumn<studentList , String> bloodGroupColumn ;
//
//    ObservableList<studentList> studentListObservableList = FXCollections.observableArrayList();
//
//
//    @Override
//    public void initialize(URL url, ResourceBundle resource){
//
//        DatabaseConnection connect = new DatabaseConnection();
//        Connection connectDatabase =  connect.getConnection();
//
//        String studentQuery = "SELECT StudentID,StudentName,Department,PhoneNo, RoomNo , Session , Address , BloodGroup FROM studentInformation" ;
//
//        try{
//            Statement statement = connectDatabase.createStatement();
//            ResultSet queryResult = statement.executeQuery(studentQuery);
//
//            while (queryResult.next()){
//                Integer queryStudentId = queryResult.getInt("StudentID");
//                String queryStudentName = queryResult.getString("StudentName");
//                String queryDepartment = queryResult.getString("Department");
//                String queryStudentPhn = queryResult.getString("PhoneNo");
//                String queryStudentRoomNo = queryResult.getString("RoomNo");
//                String queryStudentSession = queryResult.getString("Session");
//                String queryStudentAddress = queryResult.getString("Address");
//                String queryStudentBloodGroup = queryResult.getString("BloodGroup");
//
//
//                studentListObservableList.add(new studentList(queryStudentId,queryStudentName,queryDepartment,queryStudentPhn,queryStudentRoomNo,queryStudentSession,queryStudentAddress,queryStudentBloodGroup));
//            }
//
////            studentIdColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<studentList, Integer>, ObservableValue<Integer>>() {
////                @Override
////                public ObservableValue<Integer> call(TableColumn.CellDataFeatures<com.example.project.studentList, Integer> STUDENTID) {
////                    return new SimpleIntegerProperty(STUDENTID.getValue().getSTUDENTID()).asObject();
////                }
////            });
//
//            studentIdColumn.setCellValueFactory(new PropertyValueFactory<studentList, Integer>("StudentID"));
//            studentNameColumn.setCellValueFactory(new PropertyValueFactory<studentList, String>("StudentNAME"));
//            departmentColumn.setCellValueFactory(new PropertyValueFactory<studentList, String>("DEPARTMENT"));
//            studentPhnColumn.setCellValueFactory(new PropertyValueFactory<studentList, String>("PHNno"));
//            roomNoColumn.setCellValueFactory(new PropertyValueFactory<studentList, String>("ROOMno"));
//            sessionColumn.setCellValueFactory(new PropertyValueFactory<studentList, String>("SESSION"));
//            addressColumn.setCellValueFactory(new PropertyValueFactory<studentList, String>("ADDRESS"));
//            bloodGroupColumn.setCellValueFactory(new PropertyValueFactory<studentList, String>("BLOODGroup"));
//
//
//
//
//            studentTableView.setItems(studentListObservableList);
//
//
//
//        }catch(SQLException e){
//            Logger.getLogger(studentListCOntroller.class.getName()).log(Level.SEVERE,null,e);
//            e.printStackTrace();
//        }
//    }






}
