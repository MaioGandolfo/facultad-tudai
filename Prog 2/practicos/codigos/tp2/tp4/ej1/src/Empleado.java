import java.util.ArrayList;

public class Empleado {
    private int id;
    private ArrayList<EncuestaRespondida> encuestasRespondidas;

    public Empleado(int id) {
        this.id = id;

    }

    public int getId(){
        return id;
    }

    public void setId (int id){
        this.id = id;
    }

    public void agregarEncuestaRespondida(EncuestaRespondida encu, Persona pp){
        if(!encuestasRespondidas.contains(pp)){
            encuestasRespondidas.add(encu);
        }
    }

    public boolean equals (Object o){
        try {
            Persona pp = (Persona) o;

            return pp.getDni() == pp.getDni();
        } catch (Exception e){
            return false;
        }
    }

    public int getCantEncuestasRealizadas(){
        return encuestasRespondidas.size();
    }
}
