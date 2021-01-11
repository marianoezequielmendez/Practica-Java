package graficos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PruebaEventos 
{
    public static void main(String[] args) 
    {
        MarcoBotones miMarco = new MarcoBotones();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoBotones extends JFrame
{
    public MarcoBotones()
    {
    setTitle("Botones y eventos");
    setBounds(700, 300, 500, 300);
    LaminaBotones miLamina = new LaminaBotones();
    add(miLamina);
    }
}

//Clase 66 "EVENTOS"
class LaminaBotones extends JPanel implements ActionListener
{
    JButton botonAzul = new JButton("Azul");
    JButton botonAmarillo = new JButton("Amarillo");
    JButton botonRojo = new JButton("Rojo");
    public LaminaBotones()
    {
        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);
        botonAzul.addActionListener(this); //entre perentecis va el LISTENER, en este caso, this laminaBotones //Debe implementar la interfaz "ActionListener"
        botonAmarillo.addActionListener(this); //entre perentecis va el LISTENER, en este caso, this laminaBotones //Debe implementar la interfaz "ActionListener"
        botonRojo.addActionListener(this); //entre perentecis va el LISTENER, en este caso, this laminaBotones //Debe implementar la interfaz "ActionListener"
//        botonAzul.addActionListener(this); // FUENTE.EVENTO(OYENTE);
    }

    public void actionPerformed(ActionEvent e) 
    {
        Object botonPulsado = e.getSource();
        if(botonPulsado == botonAzul)
        {
            setBackground(Color.BLUE);
        }
        if(botonPulsado == botonAmarillo)
        {
            setBackground(Color.YELLOW);
        }
        if(botonPulsado == botonRojo)
        {
            setBackground(Color.RED);
        }
    }
}