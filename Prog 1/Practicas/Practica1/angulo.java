package Practica1;
    public class angulo {
        public static void main(String[] args) {
            int angulo1 = 0, angulo2 = 0, angulo3 = 0;
            
            System.out.println("Ingrese angulo 1.");
            angulo1 = Utils.leerInt();
            
            System.out.println("Ingrese angulo 2.");
            angulo2 = Utils.leerInt();
            
            System.out.println("Ingrese angulo 3.");
            angulo3 = Utils.leerInt();

            if ((angulo1+angulo2+angulo3==180)&&(angulo1>0&&angulo2>0&&angulo3>0)){
                if(angulo1==90||angulo2==90||angulo3==90){
                    System.out.println("Es un triangulo rectangulo");
                }
                else if (angulo1<90&&angulo2<90&&angulo3<90){
                    System.out.println("es un triangulo acutangulo");
                }
                else if (angulo1>90||angulo2>90||angulo3>90){
                    System.out.println("es un triangulo obtusangulo");
                }
            }
            else{System.out.println("no es valido");}
        }
    }