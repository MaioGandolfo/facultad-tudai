
import Practica2.Utils;

public class ej10 {
    
    final static int MAXF=4, MAXC=20, SEPA=0;
    public static void main(String[] args) {
        
        int[][] matriz = {
            {0,0,2,3,4,0,0,5,6,0,7,8,9,0,0,1,2,3,0,0},
            {0,1,2,0,3,4,5,0,0,6,7,8,0,0,9,0,0,2,2,0},
            {0,0,5,0,6,7,8,0,0,1,1,1,0,2,3,4,0,0,0,0},
            {0,0,0,9,8,0,7,6,0,5,4,3,0,2,1,0,0,0,0,0}
        };
        int n=-1;
        int fila=ingresarFila(n), pos=ingresarPos(n);

        procesarFila(matriz[fila], pos);
    }
    public static int ingresarFila(int n){
        while (n<0 ^ n>=MAXF){
            System.out.println("ingrese una fila entre el 0 y 3");
            n=Utils.leerInt();
        }
        return n;
    }
    public static int ingresarPos(int n){
        while (n<0 ^ n>=MAXC){
            System.out.println("ingrese una posición entre 0 y 19");
            n=Utils.leerInt();
        }
        return n;
    }
    public static void procesarFila(int [] arr, int pos){
        int ini=0, fin=0;
        if (pos!=SEPA){
            ini=buscarIni(arr,pos);
            if (ini>=0){
                fin=buscarFin(arr, pos);
                System.out.println("el inicio es: " + ini + " y el fin es: " + fin);
            }
        }
        else 
            System.out.println("no hay inicio ni fin");
    }
    public static int buscarIni(int [] arr, int i){
        while (i>0 && arr[i]!=SEPA)
            i--;
        return i+1;
    }
    public static int buscarFin (int [] arr, int i){
        while (i<MAXC && arr[i]!=SEPA)
            i++;
        return i-1;
    }
}
