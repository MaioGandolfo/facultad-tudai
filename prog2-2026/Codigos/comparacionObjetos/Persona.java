package comparacionObjetos;

import java.time.LocalDate;
import java.time.Period;

public class Persona implements Comparable<Persona>{
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private double altura; //en metros
    private boolean esEstudiante;

    public Persona(String nombre, String apellido, LocalDate fechaNacimiento, double altura, boolean esEstudiante) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.esEstudiante = esEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isEsEstudiante() {
        return esEstudiante;
    }

    public void setEsEstudiante(boolean esEstudiante) {
        this.esEstudiante = esEstudiante;
    }

    public int getEdad(){
        return Period.between(this.fechaNacimiento,LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        String estudiante = this.isEsEstudiante() ? "📚" : "";
        return this.getApellido()+", "+this.getNombre()+" ("+this.getEdad()+" años "+estudiante+" )";
    }

    public int compareTo(Persona otra){
        int result = 0;
        if (this.esEstudiante && !otra.esEstudiante)
            result = -1;
        else if (!this.esEstudiante && otra.esEstudiante)
            result = 1;
        else {
            result = this.getApellido().compareTo(otra.getApellido());
            if (result == 0) {
                result = this.getNombre().compareTo(otra.getNombre());
                if (result == 0) {
                    result = this.getEdad() - otra.getEdad();
                }
            }
        }
        return result;
    }
}
