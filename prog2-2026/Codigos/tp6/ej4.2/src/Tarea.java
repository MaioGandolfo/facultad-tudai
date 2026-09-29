public class Tarea {
    private int memoria;

    public Tarea(int memoria) {
        setMemoria(memoria);
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
