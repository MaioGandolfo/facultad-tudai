import javax.sound.sampled.FloatControl;
import java.time.LocalDate;

public class Persona {
    int dni;
    LocalDate fNac;
    String sexo;
    String nombre;
    String apellido;
    int edad;
    double peso;
    double altura;

    public Persona (){
        fNac=LocalDate.of(2000, 1, 1);
        sexo="Femenino";
        nombre="N";
        apellido="N";
        peso=1;
        altura=1;
    }

    public Persona (int dni){
        this.dni=dni;
    }

    public Persona (int dni, String nombre, String apellido){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
    }

    public Persona (int dni, String nombre, String apellido, LocalDate fNac){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.fNac=fNac;
    }

    public double calcularImc (){
        return peso / (altura*altura);
    }

    public boolean estaEnForma(){
        return (calcularImc()>=18.5 && calcularImc()<=25);
    }

    public boolean cumpleAno(){
        LocalDate hoy = LocalDate.now();
        return (hoy.getDayOfMonth() == fNac.getDayOfMonth() &&
                hoy.getMonthValue() == fNac.getMonthValue());
    }

    public boolean puedeVotar(){
        LocalDate hoy= LocalDate.now();
        return ((hoy.getYear() - fNac.getYear()) >=16 );
    }
    public void setNombre (String nombre){
        this.nombre=nombre;
    }

    public void setApellido(String apellido){
        this.apellido=apellido;
    }

    public void setfNac(LocalDate fNac) {
        this.fNac = fNac;
    }

    public void setAltura(double altura){
        this.altura=altura;
    }

    public void setPeso(double peso){
        this.peso=peso;
    }



}
