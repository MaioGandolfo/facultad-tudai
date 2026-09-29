public class Tarea extends ObjetoOrdenable{
    private int memoria;

    public Tarea(int memoria){
        setMemoria(memoria);
    }

    @Override
    public boolean esMenor(ObjetoOrdenable otro) {
        Tarea t1 = (Tarea) otro;
        return t1.getMemoria() > this.getMemoria();
    }

    public void setMemoria(int memoria){
        if(memoria > 0)
            this.memoria = memoria;
        else
            this.memoria = 1;
    }

    public int getMemoria() {
        return memoria;
    }
}
