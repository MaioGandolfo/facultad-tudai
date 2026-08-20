public class Agenda {
    private Reunion [] reunion;

    public Agenda(int cantReuniones){
        this.reunion = new Reunion[cantReuniones];
    }

    public void agregarReunion (Reunion rr){
        for (int i=0; i<reunion.length; i++) {
            if (reunion[i] == null) {
                reunion[i] = rr;
                break;
            }
            else if ((rr.getFecha() == reunion[i].getFecha()) && !(cruzanHorario(rr, reunion[i]))) {
                reunion[i] = rr;
                break;
            }
            else
                break;
        }
    }

    public boolean cruzanHorario(Reunion r1, Reunion r2){
        if (r2 == null)
            return false;
        else
            return (r1.getHoraInicio() != r2.getHoraInicio() && r1.getHoraFinalizacion() != r2.getHoraFinalizacion());
    }

    public void mostrarReuniones(){
        for (int i=0; i<reunion.length; i++) {
            if(reunion[i] != null)
                System.out.println("reunion " + (i+1) + '\n' + reunion[i].datosReunion());
        }
    }
}
