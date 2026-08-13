package Practica5;

public class ejercicioclase8 {
    final static int MAX=12;
    final static int SEPARADOR=0;

    public static void main(String[] args) {
        int [] arreglo={0,8,4,-2,0,10,5,0,1,25,3,0};

        mostrarArreglo(arreglo);
        System.out.println('\n');

        int inicio=0, fin=-1;
        int tamanio=0;

        //recorrer secuencia a secuencia el arreglo
        while(inicio<MAX){
            //buscar unicio de la secuencia
            inicio =buscarInicio(arreglo, fin + 1);
            //si el inicio es valido
            if (inicio < MAX){
            }
            //buscar fin de la secuencia
            fin=buscarFin(arreglo, inicio);

            //inicio y fin valido -> procesarla
            tamanio=fin -inicio + 1;
            //si el tamaño es impar y tiene almenos un multiplo de 2
            if (tamanio %2 !=0 && tienePar(arreglo, inicio, fin)){
                eliminarSecuencia(arreglo, inicio, fin);
                // MODIFICAR EL FIN
                fin = inicio;
            }
        }

        mostrarArreglo(arreglo);
    }
    public static void mostrarArreglo(int [] arr){
        for (int i=0; i<MAX; i++){
            System.out.print(arr[i] + "|");
        }
    }
    public static void eliminarSecuencia(int [] arreglo, int inicio, int fin){
        for (int i =inicio; i<=fin; i++){//i solo sireve para contra la cantidad de elimincaciones
            corrIzq(arreglo, inicio);
        }
    }
    public static void corrIzq(int [] arreglo, int pos){
        for (int i=pos; i < MAX-1; i++){
            arreglo[i] = arreglo[i + 1];
        }
    }
    public static boolean tienePar (int [] arreglo, int inicio, int fin){
        //retornar true si existe almenos UN elemento par
        //controlar no pasarme de los limites de la secuencia
        while (inicio <= fin && arreglo[inicio] % 2 != 0){
            inicio++;
        }
        // 2 alternativas:
        //saglo del while ini<=fin -> ini> fin (no encontre un elemento par)
        if (inicio<=fin)
            return true;
        else 
            return false;
    }
    public static int buscarInicio(int [] arreglo, int pos){
        //mientras no me caigo del arreglo y 
        //donde estoy parado sea un separador
        while(pos < MAX && arreglo[pos] == SEPARADOR){
            pos++;
        }

        return pos;
    }
    public static int buscarFin (int [] arreglo, int pos){
        //lo mismo que buscar inicio, solo que sea != SEPARADOR
        while(pos < MAX && arreglo[pos] != SEPARADOR){
            pos++;
        }
        return pos - 1;
    }
}
