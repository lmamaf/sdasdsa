/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import controladores.AdmiVPanelEmpleados;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import objetos.Empleado;
import dao.EmpleadoDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import services.DataBase;
import services.SesionService;

/**
 *
 * @author ADMIN
 */
public class AdmiV extends javax.swing.JFrame {

    private AdmiVPanelEmpleados panelEmpleados;
    public AdmiV(int idEmpleado,Connection connection) {
        initComponents();
        this.setLocationRelativeTo(null);
        String nombreCompleto = obtenerNombreCompleto(idEmpleado);
        jLabel10.setText(nombreCompleto);
        EmpleadoDAO empleadoDAO = EmpleadoDAO.getInstancia(connection);
        this.panelEmpleados = new AdmiVPanelEmpleados(empleadoDAO);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jP_cli = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtNombresC = new javax.swing.JTextField();
        txtApellidosC = new javax.swing.JTextField();
        txtDNIC = new javax.swing.JTextField();
        txtTelefonoC = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtDireccionC = new javax.swing.JTextField();
        txtCorreoC = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        BuscarCliente = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnGuardarC = new javax.swing.JButton();
        btnEditarC = new javax.swing.JButton();
        btnBorrarC = new javax.swing.JButton();
        btnBuscarC = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaClientes = new javax.swing.JTable();
        jTextField10 = new javax.swing.JTextField();
        jP_emple = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jComboBoxCargo = new javax.swing.JComboBox<>();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtBusquedaDni = new javax.swing.JTextField();
        bntBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEmpleados = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jP_estadis = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jP_estadisticas = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jP_clientes = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jP_empleados = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jP_cerrarses = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jBcerrar = new javax.swing.JButton();
        jLmin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondomenu.png"))); // NOI18N
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, 0, 1140, 600));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 120, 980, 560));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jP_cli.setBackground(new java.awt.Color(182, 215, 248));
        jP_cli.setForeground(new java.awt.Color(255, 204, 153));
        jP_cli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Registro de Clientes");
        jP_cli.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 290, 28));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel19.setText("Datos del Cliente");
        jP_cli.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 160, 20));

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setText("Tipo:");
        jP_cli.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, -1, -1));

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setText("DNI:");
        jP_cli.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setText("Nombres:");
        jP_cli.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel24.setText("Apellidos:");
        jP_cli.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));
        jP_cli.add(txtNombresC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 180, -1));

        txtApellidosC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosCActionPerformed(evt);
            }
        });
        jP_cli.add(txtApellidosC, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 190, -1));
        jP_cli.add(txtDNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 110, -1));
        jP_cli.add(txtTelefonoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 110, -1));

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel25.setText("Telefono:");
        jP_cli.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, -1, -1));

        jLabel26.setBackground(new java.awt.Color(0, 0, 0));
        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setText("Busqueda de cliente por DNI");
        jP_cli.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jLabel27.setBackground(new java.awt.Color(0, 0, 0));
        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setText("Correo:");
        jP_cli.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, -1));
        jP_cli.add(txtDireccionC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 210, -1));
        jP_cli.add(txtCorreoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 210, -1));
        jP_cli.add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 130, -1));

        jLabel28.setBackground(new java.awt.Color(0, 0, 0));
        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setText("Dirreccion:");
        jP_cli.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));
        jP_cli.add(BuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 140, -1));
        jP_cli.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 312, 940, 10));

        btnGuardarC.setBackground(new java.awt.Color(236, 153, 69));
        btnGuardarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-guardar.png"))); // NOI18N
        btnGuardarC.setBorder(null);
        jP_cli.add(btnGuardarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 110, 30, 30));

        btnEditarC.setBackground(new java.awt.Color(236, 153, 69));
        btnEditarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-editar-25.png"))); // NOI18N
        btnEditarC.setBorder(null);
        jP_cli.add(btnEditarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 160, 30, 30));

        btnBorrarC.setBackground(new java.awt.Color(236, 153, 69));
        btnBorrarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-eliminar-25.png"))); // NOI18N
        btnBorrarC.setBorder(null);
        jP_cli.add(btnBorrarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 220, 30, 30));

        btnBuscarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-buscar-30 (1).png"))); // NOI18N
        btnBuscarC.setBorder(null);
        jP_cli.add(btnBuscarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 30, 30));

        TablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "DNI", "Nombres", "Apellidos", "Teledono", "Correo", "Direccion", "ID Empleado"
            }
        ));
        jScrollPane2.setViewportView(TablaClientes);

        jP_cli.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 910, 100));

        jTextField10.setText("idempleado");
        jP_cli.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 350, 110, -1));

        jP_emple.setBackground(new java.awt.Color(182, 215, 248));
        jP_emple.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        jLabel6.setText("Registro de Empleados");
        jP_emple.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 310, 33));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Datos del empleado");
        jP_emple.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Nombres:");
        jP_emple.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Apellidos:");
        jP_emple.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("DNI:");
        jP_emple.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("Telefono:");
        jP_emple.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, -1, -1));
        jP_emple.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 140, -1));
        jP_emple.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 160, -1));
        jP_emple.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 120, -1));
        jP_emple.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 120, -1));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("Correo:");
        jP_emple.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, -1, -1));
        jP_emple.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 250, -1));
        jP_emple.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 220, -1));

        btnGuardar.setBackground(new java.awt.Color(236, 153, 69));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-guardar.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jP_emple.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, 30, 30));

        jComboBoxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administracion", "Ventas" }));
        jP_emple.add(jComboBoxCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 90, -1));

        btnEditar.setBackground(new java.awt.Color(236, 153, 69));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-editar-25.png"))); // NOI18N
        btnEditar.setBorder(null);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jP_emple.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 170, 30, 30));

        btnEliminar.setBackground(new java.awt.Color(236, 153, 69));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-eliminar-25.png"))); // NOI18N
        btnEliminar.setToolTipText("");
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jP_emple.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 220, 30, 30));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setText("Buscar empleado por DNI:");
        jP_emple.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 350, 190, 20));
        jP_emple.add(txtBusquedaDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 140, -1));

        bntBuscar.setBackground(new java.awt.Color(236, 153, 69));
        bntBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-buscar-30 (1).png"))); // NOI18N
        bntBuscar.setBorder(null);
        bntBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBuscarActionPerformed(evt);
            }
        });
        jP_emple.add(bntBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 30, -1));

        TablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "DNI", "Nombres", "Apellidos", "Correo", "Telefono", "Direccion", "Cargo"
            }
        ));
        jScrollPane1.setViewportView(TablaEmpleados);

        jP_emple.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 910, 100));
        jP_emple.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 930, 10));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setText("Direccion:");
        jP_emple.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel29.setBackground(new java.awt.Color(0, 0, 0));
        jLabel29.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel29.setText("Correo:");
        jP_emple.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, -1));

        jP_estadis.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jP_estadisLayout = new javax.swing.GroupLayout(jP_estadis);
        jP_estadis.setLayout(jP_estadisLayout);
        jP_estadisLayout.setHorizontalGroup(
            jP_estadisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        jP_estadisLayout.setVerticalGroup(
            jP_estadisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_estadis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_emple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_cli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jP_estadis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jP_emple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jP_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 50, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 980, 550));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 110));

        jLabel8.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Bienvenido ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 160, 40));

        jLabel10.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("trabajador");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 160, 40));

        jP_estadisticas.setBackground(new java.awt.Color(236, 153, 69));
        jP_estadisticas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jP_estadisticasMouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-ventas-30 (1).png"))); // NOI18N
        jLabel5.setText("Estadisticas");

        javax.swing.GroupLayout jP_estadisticasLayout = new javax.swing.GroupLayout(jP_estadisticas);
        jP_estadisticas.setLayout(jP_estadisticasLayout);
        jP_estadisticasLayout.setHorizontalGroup(
            jP_estadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_estadisticasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1229, 1229, 1229))
        );
        jP_estadisticasLayout.setVerticalGroup(
            jP_estadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_estadisticasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jP_estadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 180, 60));

        jP_clientes.setBackground(new java.awt.Color(236, 153, 69));
        jP_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jP_clientesMouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-clientes-30.png"))); // NOI18N
        jLabel3.setText("Clientes");

        javax.swing.GroupLayout jP_clientesLayout = new javax.swing.GroupLayout(jP_clientes);
        jP_clientes.setLayout(jP_clientesLayout);
        jP_clientesLayout.setHorizontalGroup(
            jP_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_clientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jP_clientesLayout.setVerticalGroup(
            jP_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_clientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jP_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 180, 60));

        jP_empleados.setBackground(new java.awt.Color(236, 153, 69));
        jP_empleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jP_empleadosMouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-empleado-30.png"))); // NOI18N
        jLabel4.setText("Empleados");

        javax.swing.GroupLayout jP_empleadosLayout = new javax.swing.GroupLayout(jP_empleados);
        jP_empleados.setLayout(jP_empleadosLayout);
        jP_empleadosLayout.setHorizontalGroup(
            jP_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_empleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jP_empleadosLayout.setVerticalGroup(
            jP_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_empleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jP_empleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 180, 60));

        jP_cerrarses.setBackground(new java.awt.Color(236, 153, 69));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-cerrar-sesión-30.png"))); // NOI18N
        jLabel7.setText("Cerrar Sesión");

        javax.swing.GroupLayout jP_cerrarsesLayout = new javax.swing.GroupLayout(jP_cerrarses);
        jP_cerrarses.setLayout(jP_cerrarsesLayout);
        jP_cerrarsesLayout.setHorizontalGroup(
            jP_cerrarsesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_cerrarsesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jP_cerrarsesLayout.setVerticalGroup(
            jP_cerrarsesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_cerrarsesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jP_cerrarses, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, 60));

        jBcerrar.setBackground(new java.awt.Color(243, 112, 24));
        jBcerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-cerrar-ventana-32.png"))); // NOI18N
        jBcerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBcerrarMouseClicked(evt);
            }
        });
        jBcerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcerrarActionPerformed(evt);
            }
        });
        getContentPane().add(jBcerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, 30, 30));

        jLmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-menos-32.png"))); // NOI18N
        jLmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLminMouseClicked(evt);
            }
        });
        getContentPane().add(jLmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondomenu.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLminMouseClicked
        this.setState(AdmiV.ICONIFIED);
    }//GEN-LAST:event_jLminMouseClicked

    private void jBcerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBcerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jBcerrarMouseClicked

    private void jP_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_clientesMouseClicked
        jP_cli.setVisible(true);
        jP_emple.setVisible(false);
        jP_estadis.setVisible(false);
        jP_clientes.setBackground(Color.black);
        jP_empleados.setBackground(new Color(236,153,69));
        jP_estadisticas.setBackground(new Color(236,153,69));
    }//GEN-LAST:event_jP_clientesMouseClicked

    private void jP_empleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_empleadosMouseClicked
        jP_emple.setVisible(true);
        jP_cli.setVisible(false);
        jP_estadis.setVisible(false);
        jP_empleados.setBackground(Color.black);
        jP_clientes.setBackground(new Color(236,153,69));
        jP_estadisticas.setBackground(new Color(236,153,69));
    }//GEN-LAST:event_jP_empleadosMouseClicked

    private void jP_estadisticasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_estadisticasMouseClicked
        jP_estadis.setVisible(true);
        jP_emple.setVisible(false);
        jP_cli.setVisible(false);
        jP_estadisticas.setBackground(Color.black);
        jP_empleados.setBackground(new Color(236,153,69));
        jP_clientes.setBackground(new Color(236,153,69));
    }//GEN-LAST:event_jP_estadisticasMouseClicked

    private void bntBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntBuscarActionPerformed

    private void txtApellidosCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosCActionPerformed

    private void jBcerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBcerrarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    try {
            panelEmpleados.btnGuardarActionPerformed(evt, txtDNI, txtNombres, txtApellidos, txtCorreo, txtTelefono, txtDireccion, jComboBoxCargo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al guardar el empleado: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
    try {
            panelEmpleados.eliminarEmpleado(Integer.parseInt(txtDNI.getText()));
            JOptionPane.showMessageDialog(this, "Empleado con dni:"+txtDNI+" agregado con exito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al eliminar el empleado: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un DNI válido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    private String obtenerNombreCompleto(int idEmpleado) {
        SesionService sesionService = new SesionService(DataBase.conectar()); // Aquí puedes obtener la conexión según tu implementación
        return sesionService.obtenerNombreYApellidos(idEmpleado);
    }
    
    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BuscarCliente;
    private javax.swing.JTable TablaClientes;
    private javax.swing.JTable TablaEmpleados;
    private javax.swing.JButton bntBuscar;
    private javax.swing.JButton btnBorrarC;
    private javax.swing.JButton btnBuscarC;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditarC;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarC;
    private javax.swing.JButton jBcerrar;
    private javax.swing.JComboBox<String> jComboBoxCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLmin;
    private javax.swing.JPanel jP_cerrarses;
    private javax.swing.JPanel jP_cli;
    private javax.swing.JPanel jP_clientes;
    private javax.swing.JPanel jP_emple;
    private javax.swing.JPanel jP_empleados;
    private javax.swing.JPanel jP_estadis;
    private javax.swing.JPanel jP_estadisticas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtApellidosC;
    private javax.swing.JTextField txtBusquedaDni;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCorreoC;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDNIC;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDireccionC;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNombresC;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoC;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
