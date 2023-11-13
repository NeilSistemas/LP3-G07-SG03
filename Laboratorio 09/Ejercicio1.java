package lp3_s9;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

class Empleado {
    private int numero;
    private String nombre;
    private double sueldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public String toLine() {
        return numero + "," + nombre + "," + sueldo;
    }

    public static Empleado fromLine(String line) {
        String[] partes = line.split(",");
        Empleado empleado = new Empleado();
        empleado.setNumero(Integer.parseInt(partes[0]));
        empleado.setNombre(partes[1]);
        empleado.setSueldo(Double.parseDouble(partes[2]));
        return empleado;
    }
}

public class AplicacionEmpleados extends JFrame {
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JTextField txtNumero, txtNombre, txtSueldo;

    public AplicacionEmpleados() {
        super("Registro de Empleados");

        modeloTabla = new DefaultTableModel();
        tabla = new JTable(modeloTabla);
        JScrollPane scrollPane = new JScrollPane(tabla);
        txtNumero = new JTextField(10);
        txtNombre = new JTextField(10);
        txtSueldo = new JTextField(10);
        JButton btnAgregar = new JButton("Agregar Empleado");

        modeloTabla.addColumn("Número");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Sueldo");

        setLayout(new FlowLayout());
        add(new JLabel("Número: "));
        add(txtNumero);
        add(new JLabel("Nombre: "));
        add(txtNombre);
        add(new JLabel("Sueldo: "));
        add(txtSueldo);
        add(btnAgregar);
        add(scrollPane);

        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarEmpleado();
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);

        reporteEmpleados();
    }

    private void agregarEmpleado() {
        try (FileWriter fileWriter = new FileWriter("empleados.txt", true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
             PrintWriter printWriter = new PrintWriter(bufferedWriter)) {

            int numero = Integer.parseInt(txtNumero.getText());
            String nombre = txtNombre.getText();
            double sueldo = Double.parseDouble(txtSueldo.getText());

            Empleado empleado = new Empleado();
            empleado.setNumero(numero);
            empleado.setNombre(nombre);
            empleado.setSueldo(sueldo);

            printWriter.println(empleado.toLine());

            txtNumero.setText("");
            txtNombre.setText("");
            txtSueldo.setText("");

            modeloTabla.addRow(new Object[]{numero, nombre, sueldo});

        } catch (IOException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error al agregar empleado: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void reporteEmpleados() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("empleados.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                Empleado empleado = Empleado.fromLine(line);
                modeloTabla.addRow(new Object[]{empleado.getNumero(), empleado.getNombre(), empleado.getSueldo()});
            }
        } catch (IOException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar empleados: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AplicacionEmpleados();
            }
        });
    }
}
