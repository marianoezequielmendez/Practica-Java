package graficos;
import java.awt.Frame;
import javax.swing.*;

public class CreandoMarcos 
{
    public static void main(String[] args) 
    {
        miMarco marco1 = new miMarco();
        marco1.setVisible(true); //setVisible hace visible el marco, sin esto no se ve
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //setDefault sirve para cerrar, pide un int entre parentesis
    }
    
}

class miMarco extends JFrame //JFrame es el paquete para las ventanas graficas
{
    public miMarco()
    {
        //Los dos de abajo se pueden reemplazr por setBounds que tiene todo junto.
//        setSize(500, 300); //setSide le da un tamaño a la ventana que por defaul es de 0*0. Entre parentesis (Alto*ancho) 
//        setLocation(500, 400); //Le da la locacion del cuadro (500 en X, 400 en Y)
        setBounds(500, 300, 500, 250); //(X, Y, Alto, Ancho) 
//        setResizable(false); //Si esta en false no se puede cambiar el tamaño de la pantalla. Por defecto es True.
//        setExtendedState(Frame.MAXIMIZED_BOTH); //Se abre en pantalla completa
//        setExtendedState(6); //El 6 representa lo mismo que el parentesis de arriba. Se puede buscar en la API de JAVA
        setTitle("La ventana de MEM"); //Le da un título a la ventana
    }
}