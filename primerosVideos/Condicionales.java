package primerosVideos;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Condicionales {

    public static void main(String[] args) 
    {
//        Condicional01();
//        Condicional02();
//        Condicional03();
        Condicional04();  //Juego Numeros Aleatorios
//        DoWhile_PesoIdeal();
//        For_Tabla();
//        Comprueba_mail();
//        Factorial();
    }

    public static void Condicional01() //EDAD PARA SABER SI ES MAYOR
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad = sc.nextInt();
        
        if (edad < 18 && edad >= 0)
        {
            System.out.println("Eres menor de edad");
        }
        else if (edad >= 18 && edad < 65)
        {
            System.out.println("Eres adulto/a");
        }
        else if (edad >= 65)
        {
            System.out.println("Eres jubilado/a");
        }
        else
        {
            System.out.println("Eres un no nacido");
        }  
    }
    
    public static void Condicional02() //CALCULA EL AREA
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Elige una opción.\n1: Cuadrado\n2: Rectángulo\n3: Triángulo\n4: Círculo");
        int figura = sc.nextInt();
        
        switch (figura)
        {
            case 1:
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado del cuadrado"));
                System.out.println("El área del cuadrado es "+Math.pow(lado, 2)); //Método POW sirve para hacer exponente
                break;
            case 2:
                int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del rectángulo"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del rectángulo"));
                System.out.println("El área del rectángulo es "+(base*altura)); 
                break;
            case 3:
                base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del triángulo"));
                altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del triángulo"));
                System.out.println("El área del triángulo es "+(base*altura)/2); 
                break;
            case 4:
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio del círculo"));
                System.out.print("El área del círculo es "); 
                System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
                System.out.println("");
                break;
            default:
                System.out.println("Código incorrecto. Selecciona un número del 1 al 4.");
        }
    }
    
    public static void Condicional03() //WHILE CONTRASEÑA
    {
        String clave = "Mem";
        String password = "";
        
        while (clave.equals(password) == false)
        {
            password = JOptionPane.showInputDialog("Introduce la contraseña");
            if (clave.equals(password) == false)
            {
                System.out.println("Contraseña incorrecta");
            }
        }
        
        System.out.println("Contraseña correcta");
    }
    
    public static void Condicional04() //JUEGO DE NÚMERO ALEATORIO
    {
        System.out.println("Adivina que número estoy pensando");
        int aleatorio = (int)(Math.random()*100);
//        System.out.println(aleatorio);
//        Scanner sc = new Scanner (System.in);
        int num = 0;
        int intentos = 0;
        
        do
        {
//            System.out.println("Introduce un número del 0 al 100");
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número del 0 al 100"));
            
            if (num > aleatorio)
            {
                System.out.println("INCORRECTO: El número es más bajo");
            }
            else if (num < aleatorio)
            {
                System.out.println("INCORRECTO: El número es más alto");
            }
            intentos++;
           
//            if (num != aleatorio)
//            {
//                System.out.println("Este tu intento número "+intentos);
//            }
        }
        while (num != aleatorio);

        System.out.println("CORRECTO: Ganaste con un total de "+intentos+" intentos.\nEl número era "+num+".");
    }
    
    public static void DoWhile_PesoIdeal()
    {
        System.out.println("Calcula tu peso ideal según tus datos");
        String genero = "";
        do
        {
        genero = JOptionPane.showInputDialog("Selecciona tu género:\nH (Hombre)\nM (Mujer)");
        }
        while (genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
        
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm.\nEjemplo: 170"));
        
        if (genero.equalsIgnoreCase("H"))
        {
            System.out.println("Tu peso ideal es de "+(altura-110)+"Kg.");
        }
        else
        {
            System.out.println("Tu peso ideal es de "+(altura-120)+"Kg.");
        }    
    }
    
    public static void For_Tabla()
    {
        for (int i=0; i<10 ; i++)
        {
            System.out.println("9 x "+(i+1)+": "+9*(i+1));
        }
    }
    
    public static void Comprueba_mail()
    {
        int arroba = 0;
        boolean punto = false;
        
        while (arroba == 0)
        {
            String mail = JOptionPane.showInputDialog("Ingrese su E-mail:");
            for (int i=0; i<mail.length(); i++)
            {
                if (mail.charAt(i) == '@')
                {
                    arroba ++;
                }
                if (mail.charAt(i) == '.')
                {
                    punto = true;
                }
            } 
            
            if(arroba == 1 && punto == true)
            {
                System.out.println("Mail aceptado");
            }
            else
            {
                System.out.println("Mail incorrecto");
                arroba = 0;
            }    
        }
    }
    
    public static void Factorial()
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        long resultado=1L;
        
        for (int i=0; i<num; i++)
        {
            resultado = resultado*(i+1);
        }
        
        System.out.println("El factorial de "+num+" es "+resultado);
    }
}
