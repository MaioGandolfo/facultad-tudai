import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Farmacia fm = new Farmacia();

        Medicamento a1 = new Medicamento("Dioxaflex", 1000, "Bayer");
        Medicamento a2 = new Medicamento("Amoxilina", 5500, "Raffo");
        Medicamento a3 = new Medicamento("Paracetamol", 500, "Bayer");
        Medicamento a4 = new Medicamento("Paracetamol", 500, "Bago");

        fm.addMedicamento(a1);
        fm.addMedicamento(a2);
        fm.addMedicamento(a3);
        fm.addMedicamento(a4);

        CondicionLaboratorio cbay = new CondicionLaboratorio("Bayer");
        ArrayList<Medicamento> bayers = fm.buscarMedicamentos(cbay);

        System.out.println(bayers);

        CondicionLaboratorio craf = new CondicionLaboratorio("Raffo");
        ArrayList<Medicamento> crafsss = fm.buscarMedicamentos(craf);

        System.out.println(crafsss);

        CondicionPrecio cpre = new CondicionPrecio(3000);
        ArrayList<Medicamento> precios = fm.buscarMedicamentos(cpre);

        System.out.println(precios);

        CondicionAnd cand = new CondicionAnd(craf, cpre);
        ArrayList<Medicamento> andss = fm.buscarMedicamentos(cand);

        System.out.println(andss);

        CondicionOr cor = new CondicionOr(craf, cpre);
        ArrayList<Medicamento> ors = fm.buscarMedicamentos(cor);

        System.out.println(ors);

        CondicionAnd candNueva = new CondicionAnd(cand, new CondicionNombre("Ina"));
        ArrayList<Medicamento> compuestas = fm.buscarMedicamentos(candNueva);

        System.out.println(compuestas);

        CondicionNot negada = new CondicionNot(candNueva);
        ArrayList<Medicamento> negadas = fm.buscarMedicamentos(negada);
        System.out.println(negadas);

        System.out.println("lista de medicamentos " + fm.mostrarMedicamentos());
    }
}