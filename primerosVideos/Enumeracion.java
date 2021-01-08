package primerosVideos;
import java.util.*;

public class Enumeracion 
{
//    Primera forma de establecer parametros dentro del "main". 
//    enum talle {Chico, Mediano, Grande, Muy_Grande}; //Enum (Enumeracion) sirve para que dentro de talle no se pueda almacenar otro termino.
    
//    Segunda manera de establecer parametros todo en uno.
    enum talle
    {
        //Establecer parametros en primer lugar.
        CHICO("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
        
        //Setter dentro de talle
        private talle (String abreviatura)
        {
            this.abreviatura = abreviatura;
        }
        
        //Getter
        public String getAbreviatura()
        {
            return abreviatura;
        }
        
        //Atributo dentro de enum talle
        private String abreviatura;
    }
    
    public static void main(String[] args) 
    {
//        talle s = talle.Chico;
//        talle m = talle.Mediano;
//        talle l = talle.Grande;
//        talle xl = talle.Muy_Grande;
        
        //Version de Youtube
        System.out.println("Introduce talle para conocer tamaño.\n(Chico, Mediano, Grande, Muy_grande)");
        Scanner sc = new Scanner(System.in);
        String entradaUsuario = sc.nextLine().toUpperCase(); //UpperCase retorna todas mayusculas a lo introducido.
        talle elTalle = Enum.valueOf(talle.class, entradaUsuario);
        System.out.println("El talle "+elTalle+" es "+elTalle.getAbreviatura());
        

        //Version con IF by Mem (Mejor para mi)
//        System.out.println("Introduce talle para conocer tamaño.\n(Chico, Mediano, Grande, Muy_grande)");
//        Scanner sc = new Scanner(System.in);
//        String entradaUsuario = sc.nextLine();

//        if(entradaUsuario.equalsIgnoreCase("S"))
//        {
//            System.out.println("Es un talle chico.");
//        }
//        else if(entradaUsuario.equalsIgnoreCase("M"))
//        {
//            System.out.println("Es un talle mediano.");
//        }
//        else if(entradaUsuario.equalsIgnoreCase("L"))
//        {
//            System.out.println("Es un talle grande.");
//        }
//        else if(entradaUsuario.equalsIgnoreCase("XL"))
//        {
//            System.out.println("Es un talle muy grande.");
//        }
//        else
//        {
//            System.out.println("No se encuentra el talle");
//        }
    }
    
}
