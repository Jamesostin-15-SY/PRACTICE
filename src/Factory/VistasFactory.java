package Factory;
import Vista.*;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import Controlador.*;
public class VistasFactory {
    private static void PresentarVista (JInternalFrame iframe, JDesktopPane contenedor) {
        contenedor.removeAll();
        contenedor.add(iframe);
        contenedor.repaint();
        int x = (contenedor.getWidth() - iframe.getWidth())/2;
        int y = (contenedor.getHeight() - iframe.getHeight())/2;
        iframe.setLocation(x, y);
        iframe.setVisible(true);
    }
    
    public static void CrearVista (String nomvista, String titulo, JDesktopPane contenedor) {
        if (nomvista.equals("Estudiante")){
            frmEstudiante fes = new frmEstudiante();
            ControlEstudiante ce = new ControlEstudiante(fes);
            fes.setTitle(titulo);
            PresentarVista(fes, contenedor);
            //Actualizando el combobox
            fes.cbxCarrera.removeAllItems();
            fes.cbxCarrera.addItem("INGENIERIA DE SISTEMAS");
            fes.cbxCarrera.addItem("INGENIERIA DE CIBERSEGURIDAD");
            fes.cbxCarrera.addItem("INGENIERIA DE INDUSTRIAL");
            fes.cbxCarrera.addItem("INGENIERIA DE CIVIL");
            fes.cbxCarrera.addItem("INGENIERIA DE AMBIENTAL");
        } //fin del if
        
        if (nomvista.equals("Empleado")){
            frmEmpleado fem = new frmEmpleado();
            fem.setTitle(titulo);
            PresentarVista(fem, contenedor);
        }     
        
    } // fin crear
    
}// Fin de la clase



