import jdk.jshell.spi.SPIResolutionException;

public class Electrodomestico {
    String color;
    int consumoEner;
    int precio;
    double peso;

    public Electrodomestico (String color){
        this.color= color;
        consumoEner= 10;
        precio= 100;
        peso= 2.0;
    }

    public Electrodomestico (String color, int consumoEner){
        this.color= color;
        this.consumoEner= consumoEner;
        precio= 100;
        peso= 2.0;
    }

    public Electrodomestico (String color, int consumoEner, int precio){
        this.color= color;
        this.consumoEner= consumoEner;
        this.precio= precio;
        peso= 2.0;
    }

    public Electrodomestico (String color, int consumoEner, int precio, double peso){
        this.color= color;
        this.consumoEner= consumoEner;
        this.precio= precio;
        this.peso= peso;
    }

    public boolean bajoConsumo (){
        return getConsumoEner() < 45;
    }

    public double calcularBalance (){
        return (getPrecio()/getPeso());
    }

    public boolean esAltaGama (){
        return calcularBalance() > 3 ;
    }

    //getters

    public String getColor(){
        return color;
    }

    public int getConsumoEner(){
        return consumoEner;
    }

    public int getPrecio() {
        return precio;
    }

    public double getPeso() {
        return peso;
    }

    //setters

    public void setColor(String color){
        this.color= color;
    }

    public void setConsumoEner(int consumoEner) {
        this.consumoEner= consumoEner;
    }

    public void setPrecio(int precio){
        this.precio= precio;
    }

    public void setPeso(double peso){
        this.peso= peso;
    }
}
