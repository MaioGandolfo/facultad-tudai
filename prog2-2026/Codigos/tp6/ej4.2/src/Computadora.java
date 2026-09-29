public class Computadora {
    private int velocidad;

    public Computadora(int velocidad){
        setVelocidad(velocidad);
    }

    public void setVelocidad(int velocidad){
        if(velocidad >0)
            this.velocidad = velocidad;
        else
            this.velocidad = 1;
    }

    public int getVelocidad(){
        return velocidad;
    }
}
