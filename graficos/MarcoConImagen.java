package graficos;
import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.imageio.*;

public class MarcoConImagen 
{
    public static void main(String[] args) 
    {
        MarcoImagen miMarco = new MarcoImagen();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoImagen extends JFrame
{
    public MarcoImagen()
    {
        setTitle("Marco con imagen");
        setBounds(50, 30, 900, 900);
        LaminaConImagen miLamina = new LaminaConImagen();
        add(miLamina);
    }    
}

class LaminaConImagen extends JPanel
{
    public LaminaConImagen()
    {
        try //Probar esto...
        {        
            imagen = ImageIO.read(miImagen);
        } 
        catch(IOException e) //Si no se puede, hacer esto. 
        {
//            Logger.getLogger(LaminaConImagen.class.getName()).log(Level.SEVERE, null, ex);  //Esto lo escribio directamente la ayuda del sistema. No se que ahce
            System.out.println("No se encuentra la imagen");
        }
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, null);
            
        //Mosaico by Mem
        int ancho = imagen.getWidth(this);//Obtiene ancho de la imagen seleccionada. El this es el objeto que se muestra mientras carga la imagen, en este caso la misma lamina.
        int alto = imagen.getHeight(this);//Obtiene la altura 
        for (int i=0; i<5; i++)
        {
            for(int j=0; j<5; j++)
            {
//                g.copyArea(0, 0, 225, 225, i*225 ,j*225);
                g.copyArea(0, 0, ancho, alto, ancho*i ,alto*j); //Si no se sabe el valor de ancho y alto, se usan los metodos Get
            }
        }
    }
    
    private Image imagen;
//        File miImagen = new File("src/graficos/Instagram.png"); //Imagen 01
    File miImagen = new File("src/graficos/IronMan15x15.png");   //Imagen 02
}
