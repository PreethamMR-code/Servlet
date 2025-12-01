package com.xworkz.data.query;

import com.xworkz.data.constants.DBConstant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SportsQuery {

    public static void main(String[] args) {

        try(Connection connection = DriverManager.getConnection(DBConstant.URL,DBConstant.USERNAME,DBConstant.PASSWORD);

            Statement statement = connection.createStatement()){

            System.out.println("all rows ");
            String sqlAll = "Select * from sports";
            ResultSet rsall = statement.executeQuery(sqlAll);
            while (rsall.next()){
                System.out.println(
                        "id:" +rsall.getInt("sport_id")+
                                "name:" +rsall.getString("sport_name") +
                                "category:" + rsall.getString("category") +
                                "origin_country:" + rsall.getString("origin_country"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }


}
