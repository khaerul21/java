package com.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class MyConfig {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/db_sisfo";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";

    private static Connection connect;
    private static Statement statement;
    private static ResultSet resultSet;

     public static void connection(){
        try {
            connect = DriverManager.getConnection(DB_URL , DB_USER , DB_PASS );
            System.out.println("Connection : Succes");
        } catch (Exception e) {
            e.printStackTrace();
        }
     }

     public static void getDatabase(){
        MyConfig.connection();
        try{
            statement = connect.createStatement();
            
        statement = connect.createStatement();
        resultset = statement.executeQuery("SELECT * FROM `db_sisfo");

        while (resultSet.next()){
            System.out.println(
                resultSet.getString("Nama") + ": Rp."+
                resultSet.getString("Harga") + "( " +
                resultSet.getString("")
            );


        }

        }


     }
}
