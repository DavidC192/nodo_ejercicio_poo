package com.eafit.nodo;

import java.sql.*;
public class Main {    public static void main(String[] args) throws SQLException {
    Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "*y#yDm^Jdv@L-");
    try (Statement statement = connection.createStatement();
         ResultSet rs = statement.executeQuery("SELECT * FROM Persona")) {
        while (rs.next()) {
            String nombre = rs.getString("nombre");
            String apellido = rs.getString("apellido");
            String correo = rs.getString("correo");
            System.out.println("Usuario: " + nombre + " " + apellido + " - " + correo);
        }
    }
}
}