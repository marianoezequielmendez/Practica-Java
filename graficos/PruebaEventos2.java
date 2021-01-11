package graficos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PruebaEventos2 
{
    public static void main(String[] args) 
    {
        MarcoBotones miMarco = new MarcoBotones();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoBotones1 extends JFrame
{
    public MarcoBotones1()
    {
    setTitle("Botones y eventos");
    setBounds(700, 300, 500, 300);
    LaminaBotones miLamina = new LaminaBotones();
    add(miLamina);
    }
}

//Clase 66 "EVENTOS"
class LaminaBotones1 extends JPanel
{
//    ColorFondo colorFondo = new ColorFondo();
    JButton botonAzul = new JButton("Azul");
    JButton botonAmarillo = new JButton("Amarillo");
    JButton botonRojo = new JButton("Rojo");
    public LaminaBotones1()
    {
        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);
        botonAzul.addActionListener(new ColorFondo(Color.BLUE)); //entre perentecis va el LISTENER, en este caso, this laminaBotones //Debe implementar la interfaz "ActionListener"
        botonAmarillo.addActionListener(new ColorFondo(Color.YELLOW)); //entre perentecis va el LISTENER, en este caso, this laminaBotones //Debe implementar la interfaz "ActionListener"
        botonRojo.addActionListener(new ColorFondo(Color.RED)); //entre perentecis va el LISTENER, en este caso, this laminaBotones //Debe implementar la interfaz "ActionListener"
//        botonAzul.addActionListener(this); // FUENTE.EVENTO(OYENTE);
    }
    
    private class ColorFondo implements ActionListener
    {
        public ColorFondo (Color c)
        {
            colorDeFondo = c;
        }
    
        public void actionPerformed(ActionEvent e)
        {
            setBackground(colorDeFondo);
        }
    
        private Color colorDeFondo;
    }
}

