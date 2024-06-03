package controladores;

import dao.EmpleadoDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import objetos.Empleado;

public class AdmiVPanelEmpleados {
    
    private EmpleadoDAO empleadoDAO;

    public AdmiVPanelEmpleados(EmpleadoDAO empleadoDAO) {
        this.empleadoDAO = empleadoDAO;
    }
    
    public void agregarEmpleado(int dni, String nombre, String apellidos, String correo, int numero, String direccion, String cargo) {
        Empleado empleado = new Empleado(dni, nombre, apellidos, correo, numero, direccion, cargo);
        try {
            empleadoDAO.agregarEmpleado(empleado);
            JOptionPane.showMessageDialog(null, "Empleado agregado exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            if (ex.getSQLState().equals("23505")) { // Código de error para violación de restricción de unicidad
                JOptionPane.showMessageDialog(null, "El DNI ingresado ya existe en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error al agregar el empleado: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }


    
    public void btnGuardarActionPerformed(java.awt.event.ActionEvent evt, javax.swing.JTextField txtDNI, javax.swing.JTextField txtNombres, javax.swing.JTextField txtApellidos, javax.swing.JTextField txtCorreo, javax.swing.JTextField txtTelefono, javax.swing.JTextField txtDireccion, javax.swing.JComboBox jComboBoxCargo) throws SQLException {
        int dni = Integer.parseInt(txtDNI.getText());
        String nombre = txtNombres.getText();
        String apellidos = txtApellidos.getText();
        String correo = txtCorreo.getText();
        int numero = Integer.parseInt(txtTelefono.getText());
        String direccion = txtDireccion.getText();
        String cargo = jComboBoxCargo.getSelectedItem().toString(); // Obtener el valor seleccionado del ComboBox

        agregarEmpleado(dni, nombre, apellidos, correo, numero, direccion, cargo);
    }
    public void eliminarEmpleado(int dni) throws SQLException {
        empleadoDAO.eliminarEmpleado(dni);
    }



    
    // Otros métodos relacionados con la gestión de empleados
    
}
