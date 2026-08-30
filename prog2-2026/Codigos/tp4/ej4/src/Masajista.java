import java.time.LocalDate;

public class Masajista extends Integrante{
    private String titulo;
    private int aniosExperiencia;

    public Masajista (String nombre, String apellido, int numeroPasaporte, LocalDate fNac, String estado, String titulo, int aniosExperiencia){
        super(nombre, apellido, numeroPasaporte, fNac, estado);
        setTitulo(titulo);
        setAnioExperiencia(aniosExperiencia);
    }

    public void setAnioExperiencia(int anioExperiencia){
        if(anioExperiencia > 0 )
            this.aniosExperiencia = anioExperiencia;
        else
            this.aniosExperiencia = 1;
    }

    public int getAniosExperiencia(){
        return aniosExperiencia;
    }

    public void setTitulo(String titulo){
        if (titulo.equalsIgnoreCase("Masajista"))
            this.titulo = titulo;
        else
            this.titulo = "Masajista";
    }

    public String getTitulo(){
        return titulo;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' + "titulo: " + titulo + '\n' + "años de experiencia: " + aniosExperiencia;
    }
}
