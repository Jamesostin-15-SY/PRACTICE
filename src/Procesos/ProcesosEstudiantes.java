package Procesos;
import Modelo.*;
import Vista.*;
import javax.swing.table.DefaultTableModel;
public class ProcesosEstudiantes {
    public static Estudiante Leer(frmEstudiante fe){
        Estudiante es = new Estudiante();
        es.setId(fe.txtId.getText());
        es.setNom(fe.txtNombre.getText());
        es.setCar(fe.cbxCarrera.getSelectedItem().toString());
        return es;
    }
    
    public static void LimpiarEntradas (frmEstudiante fe){
        fe.txtId.setText("");
        fe.txtNombre.setText("");
        fe.cbxCarrera.setSelectedIndex(0);
        fe.txtId.requestFocus();
    }
    
    public static DefaultTableModel FormatoTabla (frmEstudiante fe) {
        String titulos [] = {"Num", "ID", "Nombre", "Carrera"};
        DefaultTableModel mt = new DefaultTableModel(null, titulos);
        fe.tblDatos.setModel(mt);
        return mt;
    }
}// Fin de la clase




