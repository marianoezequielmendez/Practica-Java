package graficos;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class CreandoMarcoCentrado 
{
    public static void main(String[] args) 
    {
        MarcoCentrado miMarco = new MarcoCentrado();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);        
    }
}

class MarcoCentrado extends JFrame
{
    public MarcoCentrado()
    {
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla = miPantalla.getScreenSize();
        int alturaPantalla = tamanioPantalla.height;
        int anchoPantalla = tamanioPantalla.width;
        
        setSize(anchoPantalla/2, alturaPantalla/2);
        setLocation(anchoPantalla/4, alturaPantalla/4);  
        setTitle("Ventana de MEM");
        Image miLogo = miPantalla.getImage("src/graficos/icono.gif"); //Con esto elijo el logo, lo guaro dentro de la carpeta del proyecto
        setIconImage(miLogo); //Activo el logo
    }
}
