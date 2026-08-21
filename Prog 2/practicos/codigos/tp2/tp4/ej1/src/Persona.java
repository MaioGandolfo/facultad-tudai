public class Persona {
    private double dni;

    public Persona (double dni){
        this.dni = dni;
    }
    

    public double getDni (){
        return dni;
    }


    public boolean equals(Object o){
        Persona pp = (Persona) o;
        try {
            return this.getDni() == pp.getDni();
        } catch (Exception e){
            return false;
        }
    }
}
