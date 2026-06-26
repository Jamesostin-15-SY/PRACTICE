package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.*;
import Factory.*;
public class ControlMenu implements ActionListener {
    frmMenu vista;
    public ControlMenu (frmMenu vista){
        this.vista = vista;
        vista.itemEmpleado.addActionListener(this);
        vista.itemAbonos.addActionListener(this);
        vista.itemDeudas.addActionListener(this);
        vista.itemEstudiante.addActionListener(this);
        vista.itemPagos.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.itemEstudiante){
            VistasFactory.CrearVista("Estudiante",
                                     "Registro de Estudiantes",
                                     vista.spnContenedor);
        }
        if (e.getSource() == vista.itemEmpleado){
            VistasFactory.CrearVista("Empleado",
                                     "Registro de Empleados",
                                     vista.spnContenedor);
        }
    } 
}





 
