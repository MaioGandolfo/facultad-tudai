public class Ciudad {
    private int cantHabitantes;
    private double imp1;
    private double imp2;
    private double imp3;
    private double imp4;
    private double imp5;
    private double gasto;


    public Ciudad (int cantHabitantes, double imp1, double imp2, double imp3, double imp4, double imp5, double gasto){
        setCantHabitantes(cantHabitantes);
        setImp1(imp1);
        setImp2(imp2);
        setImp3(imp3);
        setImp4(imp4);
        setImp5(imp5);
        setGasto(gasto);
    }

    public boolean estaDeficit(){

    }


    public void setGasto(double gasto){
        if(gasto >=0)
            this.gasto = gasto;
        else
            this.gasto=1;
    }

    public double getGasto(){
        return gasto;
    }
    
    public int getCantHabitantes() {
        return cantHabitantes;
    }

    public void setCantHabitantes(int cantHabitantes) {
        if(cantHabitantes >0)
            this.cantHabitantes = cantHabitantes;
        else
            this.cantHabitantes = 1;
    }

    public double getImp1() {
        return imp1;
    }

    public void setImp1(double imp1) {
        if(imp1 >0)
            this.imp1 = imp1;
        else
            this.imp1=1;
    }

    public double getImp2() {
        return imp2;
    }

    public void setImp2(double imp2) {
        if(imp2 >0)
            this.imp2 = imp2;
        else
            this.imp2=1;
    }

    public double getImp3() {
        return imp3;
    }

    public void setImp3(double imp3) {
        if(imp3 >0)
            this.imp3 = imp3;
        else
            this.imp3=1;
    }

    public double getImp4() {
        return imp4;
    }

    public void setImp4(double imp4) {
        if(imp4 >0)
            this.imp4 = imp4;
        else
            this.imp4=1;
    }


    public double getImp5() {
        return imp5;
    }

    public void setImp5(double imp5) {
        if(imp5 >0)
            this.imp5 = imp5;
        else
            this.imp5=1;
    }
}