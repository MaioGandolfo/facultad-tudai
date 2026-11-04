public class FiguritaLimitada extends Figurita{
    //Con el auge de las figuritas se desea incorporar una figurita edición limitada que
    //además del nombre, álbum, número y precio incluye un número de unidades
    //disponibles en el mundo. En estas figuritas, el precio se puede calcular de diferentes
    //maneras, en algunos casos tiene un precio fijo, en otros es el precio fijo multiplicado por 1000 - la cantidad de
    //unidades disponibles, en otros casos es 100 - la cantidad de unidades disponibles. Esta forma de cálculo puede
    //cambiar. Nota importante, el cálculo especial del precio nunca debe ser menor al precio que ya posee el
    //Coleccionable.

    private int unidad;

    private CalcularPrecio cp;

    public FiguritaLimitada(String nombre, String album, int numero, double precio, int unidad,CalcularPrecio cp) {
        super(nombre, album, numero, precio);
        this.unidad = unidad;
        this.cp = cp;
    }

    public double getPrecio(){
        double salida = cp.calcularPrecio(this);
        double original =super.getPrecio();
        if(salida > original)
            return salida;
        else
            return original;
    }
}
