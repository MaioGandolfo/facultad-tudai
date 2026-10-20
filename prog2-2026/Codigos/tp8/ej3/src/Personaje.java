public class Personaje {
    private String nombre;
    private int edad;
    private double peso, fuerza;

    public Personaje (String nombre, int edad, double peso){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.fuerza = 125;
    }

    public void comerFruta(Fruta ff){
        ff.comer(this);
    }

    public boolean equals(Object oo){
        try {
            Personaje aux = (Personaje) oo;
            return aux.getNombre().equalsIgnoreCase(this.getNombre());
        } catch (Exception e) {
            return false;
        }
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getFuerza() {
        return fuerza;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }
}
