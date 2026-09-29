import java.util.SortedMap;

public class Computadora extends ObjetoOrdenable{
    private int velocidad;

    public Computadora(int velocidad){
        setVelocidad(velocidad);
    }

    @Override
    public boolean esMenor(ObjetoOrdenable otro) {
        Computadora c1 = (Computadora) otro;
        return c1.getVelocidad() > this.getVelocidad();
    }

    public void ejecutarTarea(Tarea tt){
        System.out.println(tt.toString());
    }

    public void setVelocidad(int velocidad){
        if(velocidad > 0)
            this.velocidad = velocidad;
        else
            this.velocidad = 1;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
