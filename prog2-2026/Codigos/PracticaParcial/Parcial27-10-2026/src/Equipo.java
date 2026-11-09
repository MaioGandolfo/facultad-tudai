import java.util.ArrayList;
import java.util.Collections;

public class Equipo extends ObjAura{
    private ArrayList<ObjAura> elementos;

    public Equipo(String nombre){
        super(nombre);
        this.elementos = new ArrayList<>();
    }

    @Override
    public int getTemDebut() {
        return 0;
    }

    @Override
    public int getCantVictorias() {
        return 0;
    }

    @Override
    public boolean tieneMoviemiento(String ss) {
        return false;
    }

    @Override
    public ArrayList<Jugador> buscar(Condicion cc) {
        ArrayList<Jugador> salida = new ArrayList<>();
        for(ObjAura ee : elementos) {
            ArrayList<Jugador> aux = ee.buscar(cc);
            salida.addAll(aux);
        }
        return salida;
    }

    @Override
    public int getXp() {
        int xp =0;
        if(!elementos.isEmpty()){
            for(ObjAura ee : elementos) {
                xp = ee.getXp();
                if (xp > 0)
                    return xp;
            }
        }
        return 0;
    }

    public int calcularAura(){
        int aura = 0;
        if(!elementos.isEmpty()){
            for(ObjAura ee : elementos){
                aura += ee.calcularAura();
            }
            return aura / elementos.size();
        }
        return 0;
    }
}
