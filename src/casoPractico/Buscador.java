package casoPractico;

import java.util.List;

public class Buscador {

    // Método genérico con comodines (?) que busca cualquier elemento que implemente Identificable<K>
    public static <T extends Identificable<K>, K> T buscarPorId(List<T> lista, K idBuscado) {
        if (lista == null || idBuscado == null) {
            return null;
        }
        for (T elemento : lista) {
            if (idBuscado.equals(elemento.getId())) {
                return elemento;
            }
        }
        return null;
    }
}