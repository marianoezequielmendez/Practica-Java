package graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FocoEvento 
{
    public static void main(String[] args) 
    {
        MarcoFoco miMarco = new MarcoFoco();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoFoco extends JFrame
{
    public MarcoFoco()
    {
        setVisible(true);
        setBounds(200,200,500,300);
        add(new LaminaFoco());
    }
}

class LaminaFoco extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        setLayout(null); //Con este codigo, queda invalidado la posicion de los cuadros por defecto.
        
        cuadro01 = new JTextField();
        cuadro02 = new JTextField();
        
        cuadro01.setBounds(120, 10, 150, 20);
        cuadro02.setBounds(120, 50, 150, 20);
        
        add(cuadro01);
        add(cuadro02);
        
        FocoEventoSub enFoco = new FocoEventoSub();
        cuadro01.addFocusListener(enFoco);
    }
    
    private class FocoEventoSub implements FocusListener
    {
        public void focusGained(FocusEvent fe)
        {
            System.out.println("Focus Gained");
        }
        public void focusLost(FocusEvent fe)
        {
            String eMail = cuadro01.getText(); //Método que te permite obtener el texto introducido.
            boolean comprobacion = false;
            for (int i=0; i<eMail.length(); i++)
            {
                if (eMail.charAt(i) == '@')
                {
                    comprobacion = true;
                }
            }
            if(comprobacion)
            {
                System.out.println("Correcto");
            }
            else
            {
                System.out.println("Incorrecto");
            }
        }
    }
    
    JTextField cuadro01; //Crea cuadro de textos.
    JTextField cuadro02;
}
