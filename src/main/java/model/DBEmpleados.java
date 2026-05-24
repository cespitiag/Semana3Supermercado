package model;

import java.util.ArrayList;
import java.util.List;
import model.Empleado;

public class DBEmpleados {
    public List<Empleado> listaEmpleados;

    public DBEmpleados(){
        listaEmpleados = new ArrayList<>();
    }

    public void cargarEmpleados(){
        listaEmpleados.add(new Empleado("Juan Pérez", "Cajero"));
        listaEmpleados.add(new Empleado("María Gómez", "Administrador"));
        listaEmpleados.add(new Empleado("Carlos Ruiz", "Cajero"));
        listaEmpleados.add(new Empleado("Ana Beltrán", "Auxiliar de Bodega"));
        listaEmpleados.add(new Empleado("Lorena Pérez", "Cajero"));
        listaEmpleados.add(new Empleado("Ana Lucia Gómez", "Administrador"));
        listaEmpleados.add(new Empleado("Elkin Ruiz", "Cajero"));
        listaEmpleados.add(new Empleado("Jose Beltrán", "Auxiliar de Bodega"));
    }

}
