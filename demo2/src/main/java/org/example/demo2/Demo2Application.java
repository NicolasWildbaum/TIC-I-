package org.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;


@SpringBootApplication
public class Demo2Application {

        public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String password = "test";

            try {
                Connection connn = DriverManager.getConnection(url, user, password);
                System.out.println("Conexión exitosa a PostgreSQL!");

            } catch (SQLException e) {
                System.out.println("Error en la conexión: " + e.getMessage());

            }

        }

    }






