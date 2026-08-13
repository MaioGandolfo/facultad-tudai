public class Parcialej1 {
    /*
	encontrar el inicio y fin de cada sec, recorres las sec y en cada sec hay valores 	repetidos, 
	si por ej hay 67,67,67,67 tengo que hacer un corrimiento a la izq y agregar la 	cantidad de elementos que hay en la sec pero negado ej -8 y al lado de la cantidad 	de elementos pongo el el elemento, en este caso queda -8, 67
	*/

	final static int SEPA=0, MAX=20;

	public static void main (String[] args){
	

		int [] arr={0,44,44,44,5,0,23,2,0,33,33,33,33,0,5,5,0,4,19,0};

		int inicio=0, fin=-1;

		while (inicio<MAX){
			inicio=buscarIni(arr, fin+1);
			if (inicio<MAX){
				fin=buscarFin(arr, inicio);
				boolean Eiguales=elementosIguales(arr, inicio, fin);
				if (Eiguales){
					procesarSec(arr, inicio, fin);
					fin=inicio+1;
				}
			}//if
		}//while
		mostrarArreglo(arr);
			
	}//main
	public static void procesarSec (int[] arr,int ini,int fin){
		int contador=0, elemento=arr[ini]; 
		while (fin>=ini){
			cIzq(arr, ini);
			fin--;
			contador++;
		}for (int i=0; i<2; i++){
			cDer(arr, ini);
		}
		arr[ini]=(-contador);
		arr[ini+1]=elemento;
	}//Ps
	public static boolean elementosIguales(int [] arr, int ini, int fin){
		int min=2, contador=1;//
		while (ini<fin && arr[ini]==arr[ini+1]){
			ini++;
			contador++;
		}
		if (contador >= min && ini>=fin)
			return true;
		else 
			return false;
	}//eI
	public static void cIzq (int [] arr, int pos){
		for (int i=pos; i<MAX-1; i++){
			arr[i]=arr[i+1];
		}
	}//cIzq
	public static int buscarIni (int [] arr, int i){
		while (i<MAX && arr[i]==SEPA)
			i++;
		return i;
	}//bIni
	public static int buscarFin (int [] arr, int i){
		while (i<MAX && arr[i]!=SEPA)
			i++;
		return i-1;
	}
	public static void mostrarArreglo(int[] arr){
		for (int i=0; i<MAX; i++){
			System.out.print(arr[i] + "|");
		}
		System.out.println(" ");	
	}
    public static void cDer(int []arr, int pos){
        for (int i = MAX - 1; i > pos; i--){
        arr[i] = arr[i - 1];
		}
    }
}//class

