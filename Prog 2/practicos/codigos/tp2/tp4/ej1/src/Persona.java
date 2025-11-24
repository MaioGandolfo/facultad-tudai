public class Persona {
    private double dni;

    public Persona (double dni){
        this.dni = dni;
    }

    public void setDni (double dni){
        this.dni = dni;
    }

    public double getDni (){
        return dni;
    }

    @Override
    public boolean equals(Object o){
        try {
            Persona pp = (Persona) o;
            return this.getDni() == pp.getDni();
        } catch (Exception e){
            return false;
        }
    }
}
