public class EncuestaRespondida extends Encuesta {
    private Persona persona;
    private Empleado empleado;
    private Encuesta encuesta;



    public EncuestaRespondida(Empleado empleado, Persona persona, Encuesta encuesta){
        super(encuesta.getNumPreguntas());
        this.empleado = empleado;
        this.persona = persona;
        this.encuesta = encuesta;
    }

    public Persona getPersona (){
        return persona;
    }

    public Empleado getEmpleado() {
        return empleado;
    }
}
