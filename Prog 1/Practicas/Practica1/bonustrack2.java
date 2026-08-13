package Practica1;

public class bonustrack2 {
    public static void main (String[] args){
        int monto=0, dia=0, valorC=0;
        final int martes= 0, jueves=1; 

        System.out.print("Ingrese dia:");
            dia=Utils.leerInt();

            if(dia>1){
                System.out.println("ingrese un dia valido.");
            }

            if (dia<2){
                System.out.println("Ingrese monto");
                    monto=Utils.leerInt();
            }
            
            
            
            if (dia==0){
            
                if ((monto>=13000)&&(monto<20000)){
                    double valorA= (monto/100*5);
                        System.out.println("descuento de: " + valorA + '\n' + "valor final: " + (monto-valorA));
                }
            }
            if (dia==0){
                if (monto>2000){
                    double valorB= (monto/100*7.5);
                    System.out.println("descuento de: " + valorB + '\n' + "valor final: " + (monto-valorB));
                }
            }

            if (dia==1){
                if (monto>25000){
                    valorC= (monto/100*10);
                
                    if (valorC>3000);{
                    
                        for (; valorC > 3000; valorC--) {};
                        System.out.println("descuento:" + valorC + '\n' + "monto final: " + (monto-valorC));
                    }   
                }
            }
    }
}
