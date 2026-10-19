//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Directorio raiz = new Directorio("C:");
    Directorio tudai = new Directorio("TUDAI");
    Directorio fotos = new Directorio("Fotos");
    Directorio pacman = new Directorio("Pacman");

    Directorio anio1 = new Directorio("1er año");
    Directorio anio2 = new Directorio("2do año");
    Directorio prog1 = new Directorio("Prog1");
    Directorio prog2 = new Directorio("Prog2");
    Directorio prog3 = new Directorio("Prog3");

    Directorio paisajes = new Directorio("Paisajes");
    Comprimido selfies = new Comprimido("Selfies", .5);

    Archivo parcialProg1 = new Archivo("parcial prog1", "doc", 100);
    Archivo recuProg1 = new Archivo("recu prog1", "pdf", 200);
    Archivo prefiProg1 = new Archivo("prefi prog1", "txt", 300);

    Archivo parcialProg2 = new Archivo("parcial prog2", "doc", 400);
    Archivo recuProg2 = new Archivo("recu prog2", "pdf", 500);
    Archivo prefiProg2 = new Archivo("prefi prog2", "txt", 600);

    Archivo parcialProg3 = new Archivo("parcial prog3", "doc", 700);
    Archivo recuProg3 = new Archivo("recu prog3", "pdf", 800);
    Archivo prefiProg3 = new Archivo("prefi prog3", "txt", 900);

    Archivo calendario = new Archivo("calendario", "pdf", 10);

    Archivo selfie1 = new Archivo("selfie", "jpg", 25);
    Archivo selfie2 = new Archivo("rindiendo el parcial", "jpg", 25);
    Archivo selfie3 = new Archivo("cara de recu", "gif", 25);
    Archivo selfie4 = new Archivo("firulais", "jpg", 25);

    Archivo paisaje1 = new Archivo("paisaje1", "jpg", 100);
    Archivo paisaje2 = new Archivo("paisaje2", "jpg", 100);
    Archivo paisaje3 = new Archivo("paisaje3", "jpg", 100);
    Archivo paisaje4 = new Archivo("paisaje4", "jpg", 100);
    Archivo paisaje5 = new Archivo("paisaje5", "jpg", 100);
    Archivo paisaje6 = new Archivo("paisaje6", "jpg", 100);

    Archivo pcmanexe = new Archivo("pacman", "exe", 10000);
    pacman.addElemento(pcmanexe);

    paisajes.addElemento(paisaje1);
    paisajes.addElemento(paisaje2);
    paisajes.addElemento(paisaje3);
    paisajes.addElemento(paisaje4);
    paisajes.addElemento(paisaje5);
    paisajes.addElemento(paisaje6);

    raiz.addElemento(tudai);
    raiz.addElemento(fotos);
    raiz.addElemento(pacman);

    tudai.addElemento(anio1);
    tudai.addElemento(calendario);
    tudai.addElemento(anio2);

    anio1.addElemento(prog1);
    prog1.addElemento(parcialProg1);
    prog1.addElemento(recuProg1);
    prog1.addElemento(prefiProg1);

    anio1.addElemento(prog2);
    prog2.addElemento(parcialProg2);
    prog2.addElemento(recuProg2);
    prog2.addElemento(prefiProg2);

    anio2.addElemento(prog3);
    prog3.addElemento(parcialProg3);
    prog3.addElemento(recuProg3);
    prog3.addElemento(prefiProg3);

    fotos.addElemento(selfies);
    fotos.addElemento(paisajes);

    selfies.addElemento(selfie1);
    selfies.addElemento(selfie2);
    selfies.addElemento(selfie3);
    selfies.addElemento(selfie4);

    raiz.imprimirArbol();

    System.out.println("Tamanio total: " + raiz.getTamanio());

    System.out.println("Cantidad total de elementos: " + raiz.cantidadElementos());
    System.out.println("Cantidad de elementos de fotos: " + fotos.cantidadElementos());

    Link accesoDirectoAPrefi = new Link(prefiProg2);
    raiz.addElemento(accesoDirectoAPrefi);
}
