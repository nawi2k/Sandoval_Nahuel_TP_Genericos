package casoPractico;

import java.util.ArrayList;
import java.util.List;

public class Carrito<T extends Producto<?>> {
    private List<T> productos;

    public Carrito() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(T producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    public boolean eliminarProducto(T producto) {
        boolean eliminado = productos.remove(producto);
        if (eliminado) {
            System.out.println("Producto eliminado: " + producto.getNombre());
        } else {
            System.out.println("El producto no se encontraba en el carrito.");
        }
        return eliminado;
    }

    public double calcularTotal() {
        double total = 0.0;
        for (T p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    public void mostrarContenido() {
        System.out.println("--- Contenido del Carrito ---");
        for (T p : productos) {
            System.out.println(p);
        }
    }
}