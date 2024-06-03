package objetos;

import dao.PedidoDAO;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class Productos {
    private String codigo;
    private String nombre;
    private String descripcion;
    private List<String> tallas;
    private int cantidad;
    private Double precio;
    private Connection connection;

    public Productos(String codigo, String nombre, String descripcion, List<String> tallas, int cantidad, Double precio, Connection connection) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tallas = tallas;
        this.cantidad = cantidad;
        this.precio = precio;
        this.connection = connection;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<String> getTallas() {
        return tallas;
    }

    public void setTallas(List<String> tallas) {
        this.tallas = tallas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

   
    

    // Método para generar un pedido de este producto
    public void generarPedido() {
        PedidoDAO pedidoDAO = new PedidoDAO(connection);
        pedidoDAO.generarPedido(this);
    }

    public List<String> encontrarTallas(PedidoDAO pedidoDAO) {
        List<String> tallasDisponibles = pedidoDAO.obtenerTallasParaProducto(this);
        return tallasDisponibles;
    }
}
