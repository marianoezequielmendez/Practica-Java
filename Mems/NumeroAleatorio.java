package Mems;
import javax.swing.JOptionPane;

public class NumeroAleatorio
{
    public static void main(String[] args) 
    {
        int numeroAleatorio = (int)(Math.random()*100);
        int numeroElegido = 0;
        int intentos = 0;
        
        System.out.println("Que número estoy pensando?");
//        System.out.println(numeroAleatorio);
        
        do
        {
            numeroElegido = Integer.parseInt(JOptionPane.showInputDialog("Elíge un número del 1 al 100."));
            if (numeroElegido > numeroAleatorio)
            {
                System.out.println("El número es más bajo");
            }
            else if (numeroElegido < numeroAleatorio)
            {
                System.out.println("El número es más alto");
            }
            intentos++;
        }
        while(numeroElegido != numeroAleatorio);
        
        System.out.println("GANASTE: El número era el "+numeroAleatorio+". Lo conseguiste con "+intentos+" intentos.");
    }
}
