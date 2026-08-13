package Practica2;

public class ejercicio5 {
    public static void main (String[] args){
        int hora=0, tem=0, clave=0, clave3=0, cen1=0, cen2=0, cen3=0, cen4=0;
        char letra=' ';
        double promedio=0;
        final int clave1=364, clave2=698;

        System.out.println("Ingrese la hora.");
            hora=Utils.leerInt();

        if (hora<0 || hora>23){
            System.out.println("no es una hora.");
        }

            //Si la hora está entre las 0 y las 5, pida ingresar la
            //  temperatura y si la misma es menor a 20 grados imprima
            //  “Encender la calefacción”. Si es mayor a 25, imprima
            //  “Apagar calefacción”. Si está en el rango de 20 a 25 imprima
            //  “Calefacción encendida, no abra las ventanas!!!”.

        else {
            if (hora>=0 && hora<=5){
            System.out.println("Ingrese la temperatura.");
                tem=Utils.leerInt();
            if (tem<20){
                System.out.println("Encender la calefacción.");
            } else if (tem>25){
                System.out.println("Apagar calefacción,");
            } else if (tem>=20 && tem<=25){
                System.out.println("Calefacción encendida, no abra las ventanas!!!");
            }
        } 
        
        //Si la hora está entre las 6 y las 11, pida un carácter letra
        //  minúscula y si es vocal imprima por la consola la cantidad de
        //  vocales que tiene la palabra que corresponde con la hora.
        //  Ejemplo 8 (ocho) tiene 2 vocales. Si no es vocal imprima la
        //  cantidad de consonantes que tiene, para el ejemplo 8 (ocho)
        //  tiene 2 consonantes.

        else if (hora>=6 && hora<=11){
            System.out.println("ingrese letra.");
                letra=Utils.leerChar();

                if (letra>='a'&&letra<='z'){
                    if (letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u'){
                        if (hora==6||hora==8||hora==10||hora==11){
                            System.out.println("la hora: " + hora + ", tiene 2 vocales");
                        } else {
                            System.out.println("la hora: " + hora + ", tiene 3 vocales");
                        }
                    } else {
                        System.out.println("la hora: " + hora + ", tiene 2 consonantes.");
                    }
                }
        }
        //Si la hora está entre las 12 y 17 y es par, imprima el
        //promedio entre la hora ingresada y el límite inferior del
        //rango. Si la hora es impar debe imprimir el promedio entre la
        //hora ingresada y el límite superior del rango.

        if (hora>=12 && hora<=17){
            if (hora %2==0){
                promedio= hora+12/2;
                System.out.println("la hora promedio es: " + promedio);
            } else if (hora %3==0){
                promedio= hora+17/2;
                System.out.println("la hora promedio es: " + promedio);
            }
        }

        //Si la hora está entre las 18 y 23, pida ingresar una clave
        //numérica, si coincide con la clave almacenada previamente
        //en una constante, pida ingresar una segunda clave de
        //verificación (un valor entre 100 y 999). Para esta segunda
        //clave (que solo la conoce el usuario) se debe verificar que el
        //dígito de mayor peso (centena) sea múltiplo del dígito de
        //mayor peso de la clave almacenada. Si todo esto se cumple
        //debería mostrar por la consola el mensaje “Clave correcta”.
        //Ejemplo: clave almacenada 364, clave ingresada 364,
        //segunda clave ingresada 698.

        if (hora>=18 && hora<=23){
            System.out.println("ingrese clave.");
                clave=Utils.leerInt();

            if (clave==clave1){
                System.out.println("ingrese segunda clave");
                    clave3=Utils.leerInt();
                if (clave3==clave2){
                    cen1=clave1/100;
                    cen2=clave2/100;
                    if(cen2 % cen1==0){
                        System.out.println("clave correcta");
                    } else {
                        System.out.println("clave incorrecta.");
                    }
                }
            }
        }
    }
    }
}
