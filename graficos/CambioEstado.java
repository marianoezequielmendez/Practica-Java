package graficos;
import java.awt.Frame;
import java.awt.event.*;
import javax.swing.*;

public class CambioEstado 
{
    public static void main(String[] args) 
    {
        MarcoEstado miMarco = new MarcoEstado();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoEstado extends JFrame
{
    public MarcoEstado()
    {
        setTitle("Mi Marco");
        setBounds(300, 300, 500, 350);
        setVisible(true);
        addWindowStateListener(new CambiaEstado()); //Se agrega con el ADD mas el nombre de la interfaz
    }
}

class CambiaEstado implements WindowStateListener
{
    public void windowStateChanged(WindowEvent we) 
    {
//        System.out.println("La ventana cambio de estado");
//        System.out.println(we.getNewState());
        if (we.getNewState()==6) //Los numeros representan estado de la ventana ya fijos en la API. En este caso, 6 es pantalla completa.
        {
            System.out.println("La ventana esta en pantalla completa");
        }
        else if(we.getNewState()==Frame.NORMAL) //Es lo mismo que poner un numero.
        {
            System.out.println("La ventana esta en su estado normal");
        }
    }
}