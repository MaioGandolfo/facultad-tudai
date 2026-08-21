import java.util.ArrayList;

public class Encuesta {
    private int cantPreguntas;

    public Encuesta(int cantPreguntas){
        this.cantPreguntas= cantPreguntas;
    }

    public boolean equals(Object o1){
        Encuesta aux = (Encuesta) o1;
        try{
            return aux.getCantPreguntas()==this.cantPreguntas;
        } catch (Exception e) {
            return false;
        }
    }

    public int getCantPreguntas() {
        return cantPreguntas;
    }

    public void setCantPreguntas(int cantPreguntas) {
        if(cantPreguntas>0)
            this.cantPreguntas = cantPreguntas;
        else
            this.cantPreguntas = 1;
    }
}
