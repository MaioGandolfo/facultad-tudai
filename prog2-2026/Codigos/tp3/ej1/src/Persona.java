public class Persona {
    private int dni;

    public Persona (int dni){
        setDni(dni);
    }

    /*
    public boolean equals(Object o1){
        Persona aux = (Persona) o1;
        try {
            return aux.getDni()==(this.getDni());
        }catch (Exception e){
            return false;
        }
    }

     */

    public int getDni() {
        return dni;
    }

    private void setDni(int dni) {
        this.dni = dni;
    }
}
