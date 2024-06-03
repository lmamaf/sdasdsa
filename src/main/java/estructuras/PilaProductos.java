package estructuras;

import objetos.Productos;
import java.util.Stack;

public class PilaProductos {
    private Stack<Productos> pilaProductos;

    public PilaProductos() {
        this.pilaProductos = new Stack<>();
    }

    public Stack<Productos> getPilaProductos() {
        return pilaProductos;
    }

    public void setPilaProductos(Stack<Productos> pilaProductos) {
        this.pilaProductos = pilaProductos;
    }

    // Método para agregar un producto a la pila
    public void agregarProducto(Productos producto) {
        pilaProductos.push(producto);
    }

    // Método para remover y devolver el último producto de la pila
    public Productos obtenerUltimoProducto() {
        return pilaProductos.pop();
    }

    // Método para verificar si la pila está vacía
    public boolean estaVacia() {
        return pilaProductos.isEmpty();
    }
}

