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

@WebServlet("/transferencia")
public class TransferenciaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String rutCliente = request.getParameter("rutCliente");
        String rutDueño = request.getParameter("rutDueño");
        int idCuenta = Integer.parseInt(request.getParameter("idCuenta"));
        double montoTransferencia = Double.parseDouble(request.getParameter("montoTransferencia"));
        String cuentaTransferencia = request.getParameter("cuentaTransferencia");
        String tipoCuenta = request.getParameter("tipoCuenta");

        try (Connection conn = DatabaseUtil.getConnection()) {
            String sql = "INSERT INTO Transaccion (rutCliente, rutDueño, idCuenta, montoTransferencia, cuentaTransferencia, TipoCuenta) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, rutCliente);
            stmt.setString(2, rutDueño);
            stmt.setInt(3, idCuenta);
            stmt.setDouble(4, montoTransferencia);
            stmt.setString(5, cuentaTransferencia);
            stmt.setString(6, tipoCuenta);
            stmt.executeUpdate();

            response.sendRedirect("transferencia.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}