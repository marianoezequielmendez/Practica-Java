package graficos;
import javax.swing.*;
import java.awt.event.*;

public class AreaDeTexto 
{
    public static void main(String[] args)
    {
        MarcoADT miMarco = new MarcoADT();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   
}

class MarcoADT extends JFrame
{
    public MarcoADT()
    {
        setVisible(true);
        setBounds(500,200,500,300);
        
        LaminaADT miLamina = new LaminaADT();
        add(miLamina);
    }
}

class LaminaADT extends JPanel
{
    public LaminaADT()
    {
        miArea = new JTextArea(8,20);
        JScrollPane areaScroll = new JScrollPane(miArea); //Lamina que hace Scroll. Entre parentesis la lamina que se quiere afectar
        JButton boton01 = new JButton("Enviar");
        
        add(areaScroll);
        add(boton01);
        
        miArea.setLineWrap(true);
        boton01.addActionListener(new gestionArea());
    }
    
    private class gestionArea implements ActionListener
    {
        public void actionPerformed(ActionEvent ae) 
        {
            System.out.println(miArea.getText());
        }
    }
    
    private JTextArea miArea;
}