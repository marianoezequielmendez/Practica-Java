//
//package poo;
//import java.util.Date;
//import java.util.GregorianCalendar;
//
//public class Personas 
//{
//
//     public static void main(String[] args) {
//        
//         Persona[] lasPersonas = new Persona[2];
//         lasPersonas[0] = new Empleado("Miguel Ángel", 10000, 2000, 01, 01);
//         lasPersonas[1] = new Alumno("Beto Casella");
//         
//         for (Persona e: lasPersonas)
//         {
//             System.out.println(e.getDescripcion());
//         }
//    }
//}
//
//abstract class Persona
//{
//    public Persona (String nom)
//    {
//        nombre = nom;
//    }
//
//    public String getNombre() {
//        return nombre;
//    }
//    
//    public abstract String getDescripcion();
//    
//    private String nombre;
//}
//
//class Empleado extends Persona
//{
//    //Contructores
//    public Empleado(String nom, double sue, int agno/*=Año*/, int mes, int dia)
//    {
//        super(nom);
//        sueldo=sue;
//        GregorianCalendar calendario = new GregorianCalendar (agno, mes-1, dia); //Gregorian Calendar da el forato de fecha
//        altaContrato = calendario.getTime(); //GetTime da la fecha que tiene el Gregorian Calendar (Devuelve un tipo de dato DATE)
//    }
//    
//    //Métodos abstracos definidos
//    public String getDescripcion()
//    {
//        return "Sueldo de empleado: "+sueldo;
//    }
//    //GETTERS
//    public double getSueldo()
//    {
//        return sueldo;
//    }
//    public Date getAltaContrato() 
//    {
//        return altaContrato;
//    }
//    
//    
//    //Método (SETTER)
//    public void subeSueldo(double porcentaje)
//    {
//        double aumento = sueldo*porcentaje/100;
//        sueldo += aumento;
//    }
//    
//    //Métodos MEM
//    public String DatosTotales()
//    {
//        return "El empleado "+"(Aqui va nombre)"+" con ingreso en la fecha ("+altaContrato+") tiene un sueldo de "+getSueldo()+" dolares.";
//    }
//    
//    //Atributos
////    private String nombre;
//    private double sueldo;
//    private Date altaContrato;
//}
//
//class Alumno extends Persona
//{
//    public Alumno(String nom)
//    {
//        super(nom);
//        nombre = nom;
//    }
//    
//    public String getDescripcion()
//    {
//        return "Este Alumno se llama "+nombre;
//    }
//    
//    private String nombre;
//}