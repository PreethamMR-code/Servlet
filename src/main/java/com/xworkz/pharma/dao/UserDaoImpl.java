package com.xworkz.pharma.dao;

import com.xworkz.pharma.dto.UserDto;
import lombok.SneakyThrows;

import java.sql.*;

public class UserDaoImpl implements UserDao {

    private static final String URL = "jdbc:mysql://localhost:3306/matrimony_db";
    private static final String USER = "root";
    private static final String PASS = "0000";

    static {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySQL driver loaded");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    @Override
    @SneakyThrows
    public boolean save(UserDto userDto) {
        String sql = "INSERT INTO users (FirstName, LastName, Email, Phone, Age) VALUES (?, ?, ?, ?, ?)";

        try(Connection connection = DriverManager.getConnection(URL,USER,PASS);

            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {


            preparedStatement.setString(1, userDto.getFirstName());
            preparedStatement.setString(2, userDto.getLastName());
            preparedStatement.setString(3, userDto.getEmail());
            preparedStatement.setString(4, userDto.getPhone());
            preparedStatement.setInt(5, userDto.getAge());

            System.out.println("saving to DB:"+userDto);

            int rows = preparedStatement.executeUpdate();

            System.out.println("rows inserted:"+rows);

            return rows > 0;
        }
        catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean existsByEmail(String email) {
        String sql1 = "SELECT 1 FROM users WHERE Email = ? LIMIT 1";


        try(Connection connection = DriverManager.getConnection(URL,USER,PASS);
        PreparedStatement preparedStatement = connection.prepareStatement(sql1)){

            preparedStatement.setString(1,email);


            try(ResultSet rs = preparedStatement.executeQuery()){
                return rs.next();
            }

        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean existsByPhone(String phone) {
        String sql2 = "select 1 from users where Phone = ? LIMIT 1";

        try(Connection connection = DriverManager.getConnection(URL,USER,PASS);

            PreparedStatement preparedStatement = connection.prepareStatement(sql2)){

            preparedStatement.setString(1,phone);

            try(ResultSet resultSet = preparedStatement.executeQuery()){
                return  resultSet.next();
            }
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
}
