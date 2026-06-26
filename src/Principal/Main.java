package Principal;
import Vista.*;
import Controlador.*;
import javax.swing.JFrame;
public class Main {
    public static void main(String[] args) {
        frmMenu fm = new frmMenu();
        fm.setTitle("Sistemas de Información");
        fm.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ControlMenu cm = new ControlMenu(fm);
        fm.setVisible(true);
        
    }
}//Fin de la clase






