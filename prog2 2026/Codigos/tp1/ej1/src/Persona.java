import java.time.LocalDate;

public class Persona {
    private int dni;
    private String nombre;
    private String apellido;
    private int edad;
    private LocalDate fNac;
    private String sexo;
    private double peso;
    private double altura;

    public Persona (int dni){
        this(dni ,"N", "N");

    }

    public Persona (int dni, String nombre, String apellido){
        this.setDni(dni);
        this.setNombre(nombre);
        this.setApellido(apellido);
        fNac=LocalDate.of(2000, 1,1);
        setSexo("femenino");
        setPeso(1);
        setAltura(1);
    }

    public double calcularIMC(){
        return getPeso() / (getAltura()*getAltura());
    }

    public boolean estaEnForma(){
        if ((calcularIMC() >= 18.5)  && (calcularIMC() <=25))
            return true;
        else
            return false;
    }

    public boolean cumpleAno(){
        LocalDate hoy = LocalDate.now();
        if ((hoy.getDayOfMonth() == fNac.getDayOfMonth()) && (hoy.getMonthValue() == fNac.getMonthValue()))
            return true;
        else
            return false;
    }

    public boolean puedeVotar(){
        return getEdad() > 16;
    }

    public boolean edadCoherente(){
        return getEdad() == edad;
    }

    public int getEdad () {
        LocalDate hoy = LocalDate.now();
        int edad = hoy.getYear() - fNac.getYear();
        if(hoy.getMonthValue() < fNac.getMonthValue() ||
                (hoy.getMonthValue() == fNac.getMonthValue() && hoy.getDayOfMonth() < fNac.getDayOfMonth()))
            return edad--;
        else
            return edad;
    }

    private void setEdad(){
        this.edad = getEdad();
    }

    private void setDni(int dni){
        if (dni > 0 )
            this.dni = dni;
        else
            this.dni = 1;
    }

    public void setNombre(String nombre){
        if (nombre != null)
            this.nombre = nombre;
        else
            this.nombre = "N";
    }

    public void setApellido(String apellido){
        if (apellido != null)
            this.apellido = apellido;
        else
            this.apellido = "N";
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getfNac() {
        return fNac;
    }

    public void setfNac(int anio, int mes, int dia) {
        this.fNac = LocalDate.of(anio, mes, dia);
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
