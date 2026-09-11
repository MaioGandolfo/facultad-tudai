import javax.swing.*;

public class CasaExigente extends Casa{

    public CasaExigente(String nombre, int cantAlumnosMax){
        super(nombre, cantAlumnosMax);
    }

    public void tieneFamiliar(Alumno aa){
        if(alumnos.contains(aa.getNombre())){
            super.addAlumno(aa);
        }
    }
}
