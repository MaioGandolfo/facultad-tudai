package ej3;

public class CondicionCalificacion extends Condicion{
   private String calficacion;

   public CondicionCalificacion(String calificacion){
       this.calficacion = calificacion;
   }

    @Override
    public boolean cumple(Planta pp) {
        return pp.getClasificacionSuperior().equalsIgnoreCase(calficacion);
    }
}
