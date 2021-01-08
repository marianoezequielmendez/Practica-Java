package poo;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.event.*;
import java.util.Date;

public class PruebaTemporizador 
{
    public static void main(String[] args) 
    {
//  Clase Timer +   nombre     = new+Timer+(int delay, objeto de tipo interfaz(ActionListener));            
//        Timer miTemporizador = new Timer (5000, oyente);
        DameLaHora oyente = new DameLaHora();
        Timer miTemporizador = new Timer (5000, oyente);
        miTemporizador.start();
        JOptionPane.showMessageDialog(null, "Presiona Aceptar para detener"); //Sirve en este caso para manterner la ejecucion hasta cuando queramos. (Clase 52)
        System.exit(0); //Frena la ejecucion del programa (Clase 52)
    }  
}

class DameLaHora implements ActionListener
{
    public void actionPerformed(ActionEvent e) //Es el metodo de ActionListener quedebemos utilizar por implemntarlo a la clase
    {
        Date ahora = new Date();
        System.out.println("La hora es: "+ahora);
        Toolkit.getDefaultToolkit().beep(); //Toolkit sirve para utilizar componentes de la pc, como el sonido o la pantalla. //Beep sirve para hacer un sonido cada vez que se ejecuta.
    }
}