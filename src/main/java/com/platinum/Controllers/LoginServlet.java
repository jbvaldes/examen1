package com.platinum.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.platinum.utils.DatabaseUtil;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String rut = request.getParameter("rut");
        String password = request.getParameter("password");

        try (Connection conn = DatabaseUtil.getConnection()) {
            String sql = "SELECT * FROM ejecutivo WHERE rutEjecutivo = ? AND nombre = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, rut);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                response.sendRedirect("cuenta.jsp");
            } else {
                response.sendRedirect("login.jsp?error=1");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}