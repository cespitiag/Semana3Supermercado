package org.example; // O el nombre de tu paquete

import view.VistaEmpleado;
import controller.Controller;
import model.DBEmpleados;

public class Main {
    public static void main(String[] args) {
        // Ejecutar la interfaz en el hilo de despacho de eventos de Swing (Buena práctica)
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                VistaEmpleado vista = new VistaEmpleado();
                DBEmpleados datos = new DBEmpleados();
                new Controller(vista, datos);
                vista.setVisible(true); // Esto abre la ventana en tu pantalla
            }
        });
    }
}
