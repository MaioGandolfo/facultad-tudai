import java.time.LocalDate;

public class DirectorTecnico extends Integrante{
    private int idFederacion;

    public DirectorTecnico(String nombre, String apellido, int numeroPasaporte, LocalDate fNac, String estado, int idFederacion){
        super(nombre, apellido, numeroPasaporte, fNac, estado);
        setIdFederacion(idFederacion);
    }

    public void setIdFederacion(int idFederacion){
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion(){
        return idFederacion;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' + "Rol: Director Tecnico" + '\n' + "id de federación: " + idFederacion;
    }
}
