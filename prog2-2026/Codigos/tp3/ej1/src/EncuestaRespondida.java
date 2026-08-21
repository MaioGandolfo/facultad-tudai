public class EncuestaRespondida extends Encuesta{
    private Empleado e1;
    private Persona p1;
    private Encuesta encuesta;

    public EncuestaRespondida(Empleado e1, Persona p1, Encuesta encuesta) {
        super(encuesta.getCantPreguntas());
        this.e1 = e1;
        this.p1 = p1;
    }

    public boolean equals(Object o1){
        Persona aux = (Persona) o1;
        try {
            return aux.getDni()==(p1.getDni());
        }catch (Exception e){
            return false;
        }
    }


    public Persona getPersona() {
        return p1;
    }

    public Empleado getEmpleado() {
        return e1;
    }
}
