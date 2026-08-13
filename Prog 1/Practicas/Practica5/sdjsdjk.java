package Practica5;

public class sdjsdjk {
    public static void main(String[] args) {
        final int M = 18;
        final int X = 3;
        int[] arr = {0,67,67,67,67,67,0,14,0,33,33,33,33,0,0,5,98,0};

        mostrarArreglo(arr);

        comprimirArreglo(arr, X);

        mostrarArreglo(arr);
    }

    public static void comprimirArreglo(int[] arr, int X) {
        int M = arr.length;
        int[] aux = new int[M];
        int posAux = 0;
        int i = 0;

        while (i < M) {
            if (arr[i] == 0) {
                aux[posAux++] = 0;
                i++;
            } else {
                int j = i;
                int valor = arr[i];
                int contador = 0;
                // Contar repeticiones del mismo valor
                while (j < M && arr[j] == valor) {
                    contador++;
                    j++;
                }
                if (contador >= X) {
                    aux[posAux++] = -contador;
                    aux[posAux++] = valor;
                } else {
                    for (int k = 0; k < contador; k++) {
                        aux[posAux++] = valor;
                    }
                }
                i = j;
            }
        }
        // Rellenar con ceros el resto del arreglo
        while (posAux < M) {
            aux[posAux++] = 0;
        }
        // Copiar el resultado comprimido al arreglo original
        for (int k = 0; k < M; k++) {
            arr[k] = aux[k];
        }
    }

    public static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "|");
        }
        System.out.println();
    }
}
