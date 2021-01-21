package graficos;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;
//import java.awt.event.*;

public class EventoDeCuadro 
{
    public static void main(String[] args) 
    {
        MarcoEDC miMarco = new MarcoEDC();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoEDC extends JFrame
{
    public MarcoEDC()
    {
        setVisible(true);
        setBounds(450, 200, 400, 300);
        
        LaminaEDC miLamina = new LaminaEDC();
        add(miLamina);
    }
}

class LaminaEDC extends JPanel
{
    public LaminaEDC()
    {
        JTextField campo01 = new JTextField(20);
//        EscuchaTexto escuchaTexto = new EscuchaTexto();
        Document miDoc = campo01.getDocument(); //Crear un Documento
        miDoc.addDocumentListener(new EscuchaTexto()); //Poner a la escucha la instancia de EscuchaTexto
        add(campo01);
    }
    
    private class EscuchaTexto implements DocumentListener
    {
        public void insertUpdate(DocumentEvent de) 
        { 
            System.out.println("insertUpdate " + x);
            x++;
        }
        public void removeUpdate(DocumentEvent de) 
        {
            System.out.println("removeUpdate " + y);
            y++;
        }
        public void changedUpdate(DocumentEvent de)
        {
            System.out.println("changedUpdate " + z);
            z++;
        }
    }
    
    int x = 0;
    int y = 0;
    int z = 0;
}