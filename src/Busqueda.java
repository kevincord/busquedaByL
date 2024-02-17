public class Busqueda {

    public static int busquedaSecuencial(int[] array, int elemento) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemento) {
                return i;
            }
        }
        return -1; // Retorna -1 si el elemento no se encuentra en el array.
    }

    public static int busquedaBinaria(int[] array, int elemento) {
        int inicio = 0;
        int fin = array.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (array[medio] == elemento) {
                return medio; // Retorna el índice si el elemento se encuentra en el array.
            }

            if (array[medio] < elemento) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return -1; // Retorna -1 si el elemento no se encuentra en el array.
    }
}
