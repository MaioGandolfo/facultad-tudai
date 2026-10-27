package filesystem;

import java.util.ArrayList;

public class Directorio extends ElementoSA{

    private ArrayList<ElementoSA> elementos;

    public Directorio(String nombre) {
        super(nombre);
        this.elementos = new ArrayList<>();
    }

    public void addElemento(ElementoSA elemento) {
        this.elementos.add(elemento);
    }

    public double getTamanio(){
        double tamanioTotal = 0;                    //inicializo
        for (ElementoSA elemento : elementos) {     //Recorro mis elementos
            tamanioTotal += elemento.getTamanio();  //opero con cada elemento y delego a ese elemento
        }
        return tamanioTotal;                        //retorno lo que inicialicé
    }

    public int cantidadElementos(){
        int cantidad = 1;
        for (ElementoSA elemento : elementos) {
            cantidad += elemento.cantidadElementos();
        }
        return cantidad;
    }

    public ArrayList<Archivo> buscar(Condicion condicion) {
        ArrayList<Archivo> resultado = new ArrayList<>();
        for (ElementoSA elemento : elementos) {
            ArrayList<Archivo> resParcial = elemento.buscar(condicion);
            //resultado.addAll(resParcial);
            for (Archivo archivo : resParcial) {
                if (!resultado.contains(archivo)) {
                    resultado.add(archivo);
                }
            }
        }
        return resultado;
    }

    @Override
    protected void imprimirArbol(String prefijo, boolean esUltimo) {
        String conector = esUltimo ? "└── " : "├── ";
        System.out.println(prefijo + conector + "<" + this + ">");

        String prefijoHijos = prefijo + (esUltimo ? "    " : "│   ");
        for (int i = 0; i < elementos.size(); i++) {
            ElementoSA hijo = elementos.get(i);
            boolean ultimoHijo = (i == elementos.size() - 1);
            hijo.imprimirArbol(prefijoHijos, ultimoHijo);
        }
    }

}
