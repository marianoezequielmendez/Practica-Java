package Mems;
import java.awt.GraphicsEnvironment;
import javax.swing.*;

public class FuentesDelSistema 
{
    public static void main(String[] args) 
    {
        String fuente = JOptionPane.showInputDialog("Introduce fuente");
        boolean estaLaFuente = false;
        
        String[] nombreDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames(); //Me guarda en un array (nombreDeFuentes) todas las fuentes que tiene el sistema.
        for (String nombreDeFuente: nombreDeFuentes)
        {
//            System.out.println(nombreDeFuente); //Me imprime todas las fuentes disponibles
            if(nombreDeFuente.equals(fuente))
            {
                estaLaFuente = true;
            }
        }
        
        if (estaLaFuente)
        {
            System.out.println("La fuente "+fuente+" se encuentra disponible en el sistema.");
        }
        else
        {
            System.out.println("La fuente "+fuente+" no se encuentra en el sistema.");
        }
    }
}
