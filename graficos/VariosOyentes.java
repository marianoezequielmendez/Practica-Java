package graficos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VariosOyentes 
{
    public static void main(String[] args) 
    {
        MarcoVariosOyentes miMarco = new MarcoVariosOyentes();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}

class MarcoVariosOyentes extends JFrame
{
    public MarcoVariosOyentes()
    {
        setVisible(true);
        setBounds(600,10,300,200);
        setTitle("Buena Marian");
        
        LaminaVariosOyentes miLamina = new LaminaVariosOyentes();
        add(miLamina);
    }
}

class LaminaVariosOyentes extends JPanel
{
    public LaminaVariosOyentes()
    {
        JButton botonNuevo = new JButton("Nuevo");
        add(botonNuevo);
        botonNuevo.addActionListener(new OyenteNuevo());
        
        cerrarTodo = new JButton("Cerrar Todo"); //Se utiliza una variable JButton, porque se debe utilizar en varios oyentes.
        add(cerrarTodo);
    }
    
    private class OyenteNuevo implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            MarcoEmergente marco = new MarcoEmergente(cerrarTodo);
        }
        
    }
    
    JButton cerrarTodo;
}

class MarcoEmergente extends JFrame
{
    public MarcoEmergente(JButton botonCierraPrincipal)
    {
        contador ++;
        setTitle("Ventana " + contador);
        setBounds(100*contador,50*contador,300,200);
        setVisible(true);
        
        CerrarTodoClase botonCierraTodo = new CerrarTodoClase();
        botonCierraPrincipal.addActionListener(botonCierraTodo);
    }
    
    private class CerrarTodoClase implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            dispose();
        }
    }
   
    private static int contador = 0;
}