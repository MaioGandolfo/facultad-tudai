import java.util.ArrayList;
import java.util.Comparator;

public class Jugador extends ObjAura implements Comparable<Jugador> {
    private CalculadorAura ca;
    private int tDebut, xp, cantVictorias;
    private ArrayList<String> movimientos;

    public Jugador(String nombre, CalculadorAura ca, int tDebut, int xp, int cantVictorias) {
        super(nombre);
        this.ca = ca;
        this.tDebut = tDebut;
        this.xp = xp;
        this.cantVictorias = cantVictorias;
        this.movimientos = new ArrayList<>();
    }

    public CalculadorAura getCa() {
        return ca;
    }

    public void setCa(CalculadorAura ca) {
        this.ca = ca;
    }

    public void setCantVictorias(int cantVictorias) {
        this.cantVictorias = cantVictorias;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void setTemDebut(int tDebut) {
        this.tDebut = tDebut;
    }

    @Override
    public int getTemDebut() {
        return tDebut;
    }

    @Override
    public int getCantVictorias() {
        return cantVictorias;
    }

    @Override
    public boolean tieneMoviemiento(String ss) {
        return movimientos.contains(ss);
    }

    @Override
    public ArrayList<Jugador> buscar(Condicion cc) {
        ArrayList<Jugador> salida = new ArrayList<>();
        if(cc.cumple(this))
            salida.add(this);
        return salida;
    }

    @Override
    public int compareTo(Jugador o) {
        return 0;
    }
}
