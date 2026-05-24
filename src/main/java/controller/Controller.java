package controller;
import model.Empleado;
import view.VistaEmpleado;
import model.DBEmpleados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    VistaEmpleado vista;
    DBEmpleados empleadosDB;
    List<Empleado> listaEmpleado;


    public Controller(VistaEmpleado vista, DBEmpleados empleadosDB) {
        this.vista = vista;
        this.empleadosDB = empleadosDB;
        this.listaEmpleado = empleadosDB.listaEmpleados;

        // Cargar empleados
        empleadosDB.cargarEmpleados();

        // Escuchar los cambios de combobox
        this.vista.cmbCargos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filtrarEmpleados();
            }
        });
        filtrarEmpleados();
    }

    private void filtrarEmpleados(){

        String cargoSeleccionado = (String) vista.cmbCargos.getSelectedItem();

        // Limpar la tabla antes de mostrar los resultados
        vista.modeloTabla.setRowCount(0);

        // Recorrer Filtrar

        for (Empleado emp : listaEmpleado){
            if (cargoSeleccionado.equals("Todos") || emp.getCargo().equals(cargoSeleccionado)){
                // Añadir fila a la tabla con el formato [Empleado, cargo]
                vista.modeloTabla.addRow(
                        new Object[]{
                                emp.getNombre(),
                                emp.getCargo()
                }
                );
            }
        }

    }
}
