import java.util.ArrayList;

public class Flota extends Transporte{
    private ArrayList<Transporte> elementos;

    public Flota(){
        this.elementos = new ArrayList<>();
    }

    public void addElemento(Transporte tt){
        elementos.add(tt);
    }

    public ArrayList<Vehiculo>buscar(Condicion cc){
        ArrayList<Vehiculo> salida = new ArrayList<>();
        for(Transporte tt : elementos){
            ArrayList<Vehiculo> aux = tt.buscar(cc);
            salida.addAll(aux);
        }
        return salida;
    }

    @Override
    public int getModelo() {
        int minimo = Integer.MAX_VALUE;
        for(Transporte tt : elementos){
            int aux = tt.getModelo();
            if(aux < minimo)
                minimo = aux;
        }
        return minimo;
    }

    @Override
    public int getAsientos() {
        int salida = 0;
        for(Transporte tt : elementos)
            salida += tt.getAsientos();
        return salida;
    }

    @Override
    public int getKilometros() {
        int salida = 0;
        for(Transporte tt : elementos)
            salida += tt.getKilometros();
        return salida;
    }

    @Override
    public double getCostoMantenimiento() {
        double salida = 0;
        for(Transporte tt : elementos)
            salida += tt.getCostoMantenimiento();
        return salida;
    }

    @Override
    public boolean tieneCaracteristica(String ss) {
        for(Transporte tt : elementos){
            if(tt.tieneCaracteristica(ss))
                return true;
        }
        return false;
    }
}
