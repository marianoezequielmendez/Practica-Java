package graficos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MarcoConTeclasEventos 
{
    public static void main(String[] args) 
    {
        MarcoConTeclas miMarco = new MarcoConTeclas();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConTeclas extends JFrame
{
    public MarcoConTeclas()
    {
        setVisible(true);
        setBounds(700, 300, 600, 450);
        addKeyListener(new EventoDeTeclado());
    }
}

class EventoDeTeclado implements KeyListener
{
    public void keyTyped(KeyEvent ke)
    {
        System.out.print(ke.getKeyChar());
    }
    public void keyPressed(KeyEvent ke)
    {
//        System.out.print(ke.getKeyCode()+" ");
    }
    public void keyReleased(KeyEvent ke){}
}