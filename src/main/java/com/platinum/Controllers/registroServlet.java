package com.platinum.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.platinum.utils.DatabaseUtil;

@WebServlet("/registro")
public class RegistroServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String rut = request.getParameter("rut");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String direccion = request.getParameter("direccion");
        String correo = request.getParameter("correo");
        String telefono = request.getParameter("telefono");
        String nombreMascota = request.getParameter("nombreMascota");

        try (Connection conn = DatabaseUtil.getConnection()) {
            String sql = "INSERT INTO Persona (Rut, nombre, apellido, direccion, correo, telefono, nombreMascota) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, rut);
            stmt.setString(2, nombre);
            stmt.setString(3, apellido);
            stmt.setString(4, direccion);
            stmt.setString(5, correo);
            stmt.setString(6, telefono);
            stmt.setString(7, nombreMascota);
            stmt.executeUpdate();

            response.sendRedirect("index.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}