import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Empresa (String nombre){
        setNombre(nombre);
        empleados = new ArrayList<>();
    }

    public void addEmpleado(Empleado ee){
        if(!empleados.contains(ee))
            empleados.add(ee);
    }

    public void getListaEmpleados(){
        for(Empleado e : empleados)
            System.out.println(e.toString());
    }




    public void setNombre(String nombre){
        if(nombre != null)
            this.nombre=nombre;
        else
            this.nombre="";
    }

    public String getNombre(){
        return nombre;
    }


}
