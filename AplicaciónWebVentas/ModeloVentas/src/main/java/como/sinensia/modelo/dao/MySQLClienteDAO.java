package com.sinensia.modelo.dao;

import com.sinensia.modelo.Cliente;
import como.sinensia.modelo.dao.Constantes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;

public class MySQLClienteDAO implements InterfazDAO<Cliente> {

    public MySQLClienteDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            DriverManager.registerDriver(
                    new com.mysql.cj.jdbc.Driver());
        } catch (SQLException ex) {
            Logger.getLogger(MySQLClienteDAO.class.getName())
                    .log(Level.SEVERE, "Error SQL", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MySQLClienteDAO.class.getName())
                    .log(Level.SEVERE, "Error en la clase", ex);
        } catch (Exception ex) {
            Logger.getLogger(MySQLClienteDAO.class.getName())
                    .log(Level.SEVERE, "Otro error", ex);
        }
    }

    public boolean crear(String nombre, String email,
            String passwd, int edad, boolean activo) {
        try (Connection conex = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bd_ventas?user=admin&password=Admin1234&useSSL=false&serverTimezone=UTC [admin on Default schema]",
                "admin", "Admin1234")) {
            String sqlQuery
                    = "INSERT INTO cliente (nombre, email, password, edad, activo) "
                    + " VALUES ( '" + nombre + "' , '" + email + "' , '" + passwd
                    + "' , " + edad + " , " + (activo ? "1" : "0") + " ) ";
            Statement sentencia = conex.createStatement();
            sentencia.executeUpdate(sqlQuery);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(MySQLClienteDAO.class.getName())
                    .log(Level.SEVERE, "Error SQL", ex);
            return false;
        }
    }

    @Override
    public Cliente insertar(Cliente cliente) {
        try (Connection conex = DriverManager.getConnection(
                Constantes.CONEXION, Constantes.USUARIO, Constantes.PASSWORD)) {
            String sqlQuery
                    = "INSERT INTO cliente (nombre, email, password, edad, activo) "
                    + " VALUES ( ?, ?, ?, ?, ? ) ";
            PreparedStatement sentencia = conex.prepareStatement(sqlQuery);
            sentencia.setString(1, cliente.getNombre());
            sentencia.setString(2, cliente.getEmail());
            sentencia.setString(3, cliente.getPassword());
            sentencia.setShort(4, cliente.getEdad());
            sentencia.setShort(5, cliente.getActivo());
            sentencia.executeUpdate();
            return cliente;
        } catch (SQLException ex) {
            Logger.getLogger(MySQLClienteDAO.class.getName())
                    .log(Level.SEVERE, "Error SQL", ex);
            return null;
        }
    }

    @Override
    public Cliente obtenerUno(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Cliente obtenerUno(String email) {
        throw new UnsupportedOperationException("Not supported yet.");
        /*try (Connection conex = DriverManager.getConnection(
                Constantes.CONEXION, Constantes.USUARIO, Constantes.PASSWORD)) {
            String sqlQuery
                    = "SELECT id, nombre, edad, email, password, activo FROM cliente WHERE nombre";
            PreparedStatement sentencia = conex.prepareStatement(sqlQuery);*/
    }

    @Override
    public List<Cliente> obtenerTodos() {
        try (Connection conex = DriverManager.getConnection(
                Constantes.CONEXION, Constantes.USUARIO, Constantes.PASSWORD)) {
            String sqlQuery
                    = "SELECT INTO cliente id, nombre, edad, email, password, activo FROM cliente";
            PreparedStatement sentencia = conex.prepareStatement(sqlQuery);
            List<Cliente> cliente = new ArrayList<>();
            ResultSet res = sentencia.executeQuery();
            while (res.next()) {
                int id = res.getInt("id");
                String nombre = res.getString("nombre");
                String email = res.getString("email");
                String password = res.getString("password");
                short edad = res.getShort("edad");
                short activo = res.getShort("activo");
                Cliente cli = new Cliente(id, nombre, email, edad, activo, password);
                cliente.add(cli);

            }
            return cliente;
        } catch (SQLException ex) {
            Logger.getLogger(MySQLClienteDAO.class.getName())
                    .log(Level.SEVERE, "Error SQL", ex);
            return null;
        }
    }

    @Override
    public void eliminar(Cliente valor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void eliminar(Integer id) {
        try (Connection conex = DriverManager.getConnection(
                Constantes.CONEXION, Constantes.USUARIO, Constantes.PASSWORD)) {
            String sqlQuery
                    = "DELETE FROM Cliente WHERE id= ?";
            PreparedStatement sentencia = conex.prepareStatement(sqlQuery);
            sentencia.setInt(1, id);
            sentencia.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MySQLClienteDAO.class.getName())
                    .log(Level.SEVERE, "Error SQL", ex);

        }
    }

    public void eliminar(String email) {
        eliminar(obtenerUno(email).getId());
    }

    @Override
    public Cliente modificar(Cliente cliente) {
         try (Connection conex = DriverManager.getConnection(
                Constantes.CONEXION, Constantes.USUARIO, Constantes.PASSWORD)) {
            String sqlQuery
                    = "UPDATE cliente SET nombre=?, email = ?,password=?, edad=?, activo=? WHERE id = ?;";
            PreparedStatement sentencia = conex.prepareStatement(sqlQuery);
            sentencia.setString(1, cliente.getNombre()); 
            sentencia.setString(2, cliente.getEmail());
            sentencia.setString(3, cliente.getPassword());
            sentencia.setShort(4, cliente.getEdad());
            sentencia.setShort(5, cliente.getActivo());
            sentencia.setInt(6, cliente.getId());
            sentencia.executeUpdate();
            return cliente;
        } catch (SQLException ex) {
            Logger.getLogger(MySQLClienteDAO.class.getName())
                    .log(Level.SEVERE, "Error SQL", ex);
            return null;
        }
    }
}



