import java.util.ArrayList;

public class ColeccionTematica extends Coleccionable{
    protected ArrayList<Coleccionable> coleccion;
    private double extraPeso;

    public ColeccionTematica(String nombre, double extraPeso){
        super(nombre);
        this.extraPeso = extraPeso;
    }

    public void addColeccionable(Coleccionable cc){
        coleccion.add(cc);
    }

    /*
    public ArrayList<Coleccionable> buscar(Condicion cc){
        ArrayList<Coleccionable> salida = new ArrayList<>();
        for(Coleccionable coleccionable : coleccion){
            if(cc.cumple(coleccionable))
                salida.add(coleccionable);
        }
        return salida;
    }

     */

    @Override
    public double getPeso() {
        double peso =0;
        for(Coleccionable cc : coleccion)
            peso += cc.getPeso();
        return peso;
    }

    @Override
    public double getVolumen() {
        double volumen =0;
        for(Coleccionable cc : coleccion)
            volumen += cc.getVolumen() + extraPeso;
        return volumen;
    }
}
