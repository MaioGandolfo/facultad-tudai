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
        fNac=LocalDate.of(2000, 1, 1);// para fechas
        sexo="Femenino";
        nombre="N";
        apellido="N";
        edad=0;
        peso=1;
        altura=1;
    }
    public Persona(int dni){
        this.dni=dni;
        fNac=LocalDate.of(2000, 1, 1);// para fechas
        sexo="Femenino";
        nombre="N";
        apellido="N";
        edad=0;
        peso=1;
        altura=1;
    }
    public Persona(int dni, String nombre, String apellido){
        this.dni=dni;
        fNac=LocalDate.of(2000, 10, 1);// para fechas
        sexo="Femenino";
        this.nombre=nombre;
        this.apellido=apellido;
        edad=0;
        peso=1;
        altura=1;
    }
    public Persona(int dni, String nombre, String apellido, LocalDate fNac){
        this.dni=dni;
        this.fNac=fNac;//.of(2000, 1, 1); para fechas
        sexo="Femenino";
        this.nombre=nombre;
        this.apellido=apellido;
        edad=0;
        peso=1;
        altura=1;
    }
    public double calcularIMC(){
        double IMC=peso / altura*altura;
        return IMC;
    }
    public boolean estaEnForma(){
        return((calcularIMC()>=18.5) && (calcularIMC()<=25));
    }
    public boolean cumpleAnio() {
        LocalDate hoy = LocalDate.now();
        return (hoy.getDayOfMonth() == fNac.getDayOfMonth() &&
                hoy.getMonthValue() == fNac.getMonthValue());
    }
    public int getEdad () {
        LocalDate hoy= LocalDate.now();
        int edad = hoy.getYear() - fNac.getYear();
        if (hoy.getMonthValue() < fNac.getMonthValue() || (hoy.getMonthValue() == fNac.getMonthValue()
            && hoy.getDayOfMonth() < fNac.getDayOfMonth())){
                edad--;
            }
        return edad;        
    }
    public boolean esMayor (){
        return this.edad>=18;
    }
    
    public String getSexo () {
        return this.sexo;
    }

    public LocalDate getFnac(){
        return this.fNac;
    }
    /*
     *  int dni;
     *  LocalDate fNac;
     *  String sexo;
     *  String nombre;
     *  String apellido;
     *  int edad;
     *  double peso;
     *  double altura;
     */
    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setFNac(LocalDate fNac){
        this.fNac = fNac;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public void setPeso (double peso){
        this.peso = peso;
    }

    public void setAltura (double altura) {
        this.altura = altura;
    }

    public boolean puedeVotar() {
        return getEdad() >= 16;
    }

    public boolean edadCoherente(){
        return this.edad == getEdad();
    }

    public String getNombre () {
        return nombre;
    }
    
}