package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SesionService {

    private Connection connection;

    public SesionService(Connection connection) {
        this.connection = connection;
    }

    public String verificarInicioSesionYObtenerCargo(String nombreUsuario, String contrasena) {
        String cargo = null;
        // Obtener el ID del empleado mediante el LoginService
        LoginService loginService = new LoginService(connection);
        int idEmpleado = loginService.verificarInicioSesionYObtenerID(nombreUsuario, contrasena);
        
        if (idEmpleado != -1) {
            // Si se obtiene un ID válido, obtener el cargo usando el ID
            cargo = obtenerCargoEmpleado(idEmpleado);
        }
        
        return cargo;
    }

    public String obtenerNombreYApellidos(int idEmpleado) {
        String nombreCompleto = null;
        String sql = "SELECT nombre, apellidos FROM empleados WHERE idEmpleado = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, idEmpleado);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    String nombre = resultSet.getString("nombre");
                    String apellidos = resultSet.getString("apellidos");
                    nombreCompleto = nombre + " " + apellidos;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nombreCompleto;
    }

    private String obtenerCargoEmpleado(int idEmpleado) {
        String cargo = null;
        String sql = "SELECT cargo FROM empleados WHERE idEmpleado = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, idEmpleado);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    cargo = resultSet.getString("cargo");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cargo;
    }
}

