//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Negocio local = new Negocio("local tandil");

    ObjetoAlquilable o1 = new Pelicula("peron", "peronista", 10, LocalDate.of(2026, 9, 30));
    ObjetoAlquilable o2 = new Pelicula("enanitos", "fantasia", 5, LocalDate.of(2026, 9, 30));
    ObjetoAlquilable o3 = new Auto("chevrolet", 20000, "AA 107 ZZ", null, LocalDate.of(2026, 10, 10));
    ObjetoAlquilable o4 = new Auto("chevrolet", 20000, "AA 103 ZZ", "nafta", LocalDate.of(2026, 10, 10));
    ObjetoAlquilable o5 = new Auto("ford", 20000, "AA 107 ZZ", "nafta", LocalDate.of(2026, 10, 10));
    ObjetoAlquilable o6 = new Pelicula("peron", "hola", 14, LocalDate.of(2026, 9, 30));

    local.addObjetoAlquilable(o1);
    local.addObjetoAlquilable(o2);
    local.addObjetoAlquilable(o3);
    local.addObjetoAlquilable(o4);
    local.addObjetoAlquilable(o5);
    local.addObjetoAlquilable(o6);

    Persona p1 = new Persona("mariano");

    Persona p2 = new Persona("melina");

    p1.alquilarObjeto(o1);
    p1.alquilarObjeto(o2);
    p1.alquilarObjeto(o4);

    p2.alquilarObjeto(o3);
    p2.alquilarObjeto(o5);
    p2.alquilarObjeto(o6);

    p2.alquilarObjeto(o4);

    local.addCliente(p1);
    local.addCliente(p2);

    local.AlquileresPorVencer(5);

    System.out.println("000000000000000000000000000000000");

    local.historialAlquileres();

}
