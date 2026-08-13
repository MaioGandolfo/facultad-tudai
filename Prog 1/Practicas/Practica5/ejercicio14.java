package Practica5;

public class ejercicio14 {
    public static void main(String[] args) {
        /*
        Dado un arreglo de caracteres de tamaño MAX, hacer un
        programa que implemente métodos tal que devuelva al main: un
        arreglo con las posiciones de los caracteres que son letras
        vocales y otro con las posiciones que son consonantes.
         */

        char [] original={'a','e','v','n','r','t','i','p','o','y','u'};

        int posv=cantVocales(original);
        int posc=cantConsonantes(original);

        int [] posvocales=new int [posv];

        int [] posconsonantes=new int [posc];

        cargarArreglos(original, posvocales, posv, posc, posconsonantes);
        
        System.out.println("esta son las posciones de los elemento en el arreglo original");
        
        saberPos(original);
        System.out.println(" ");

        System.out.println("esta son las posiciones de las consonantes");

        mostrarArreglo(posconsonantes, posc);
        System.out.println(" ");

        System.out.println("esta son las posiciones de las vocales.");

        mostrarArreglo(posvocales, posv);
    
    }
    public static void mostrarArreglo(int [] arr, int max){
        for (int i=0; i<max; i++){
            System.out.print(arr[i] + "|");
        }
    }
    public static void cargarArreglos(char[] original, int [] posvocales, int posv, int posc, int [] posconsonantes){
        int iv=0, ic=0;
        for (int i=0; i<original.length; i++){
            switch(original[i]) {
                case 'a','e','i','o','u':
                    if (iv<posv){
                        posvocales[iv]=i;
                        iv++;
                    }
                    break;
                default:
                    if (ic<posc){
                        posconsonantes[ic]=i;
                        ic++;
                    }
                    break;
            }
        }
    }
    public static void saberPos(char [] original){
        for(int i=0; i<original.length; i++){
            System.out.print(i + "|");
        }
    }
    public static int cantVocales(char [] original){
        int contador=0;
        for (int i=0; i<original.length; i++){
            switch (original[i]) {
                case 'a','e','i','o','u':
                    contador++;
                    break;
            }
        }
        return contador;
    }
    public static int cantConsonantes(char [] original){
        int contador=0;
        for (int i=0; i<original.length; i++){
            if (original[i]!='a'&&original[i]!='e'&&original[i]!='i'&&original[i]!='o'&&original[i]!='u'){
                contador++;
            }
        }
        return contador;
    }
}
