import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        int elementoBuscar = 13;

        // Búsqueda secuencial
        int indiceSecuencial = Busqueda.busquedaSecuencial(array, elementoBuscar);
        if (indiceSecuencial != -1) {
            System.out.println("Búsqueda secuencial: El elemento " + elementoBuscar + " se encuentra en el índice " + indiceSecuencial);
        } else {
            System.out.println("Búsqueda secuencial: El elemento " + elementoBuscar + " no se encuentra en el array");
        }

        // Búsqueda binaria
        Arrays.sort(array);
        int indiceBinario = Busqueda.busquedaBinaria(array, elementoBuscar);
        if (indiceBinario != -1) {
            System.out.println("Búsqueda binaria: El elemento " + elementoBuscar + " se encuentra en el índice " + indiceBinario);
        } else {
            System.out.println("Búsqueda binaria: El elemento " + elementoBuscar + " no se encuentra en el array");
        }
    }
}
