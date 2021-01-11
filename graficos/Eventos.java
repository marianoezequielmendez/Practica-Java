package graficos;
import java.awt.event.*;
import javax.swing.*;

public class Eventos 
{
    public static void main(String[] args) 
    {
        MarcoVentana miMarco = new MarcoVentana();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //EXIT me termina el programa
        MarcoVentana miMarco2 = new MarcoVentana();
        miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Cierra la ventana pero no finaliza el programa.
        
        miMarco.setTitle("Ventana 1");
        miMarco.setBounds(300, 300, 500, 350);
        miMarco2.setTitle("Ventana 2");
        miMarco2.setBounds(900, 300, 500, 350);
    }
}

class MarcoVentana extends JFrame
{
    public MarcoVentana()
    {
//        setTitle("Respondiendo");
//        setBounds(300, 300, 500, 350);
        setVisible(true);
        
        M_Ventana oyenteVentana = new M_Ventana();
        addWindowListener(oyenteVentana);
    }
}

/*
class M_Ventana implements WindowListener     //Si implementamos la interfaz debemos codificar todos los metodos internos.
{                                               Para eso existe otra clase utilizada debajo con Extends
   public void windowOpened(WindowEvent we)
   {
       System.out.println("Ventana activada");
   }
   public void windowClosing(WindowEvent we)
   {
       System.out.println("Cerrando ventana");
   }
   public void windowClosed(WindowEvent we){} 
   public void windowIconified(WindowEvent we)
   {
       System.out.println("Ventana minimizada");
   } 
   public void windowDeiconified(WindowEvent we)
   {
       System.out.println("He vuelto");
   } 
   public void windowActivated(WindowEvent we){} 
   public void windowDeactivated(WindowEvent we){} 
}
*/

class M_Ventana extends WindowAdapter  //Esta clase ayuda a que no tengamos que traer todos los metodos de la interfaz WindowListener
{
   public void windowOpened(WindowEvent we)
   {
       System.out.println("Ventana activada");
   }
   public void windowClosing(WindowEvent we)
   {
       System.out.println("Cerrando ventana");
   }
   public void windowIconified(WindowEvent we)
   {
       System.out.println("Ventana minimizada");
   } 
   public void windowDeiconified(WindowEvent we)
   {
       System.out.println("He vuelto");
   } 
}  
