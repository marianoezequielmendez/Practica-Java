package poo;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class PruebaTemporizador2 
{
    public static void main(String[] args) 
    {
        Reloj miReloj = new Reloj();
        Reloj miReloj2 = new Reloj();
        miReloj2.enMarcha(2000, false);
        JOptionPane.showMessageDialog(null, "Presiona Aceptar para terminar.");
        System.exit(0);
    }    
}

class Reloj 
{   
    public void enMarcha(int intervalo, final boolean sonido)
    {
        //La clase interna local esta dentro de un metodo si solose utiliza una vez. No puede llevar identificador de acceso (Ejemplo private)
        //Clase interna local
        class DameLaHora2 implements ActionListener
        {
            public void actionPerformed(ActionEvent evento)
            {
                Date ahora = new Date();
                System.out.println("La hora es: "+ahora);
                if (sonido)
                {
                    Toolkit.getDefaultToolkit().beep();
                }   
            }
        }
        
        //Resto del método
        ActionListener oyente = new DameLaHora2();
        Timer miTemporizador = new Timer(intervalo, oyente);
        miTemporizador.start();
    }
    
    //La Clase interna puede estar dentro de otra clase.
    /* 
    private class DameLaHora2 implements ActionListener
    {
        public void actionPerformed(ActionEvent evento)
        {
            Date ahora = new Date();
            System.out.println("La hora es: "+ahora);
            if (sonido)
            {
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
    */
}


