package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.*;
import Modelo.*;
import Procesos.*;
import javax.swing.table.DefaultTableModel;
public class ControlEstudiante implements ActionListener{
    //Y DALE U TODA LA VIDA
    frmEstudiante vista;
    Estudiante est;
    DefaultTableModel mt;
    static int numeracion = 0;

    public ControlEstudiante(frmEstudiante vista) {
        this.vista = vista;
        vista.btnNuevo.addActionListener(this);
        vista.btnRegistrar.addActionListener(this);
        mt = ProcesosEstudiantes.FormatoTabla(vista);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnRegistrar){
            est = ProcesosEstudiantes.Leer(vista);
            numeracion++;
            mt.addRow(est.Registro(numeracion));
        } 
        
        if (e.getSource() == vista.btnNuevo){
            ProcesosEstudiantes.LimpiarEntradas(vista);
        }
    }  
} //Fin de la clase










