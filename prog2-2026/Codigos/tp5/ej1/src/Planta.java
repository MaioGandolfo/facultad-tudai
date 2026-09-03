import java.time.LocalDate;
import java.util.Locale;

public class Planta {
    private String nombreCientifico;
    private String nombreComun;
    private String paisOrigen;
    private LocalDate fechaCompra;
    private  static int idGlobal;
    private int id;

    public Planta (String nombreComun){
        setNombre(nombreComun);
        setFechaCompra(null);
        setPaisOrigen(null);
        idGlobal ++;
        id = idGlobal;
    }

    public Planta (){
        this(null);
    }

    public void setNombre(String nombreComun){
        if(nombreComun != null)
            this.nombreComun = nombreComun;
        else
            this.nombreComun = "planta";
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        if(fechaCompra != null)
            this.fechaCompra = fechaCompra;
        else
            this.fechaCompra = LocalDate.now();
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        if(paisOrigen != null)
            this.paisOrigen = paisOrigen;
        else
            this.paisOrigen = Locale.getDefault().getDisplayCountry();
    }

    public String getNombreComun() {
        return nombreComun;
    }


    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        if(nombreCientifico != null)
            this.nombreCientifico = nombreCientifico;
        else
            this.nombreCientifico = "";
    }


    public String toString() {
        return "----------------------" + '\n' + "nombre Comun: " + nombreComun + '\n' + "nombre cientifico: " + nombreCientifico + '\n' + "País de origen: " + paisOrigen + '\n' +
                "fecha de compra: " + fechaCompra + '\n' + "id: " + id;
    }
}
