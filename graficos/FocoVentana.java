package graficos;
import java.awt.event.*;
import javax.swing.JFrame;

public class FocoVentana extends JFrame implements WindowFocusListener
{
    public static void main(String[] args) 
    {
        FocoVentana miVentana = new FocoVentana();
        miVentana.iniciar();
    }
    
    public void iniciar()
    {
        marco01 = new FocoVentana();
        marco02 = new FocoVentana();
        
        marco01.setVisible(true);
        marco02.setVisible(true);
        
        marco01.setBounds(100, 100, 600, 350);
        marco02.setBounds(700, 100, 600, 350);
        
        marco01.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco02.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        marco01.addWindowFocusListener(this);
        marco02.addWindowFocusListener(this);
    }
    
    public void windowGainedFocus(WindowEvent we)
    {
        if(we.getSource() == marco01)
        {
            marco01.setTitle("Tengo el foco");
        }
        else if(we.getSource() == marco02)
        {
            marco02.setTitle("Tengo el foco");
        }
    }
    
    public void windowLostFocus(WindowEvent we)
    {
        if(we.getSource() == marco01)
        {
            marco01.setTitle("");
        }
        else if(we.getSource() == marco02)
        {
            marco02.setTitle("");
        }
    }
    
    FocoVentana marco01;
    FocoVentana marco02;
}
