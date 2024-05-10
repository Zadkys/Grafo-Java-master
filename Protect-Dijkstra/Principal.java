import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Grafo<Integer> grafo = new Grafo<>(6);
        /* VÉRTICES
         * A = 0
         * B = 1
         * C = 2
         * D = 3
         * E = 4 
         * F = 5 
         */

        grafo.agregarArista(0, 1, 2); // A - B  (Peso: 2)
        grafo.agregarArista(0, 5, 1); // A - F  (Peso: 1)

        grafo.agregarArista(1, 0, 2); // B - A  (Peso: 2)
        grafo.agregarArista(1, 2, 2); // B - C  (Peso: 2)
        grafo.agregarArista(1, 3, 2); // B - D  (Peso: 2)
        grafo.agregarArista(1, 4, 4); // B - E  (Peso: 4)

        grafo.agregarArista(2, 1, 2); // C - B  (Peso: 2)
        grafo.agregarArista(2, 4, 3); // C - E  (Peso: 3) 

        grafo.agregarArista(3, 1, 2); // D - B  (Peso: 2)
        grafo.agregarArista(3, 4, 4); // D - E  (Peso: 4)
        grafo.agregarArista(3, 5, 3); // D - F  (Peso: 3)

        grafo.agregarArista(4, 2, 3); // E - C  (Peso: 3)
        grafo.agregarArista(4, 3, 4); // E - D  (Peso: 4)

        grafo.agregarArista(5, 0, 1); // F - A  (Peso: 1)
        grafo.agregarArista(5, 3, 3); // F - D  (Peso: 3)
        grafo.agregarArista(5, 4, 5); // F - E  (Peso: 5)

        grafo.imprimirListaAdyacencia();

        // Definir el origen y el destino para calcular la ruta mínima (A -> D)
        int origen = 0, destino = 3; 
        ArrayList<Integer> rutaMinima = grafo.dijkstra(origen, destino);
        System.out.println("Ruta mínima desde " + (char)('A' + origen) + " hasta " + (char)('A' + destino) + ": " + rutaMinima);
    }
}
