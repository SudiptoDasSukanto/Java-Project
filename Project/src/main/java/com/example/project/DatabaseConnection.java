package com.example.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
        public Connection databaselink;

        public Connection getConnection() {
            String databaseName = "DatabaseCOnnection" ;
            String databaseUser = "root" ;
            String databasePassword = "" ;
            String url = "jdbc:mysql://localhost/" + databaseName ;

            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                databaselink = DriverManager.getConnection(url,databaseUser,databasePassword);
            }catch(Exception e){
                e.printStackTrace();
            }

            return databaselink;
        }
}
