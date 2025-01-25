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

@WebServlet("/cuenta")
public class CuentaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String rutCliente = request.getParameter("rutCliente");
        double monto = Double.parseDouble(request.getParameter("monto"));
        String ejecutivo = request.getParameter("ejecutivo");

        try (Connection conn = DatabaseUtil.getConnection()) {
            String sql = "INSERT INTO CtaCorriente (RutCliente, monto, ejecutivo) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, rutCliente);
            stmt.setDouble(2, monto);
            stmt.setString(3, ejecutivo);
            stmt.executeUpdate();

            response.sendRedirect("cuenta.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}