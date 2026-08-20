import java.time.LocalDate;
import java.time.LocalTime;

public class Reunion {
    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFinalizacion;
    private Persona [] participantes;

    public Reunion (LocalDate fecha, LocalTime horaInicio, LocalTime horaFinalizacion, Persona pp, int cantParticipante){
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFinalizacion = horaFinalizacion;
        Persona [] participantes = new Persona[cantParticipante];
    }

    public void agregarParticipantes(Persona pp){
        for (int i=0; i<participantes.length; i++){
            if (pp.getTelefono() != participantes[i].getTelefono()) {
                participantes[i] = pp;
                break;
            }
        }
    }

    public String datosReunion(){
        return "fecha: " + getFecha() + '\n' + "hora inicio: " + getHoraInicio() +'\n' + "hora finalizacion: " + getHoraFinalizacion();
    }

    public void datosParticipantes(){
        for(int i=0; i<participantes.length; i++) {
            if (participantes[i] != null)
                participantes[i].datosCompletos();
            else
                System.out.println("no hay participante");
        }
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFinalizacion() {
        return horaFinalizacion;
    }

    public void setHoraFinalizacion(LocalTime horaFinalizacion) {
        this.horaFinalizacion = horaFinalizacion;
    }

}
