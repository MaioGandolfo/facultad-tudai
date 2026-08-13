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

    public Persona(){
        fNac=LocalDate.of(2000, 1, 1);
        sexo="Femenino";
        nombre="N";
        apellido="N";
        altura=1;
        peso=1;
    }

    public Persona(int dni){
        this.dni=dni;
    }

    public Persona(int dni, String nombre, String apellido){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
    }

    public Persona(int dni, String nombre, String apellido, LocalDate fNac){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.fNac=fNac;
    }

    public double calcularImc(){
        return peso / altura*altura;
    }

    public boolean estaEnForma(){
        return (calcularImc()>=18.5 && calcularImc()<=25);
    }

    public boolean cumpleAno(){
        LocalDate hoy=LocalDate.now();
        return (hoy.getDayOfMonth() == fNac.getDayOfMonth() &&
                hoy.getMonthValue() == fNac.getMonthValue());
    }

    public int getEdad(){
        LocalDate hoy=LocalDate.now();
        int edad= hoy.getYear() - fNac.getYear();
        if(hoy.getMonthValue() < fNac.getMonthValue() ||(hoy.getMonthValue() == fNac.getMonthValue()
                && hoy.getDayOfMonth() < fNac.getDayOfMonth())){
            edad--;
        }
        return edad;
    }

    public boolean edadCoherente(){
        return this.edad == getEdad();
    }

    /*
    public boolean puedeVotar(){
        LocalDate hoy= LocalDate.now();
        return ((hoy.getYear() - fNac.getYear()) >=16 );
    }
    */

    public boolean puedeVotar(){
        return getEdad() >=16;
    }

    //setters

    public void setNombre (String nombre){
        this.nombre=nombre;
    }

    public void setApellido(String apellido){
        this.apellido=apellido;
    }

    public void setFNac(LocalDate fNac) {
        this.fNac = fNac;
    }

    public void setAltura(double altura){
        this.altura=altura;
    }

    public void setPeso(double peso){
        this.peso=peso;
    }

    public void setSexo(String sexo){
        this.sexo=sexo;
    }

    //getters

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public int getDni(){
        return dni;
    }

    public LocalDate getfNac() {
        return fNac;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public String getSexo() {
        return sexo;
    }
}

