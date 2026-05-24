package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class VistaEmpleado extends JFrame {
    // Componentes de la interfaz
    public JLabel lblCargo;
    public JComboBox<String> cmbCargos;
    public JTable tblEmpleados;
    public DefaultTableModel modeloTabla;
    public JScrollPane scrollPane;

    public VistaEmpleado() {
        // Configuración de la ventana
        setTitle("Consulta de Empleados - Supermercado");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // 1. Panel Superior (Filtros)
        JPanel panelSuperior = new JPanel(new FlowLayout(FlowLayout.LEFT));
        lblCargo = new JLabel("Seleccione el Cargo: ");
        cmbCargos = new JComboBox<>();

        // Agregar opciones al ComboBox
        cmbCargos.addItem("Todos");
        cmbCargos.addItem("Cajero");
        cmbCargos.addItem("Administrador");
        cmbCargos.addItem("Auxiliar de Bodega");

        panelSuperior.add(lblCargo);
        panelSuperior.add(cmbCargos);

        // 2. Panel Central (La Tabla)
        // Definimos las columnas que necesitas: Empleado y Cargo
        String[] columnas = {"Empleado", "Cargo"};

        // Inicializamos el DefaultTableModel para que la tabla no sea editable directamente
        modeloTabla = new DefaultTableModel(columnas, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Evita que el usuario edite las celdas
            }
        };

        tblEmpleados = new JTable(modeloTabla);
        scrollPane = new JScrollPane(tblEmpleados); // JTable siempre debe ir dentro de un JScrollPane

        // Añadir paneles a la ventana principal
        add(panelSuperior, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }
}