package casoPractico;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("  1. PRUEBA DE PRODUCTO Y CARRITO GENÉRICO ");
        System.out.println("==========================================");

        Producto<Integer> p1 = new Producto<>(101, "Teclado Mecánico", 45000.0);
        Producto<Integer> p2 = new Producto<>(102, "Mouse Gamer", 25000.0);
        Producto<Integer> p3 = new Producto<>(103, "Monitor 144Hz", 180000.0);

        Carrito<Producto<Integer>> carrito = new Carrito<>();
        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);
        carrito.agregarProducto(p3);

        System.out.println("\nTotal inicial del carrito: $" + carrito.calcularTotal());

        System.out.println("\n--- Eliminando 'Mouse Gamer' ---");
        carrito.eliminarProducto(p2);
        System.out.println("Nuevo total del carrito: $" + carrito.calcularTotal());

        System.out.println("\n==========================================");
        System.out.println("  2. PRUEBA DE PEDIDOS, COMPARABLE Y COMPARATOR ");
        System.out.println("==========================================");

        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido(1, 150000.0, LocalDate.of(2026, 10, 10)));
        pedidos.add(new Pedido(2, 45000.0, LocalDate.of(2026, 10, 5)));
        pedidos.add(new Pedido(3, 98000.0, LocalDate.of(2026, 10, 12)));

        System.out.println("\n--- Lista de Pedidos Original ---");
        for (Pedido p : pedidos) {
            System.out.println(p);
        }

        Collections.sort(pedidos);
        System.out.println("\n--- Pedidos Ordenados por TOTAL (Comparable) ---");
        for (Pedido p : pedidos) {
            System.out.println(p);
        }

        pedidos.sort(new ComparadorPorFecha());
        System.out.println("\n--- Pedidos Ordenados por FECHA (Comparator) ---");
        for (Pedido p : pedidos) {
            System.out.println(p);
        }

        System.out.println("\n==========================================");
        System.out.println("  3. PRUEBA DE BUSCADOR GENÉRICO ");
        System.out.println("==========================================");

        Integer idABuscar = 2;
        System.out.println("Buscando Pedido con ID: " + idABuscar);
        Pedido pedidoEncontrado = Buscador.buscarPorId(pedidos, idABuscar);

        if (pedidoEncontrado != null) {
            System.out.println("✅ Elemento encontrado: " + pedidoEncontrado);
        } else {
            System.out.println("❌ El elemento con ID " + idABuscar + " no existe.");
        }

        idABuscar = 99;
        System.out.println("\nBuscando Pedido con ID: " + idABuscar);
        pedidoEncontrado = Buscador.buscarPorId(pedidos, idABuscar);

        if (pedidoEncontrado != null) {
            System.out.println("✅ Elemento encontrado: " + pedidoEncontrado);
        } else {
            System.out.println("❌ El elemento con ID " + idABuscar + " no existe.");
        }
    }
}