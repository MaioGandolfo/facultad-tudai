public class Encuesta {
    private int numPreguntas;
    // encuesta respondida

    public Encuesta (int numPreguntas){
        this.numPreguntas = numPreguntas;
    }

    /*
     * metodo responder encuesta
     * que tome el empleado que la hizo y la persona que respondio
     * */

    public int getNumPreguntas() {
        return numPreguntas;
    }



    public void setNumPreguntas(int numPreguntas) {
        this.numPreguntas = numPreguntas;
    }



    @Override
    public boolean equals (Object o){
        try {
            Encuesta encu = (Encuesta) o;

            return this.getNumPreguntas() == encu.getNumPreguntas();
        } catch (Exception e){
            return false;
        }


    }
}
