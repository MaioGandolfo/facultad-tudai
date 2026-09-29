import java.util.ArrayList;

public class ArrayListOrdenado {
    private ArrayList<ObjetoOrdenable> objetos;

    public ArrayListOrdenado(){
        this.objetos = new ArrayList<>();
    }

    public void add(ObjetoOrdenable o1){
        int i = 0;
        boolean insertado = false;

        while (i < objetos.size() && !insertado){
            ObjetoOrdenable actual = objetos.get(i);

            if(actual.esMenor(o1)){
                objetos.add(i, o1);
                insertado = true;
            }
            i++;
        }
        if(!insertado)
            objetos.add(o1);
    }





}
