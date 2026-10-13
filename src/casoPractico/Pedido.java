package casoPractico;

import java.time.LocalDate;

public class Pedido implements Comparable<Pedido>, Identificable<Integer> {
    private Integer id;
    private double total;
    private LocalDate fecha;

    public Pedido(Integer id, double total, LocalDate fecha) {
        this.id = id;
        this.total = total;
        this.fecha = fecha;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public double getTotal() {
        return total;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    // Ordenamiento natural por total (de menor a mayor)
    @Override
    public int compareTo(Pedido otro) {
        return Double.compare(this.total, otro.total);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", total=$" + total +
                ", fecha=" + fecha +
                '}';
    }
}