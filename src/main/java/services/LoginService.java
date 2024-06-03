package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Queue;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class LoginService {
    
    private Connection connection;
    public LoginService(Connection connection) {
        this.connection = connection;

    }
    public Connection getConnection() {
        return connection;
    }

    // Método para verificar el inicio de sesión
    public void verificarInicioSesion(String nombreUsuario, String contrasena) {
    // Consulta SQL para buscar las credenciales en la tabla login
    String sql = "SELECT * FROM login WHERE nombreUsuario = ? AND contrasena = ?";
    try (PreparedStatement statement = connection.prepareStatement(sql)) {
        statement.setString(1, nombreUsuario);
        statement.setString(2, contrasena);
        try (ResultSet resultSet = statement.executeQuery()) {
            // Si el conjunto de resultados tiene al menos una fila, las credenciales son válidas
            if (resultSet.next()) {
                // Aquí puedes realizar acciones adicionales si las credenciales son válidas
                // Por ejemplo, mostrar un mensaje de inicio de sesión exitoso
                JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso para el usuario: " + nombreUsuario);
            } else {
                // Aquí puedes realizar acciones adicionales si las credenciales son inválidas
                // Por ejemplo, mostrar un mensaje de credenciales incorrectas
                JOptionPane.showMessageDialog(null, "Credenciales incorrectas para el usuario: " + nombreUsuario);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

    // Método para obtener el ID del empleado
    public int obtenerIDEmpleado(String nombreUsuario, String contrasena) {
        int idEmpleado = -1;
        String sql = "SELECT idEmpleado FROM login WHERE nombreUsuario = ? AND contrasena = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, nombreUsuario);
            statement.setString(2, contrasena);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    idEmpleado = resultSet.getInt("idEmpleado");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return idEmpleado;
    }
    public int verificarInicioSesionYObtenerID(String nombreUsuario, String contrasena) {
        int idEmpleado = -1; // Valor predeterminado en caso de que el inicio de sesión falle
        String sql = "SELECT idEmpleado FROM login WHERE nombreUsuario = ? AND contrasena = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, nombreUsuario);
            statement.setString(2, contrasena);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    idEmpleado = resultSet.getInt("idEmpleado");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return idEmpleado;
    }
}


