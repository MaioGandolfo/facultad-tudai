package Practica5;

public class ejercicio4 {
    final static int MAX=10;
    public static void main(String[] args) {
        /*Buscar un elemento en un arreglo de caracteres ya cargado de
        tamaño 10 y mostrar la/s posición/es del elemento, en caso de no
        estar indicarlo también.
         */
        char [] arrCaracter={'a','%','#','!','C','a','M','r','A','X'};

        System.out.println("ingrese un caracter.");
            char caracter=Utils.leerChar();
        
            encontrarCaracter(arrCaracter, caracter);
        //encontrarPos(arrCaracter, caracter);

        //encontrarPosiciones(arrCaracter, caracter);
    }
    public static void encontrarPosiciones(char[] arr, char carac) {
        boolean encontrado = false;
        System.out.print("El carácter '" + carac + "' se encuentra en las posición: ");
        for (int pos = 0; pos < MAX; pos++) {
            if (arr[pos] == carac) {
                System.out.print(pos + " ");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("El carácter '" + carac + "' no está en el arreglo.");
        } else {
            System.out.println(); // Salto de línea al final
        }
    }
    public static int encontrarPos(char [] arr, char carac){
        int pos=0;
        while ((pos < MAX) || (arr[pos] != carac)){
            pos++;
        } return pos;
    } 
    public static void encontrarCaracter(char[] arr, char caracter){
        for (int pos=0; pos<MAX; pos++){
            if (arr[pos] == caracter){
                System.out.println(caracter + " está en la posición " + pos);
            } 
            
        }
        System.out.println(caracter + " no está.");
        
    }
}
