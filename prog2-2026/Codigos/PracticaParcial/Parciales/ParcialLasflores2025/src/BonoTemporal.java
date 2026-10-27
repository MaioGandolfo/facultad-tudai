import java.time.LocalDate;
import java.util.Locale;

public class BonoTemporal extends BonoBursatil{
    private BonoBursatil bono;
    private LocalDate fInicio,fVencimiento;
    private static double descuento = 0.50;

    public BonoTemporal(BonoBursatil bono, int cuit, LocalDate fVencimiento, LocalDate fInicio){
        super(cuit);
        this.bono = bono;
        this.fInicio = fInicio;
        this.fVencimiento = fVencimiento;
    }

    //El valor nominal es el del
    //bono de referencia, siempre que la fecha actual esté dentro del período de vigencia, caso contrario se
    //descuenta un 50% al valor del bono de referencia.
    @Override
    public double getValor() {
        LocalDate hoy = LocalDate.now();
        if(hoy.isBefore(fInicio) && hoy.isAfter(fVencimiento))
            return bono.getValor();
        else
            return bono.getValor()*descuento;
    }

    @Override
    public int getNEmicion() {
        return bono.getNEmicion();
    }
}
