package primerosVideos;

public class ClaseString {

    public static void main(String[] args) {
               
//        PruebaVariable();
//        Video01();
//        Video02();
          
    }
    
    public static void Video01 ()
    {
        String nombre = "Mariano";
        System.out.println("Mí nombre es "+nombre+".");
        System.out.println("Mí nombre tiene "+nombre.length()+" letras.");
        System.out.println("La primera letra de "+nombre+" es "+nombre.charAt(0)+".");
        int ultimaLetra = nombre.length();
        System.out.println("La última letra de "+nombre+" es "+ nombre.charAt(ultimaLetra-1)+".");
        int letraMedio = nombre.length()/2;
        if (nombre.length()%2 == 0)
        {
            System.out.println("La letra media de "+nombre+" es "+ nombre.charAt(ultimaLetra-letraMedio-1)+".");
        }
        else
        {
            System.out.println("La letra media de "+nombre+" es "+ nombre.charAt(ultimaLetra-letraMedio-1)+".");
        } 
    }
    
    public static void Video02()
    {
        String frase = "Frase de prueba para trabajar con la clase String.";
        int numeroFrase = frase.length();
        String resumenFrase = frase.substring(34, 49);
        System.out.println("El resumen más importante del tema es '"+resumenFrase+"'");
        
        String alumno01 = "David";
        String alumno02 = "david";
        System.out.println(alumno01.equals(alumno02));
        System.out.println(alumno01.equalsIgnoreCase(alumno02));
    }
    
    public static void PruebaVariable()
    {
        
    }
    
}
