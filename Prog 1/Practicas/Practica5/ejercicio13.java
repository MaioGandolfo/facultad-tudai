package Practica5;
public class ejercicio13 {
    final static int MAX=11; 
    public static void main(String[] args) {
        /*
        Dado un arreglo de caracteres de tamaño MAX, hacer un
        programa que implemente métodos tal que devuelva al main dos
        arreglos: un arreglo con los caracteres que son letras vocales y
        otro con los que son consonantes.
         */
        
        char [] original={'a','e','v','n','r','t','i','p','o','y','u'};

        int voca=cantVocales(original);
        
        int conso=cantConsonantes(original);

        
        char [] vocales=new char [voca];

        char [] consonantes=new char [conso];

        cargarArreglos(original, vocales, voca, consonantes, conso);

        System.out.println(conso);

        //cargarConsonantes(original, consonantes, conso);
        
        mostrarArreglo(vocales, voca);

        System.out.println(" ");

        mostrarArreglo(consonantes, conso);

        //char [] consotantes=new char [conso];
    }
    public static void cargarArreglos(char [] original, char [] vocales, int ivo, char [] consonantes, int conso){
        int iv=0, ic=0;
        for (int i=0; i<MAX; i++){
            switch (original[i]){
                case 'a','e','i','o','u':
                    if (iv<ivo){// verifico que no se me salga del arreglo de
                        vocales[iv] = original[i];
                        iv++;
                    }
                    break;
                    default:
                    if (ic<conso){
                        consonantes[ic] = original[i];
                        ic++;
                    }
            }
        }
    }
    public static void mostrarArreglo(char [] arr,int max){
        System.out.println("así quedó el arreglo.");
        for (int i=0; i<max; i++){
            System.out.print(arr[i] + "|");
        }
    }
    public static int cantVocales(char[] original){
        int contador=0;
        for (int i=0; i<MAX; i++){
            switch (original[i]){
                case 'a','e','i','o','u':
                    contador++;
                    break;
            }
        }
        return contador;
    }
    public static int cantConsonantes(char[]original){
        int contador=0;
        for (int i=0; i<MAX; i++){
            if (original[i]!='a' && original[i]!='e' && original[i]!='i' && original[i]!='o' && original[i]!='u'){
                contador++;
            }
        }
        return contador;
    }
}   

