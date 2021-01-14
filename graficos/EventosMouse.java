package graficos;
import java.awt.event.*;
import javax.swing.*;

public class EventosMouse 
{
    public static void main(String[] args) 
    {
        MarcoMouse miMarco = new MarcoMouse();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}

class MarcoMouse extends JFrame
{
    public MarcoMouse()
    {
        setVisible(true);
        setBounds(300, 300, 500, 300);
        addMouseMotionListener(new EventoMouseSub());
    }
}

/*
class EventoMouseSub implements MouseListener
{
    public void mouseClicked(MouseEvent me)
    {
        System.out.println("mouseClicked");
    }
    public void mousePressed(MouseEvent me) 
    {
        System.out.println("mousePressed");
    }
    public void mouseReleased(MouseEvent me) 
    {
        System.out.println("mouseReleased");
    }
    public void mouseEntered(MouseEvent me) 
    {
        System.out.println("mouseEntered");
    }
    public void mouseExited(MouseEvent me) 
    {
        System.out.println("mouseExited");
    }
}
*/

/*
class EventoMouseSub extends MouseAdapter
{
    public void mouseClicked(MouseEvent me)
    {
//        System.out.println("Coordenada X: "+me.getX()+"\nCoordenada Y: "+me.getY());
        int clics = me.getClickCount();
        System.out.println("Cantidad de Clicks: "+clics);
    }
    */
    
    //Saber si apreto Click derecho o izquiero
    /*
    public void mousePressed(MouseEvent me)
    {
        if (me.getModifiersEx() == 1024) //o == MouseEvent.BUTTON1_DOWN_MASK
        {
            System.out.println("Apretaste el click izquierdo");
        }
        else if (me.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) // o usar int devuelto "== 4096"
        {
            System.out.println("Apretaste el click derecho");
        }
        else
        {
            System.out.println("Apretaste el click de la rueda"); //Mouse Clasico, en caso de tener más botones se deberian agregar más if.
        }    
    }
}
*/

class EventoMouseSub implements MouseMotionListener
{
    public void mouseDragged(MouseEvent me)
    {
        System.out.println("Mouse Dragged");
    }
    public void mouseMoved(MouseEvent me)
    {
        System.out.println("Mouse Moved");
    }
}