import java.util.ArrayList;

public class SeleccionFutbol {
    private ArrayList<Integrante> integrantesFinal;
    private ArrayList<Integrante> preLista;
    private ArrayList<Integrante> noConvocados;
    private String nombre;

    public SeleccionFutbol (String nombre){
        setNombre(nombre);
        integrantesFinal = new ArrayList<>();
        preLista = new ArrayList<>();
        noConvocados = new ArrayList<>();
    }

    public void setNombre(String nombre){
        if(nombre != null)
            this.nombre = "selección " + nombre;
        else
            this.nombre = "";
    }

    public String getNombre(){
        return nombre;
    }

    public void convocar(){
        for (Integrante ii : preLista)
            armarListaFinal(ii);
    }

    public void agregarAPreLista(Integrante ii){
        preLista.add(ii);
    }

    private void armarListaFinal(Integrante ii){
        if(ii.esCombocable() && ii != null)
            integrantesFinal.add(ii);
        else
            noConvocados.add(ii);
    }

    public void listaConvocados(){
        System.out.println('\n' +"LISTA FINAL" + '\n' );
        for (Integrante ii : integrantesFinal)
            System.out.println(ii.toString());
    }

    public void listaNoConvocados() {
        System.out.println('\n'+"LISTA NO CONVOCAODS " + '\n' );
        for (Integrante ii : noConvocados)
            System.out.println(ii.toString());
    }

    public void preLista(){
        System.out.println('\n'+"PRE LISTA" + '\n');
        for (Integrante ii : preLista)
            System.out.println(ii.toString());
    }

}
