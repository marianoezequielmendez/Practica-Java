package primerosVideos;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Entradas {


//    public static void main(String[] args) {
//        
////        EntradaScanner();
////        JOptionPane();
////        EntradaNumeros01();
////        EntradaNumeros02();
//    }
    
    public static void EntradaScanner ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Introduce tu edad");
        int edad = sc.nextInt();
        System.out.println("Hola "+nombre+". En tu próximo cumpleños tendrás "+(edad+1)+" años.");
    }
    
    public static void JOptionPane()
    {
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
        String edad = JOptionPane.showInputDialog("Introduce tu edad");
        int newEdad = Integer.parseInt(edad); //Metodo de la clase INTEGER para convertir un String en Int.
        System.out.println("Hola "+nombre+". En tu próximo cumpleños tendrás "+(newEdad+1)+" años.");
    }
    
    public static void EntradaNumeros01()
    {
        double x = 10000.0;
        System.out.printf("%1.2f", x/3); //Este método acorta los decimales luego del punto. 1.2 (2 decimales despues del punto).
        System.out.println("");
    }
    
    public static void EntradaNumeros02()
    {
        String num1 = JOptionPane.showInputDialog("Introduce un número");
        double num2 = Double.parseDouble(num1);
        System.out.print("La raíz cuadrada de "+num2+" es ");
        double resultado = Math.sqrt(num2); //Método Math para obtener la raíz cuadrada de un double
        System.out.printf("%1.2f",resultado);
        System.out.println("");
    }
}
