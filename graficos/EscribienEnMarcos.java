package graficos;
import javax.swing.*;
import java.awt.*;

public class EscribienEnMarcos 
{
    public static void main(String[] args) 
    {
        MarcoConTexto miMarco = new MarcoConTexto();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
}

class MarcoConTexto extends JFrame
{
    public MarcoConTexto()
    {
        setVisible(true);
        setSize(600, 450);
        setLocation (400, 200);
        setTitle("Primer Texto");
        Lamina miLamina = new Lamina();
        add(miLamina);
        miLamina.setForeground(Color.BLUE); //El Foreground pinta todo lo que este adelante (Textos) en el color seleecionado.
    }
}

class Lamina extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Font miFuente = new Font("Arial", Font.BOLD, 26); //Cambia el tipo de fuente y lo almacena en un objeto tipo Font
        g.setFont(miFuente); //Lo cambia al tipo de fuente creado arriba
//        g.setColor(Color.RED); //Ya esta el ForeGround en la clase "MarcoConTexto". Si activo este, es el que tiene prioridad.
        g.drawString("Estamos aprendiendo Swing", 100, 100);
    }
}