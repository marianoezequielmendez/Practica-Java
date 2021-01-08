package poo;
import java.util.*;

//Clase 01
public class Empleados {

    public static void main(String[] args) {
        
          //Instancia de Jefes (Clase 43)
          Jefes jefe_01 = new Jefes("Courtney Love", 150000, 1995, 06, 12);
//          Jefes jefe_02 = new Jefes("La Rosalia", 120000, 2001, 03, 19);
          
          jefe_01.EstableceIncentivo(10000);
//          jefe_02.EstableceIncentivo(5000);

          //Versión 01
//        Empleado empleado_01 = new Empleado ("Mariano Méndez", 100000, 2012, 03, 01);
//        Empleado empleado_02 = new Empleado ("Pepe Argento", 60000, 2015, 06, 15);
//        Empleado empleado_03 = new Empleado ("Maria Gomez Calderón", 60000, 2015, 04, 05);
//        
//        empleado_01.subeSueldo(10);
//        empleado_03.subeSueldo(5);
//        
//        System.out.println(empleado_01.DatosTotales());
//        System.out.println(empleado_02.DatosTotales());
//        System.out.println(empleado_03.DatosTotales());

        //Versión 02 (Con Array)
        Empleado[] misEmpleados = new Empleado[6];
        misEmpleados[0] = new Empleado ("Mariano Méndez", 100000, 2012, 03, 01);
        misEmpleados[1] = new Empleado ("Pepe Argento", 70000, 2015, 06, 15);
        misEmpleados[2] = new Empleado ("Maria Gomez Calderón", 60000, 2015, 04, 05);
        misEmpleados[3] = new Empleado ("Roberto Carlos", 50000, 2000, 15, 03);
        misEmpleados[4] = jefe_01; //Polimorfismo (Clase 43)
        misEmpleados[5] = new Jefes("La Rosalia", 120000, 2001, 03, 19); //Lo mismo que arriba pero más claro.
        Jefes jefe_02 = (Jefes)misEmpleados[5]; //Casting, convertir un tipo (Empleado) en otro (Jefes)
        jefe_02.EstableceIncentivo(100000);
        //Clase 51
        System.out.println("El jefe "+jefe_02.getNombre()+" tiene una bonificación de "+jefe_02.establece_bonus(1000)+" dólares.");
        System.out.println("El empleado "+misEmpleados[3].getNombre()+" tiene una bonificación de "+misEmpleados[3].establece_bonus(500)+" dólares.");
        
        //Clase 50 hasta For clásico
        System.out.println(jefe_02.tomarDecisiones("aumentar el sueldo a todos los empleados"));
        
//        Empleado directorComercial = new Jefes("El Cutucuchillo", 45000, 2007, 11, 03);
//        Comparable ejemplo = new Empleado ("Ejemplo Nombre", 50000, 1945, 01, 11);
        
        //Prueba de video 50 (instanceof)
//        if (directorComercial instanceof Empleado)
//        {
//            System.out.println("Es de tipo Jefes");
//        }
//        if (ejemplo instanceof Comparable)
//        {
//            System.out.println("Implementa la interfaz 'Comparable'");
//        }
        
        //FOR clásico
        for (int i=0; i<misEmpleados.length; i++)
        {
            misEmpleados[i].subeSueldo(0);
        }
        
        //Ordenar arrays, necesario interfaz Comparable implementado en objeto Empleado2
        Arrays.sort(misEmpleados);
        
        //FOR EACH
        for (Empleado e: misEmpleados)
        {
            System.out.println(e.DatosTotales()+"Este es el otro sueldo ");
        }
    }
}

//Clase 02
class Empleado implements Comparable, Trabajadores
{
    //Contructores
    public Empleado(String nom, double sue, int agno/*=Año*/, int mes, int dia)
    {
        nombre=nom; 
        sueldo=sue;
        GregorianCalendar calendario = new GregorianCalendar (agno, mes-1, dia); //Gregorian Calendar da el forato de fecha
        altaContrato = calendario.getTime(); //GetTime da la fecha que tiene el Gregorian Calendar (Devuelve un tipo de dato DATE)
    }
//    public Empleado(String nom)
//    {
//        this(nom, 30000, 2000, 01, 01);
//    }
    
    //GETTERS
    public String getNombre() 
    {
        return nombre;
    }
    public double getSueldo()
    {
        return sueldo;
    }
    public Date getAltaContrato() 
    {
        return altaContrato;
    }
    
    //SETTERS
//    public void setNombre(String nombre) 
//    {
//        this.nombre = nombre;
//    }
//
//    public void setSueldo(double sueldo) 
//    {
//        this.sueldo = sueldo;
//    }
//
//    public void setAltaContrato(Date altaContrato) 
//    {
//        this.altaContrato = altaContrato;
//    }
    
    //Método (SETTER)
    public void subeSueldo(double porcentaje)
    {
        double aumento = sueldo*porcentaje/100;
        sueldo += aumento;
    }
    
    //Métodos MEM
    public String DatosTotales()
    {
        return "El empleado "+nombre+" con ingreso en la fecha ("+altaContrato+") tiene un sueldo de "+getSueldo()+" dolares.";
    }
    
    //Interfaz Comparable
    public int compareTo(Object myObject)
    {
        Empleado otroEmpleado = (Empleado)myObject; //Esto permite tener una variable objeto del tipo empleado para poder comparar dentro del array misEmpleados.
        
        if (this.getSueldo() < otroEmpleado.getSueldo()) //Si, el sueldo de este empleado es menos al sueldo de otro, entonces devuelve -1
        {
            return -1;
        }
        else if (this.getSueldo() > otroEmpleado.getSueldo())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    
    //Método interfaz Trabajadores
    public double establece_bonus(double gratificacion)
    {
        return Trabajadores.bonus_base + gratificacion;
    }
    
    //Atributos
    private String nombre;
    private double sueldo;
    private Date altaContrato;
}

//Clase 03 (Herencia)
class Jefes extends Empleado implements Jefes_Interfaz
{
    //Atributos
    private double incentivo;

    //Contructores
    public Jefes(String nom, double sue, int agno, int mes, int dia)
    {
        super(nom, sue, agno, mes, dia);
    }
    
    //Métodos
    //GETTERS
    public double getSueldo()
    {
        double sueldoJefe = super.getSueldo(); //El Super adelante es para obtener el método de la clase padre.
        return sueldoJefe+incentivo;
    }
    //SETTERS
    public void EstableceIncentivo(double incentivo) //Incentivo cantidad de pesos extras (Ej: 500 pesos)
    {
        this.incentivo = incentivo;
    }
    
    //Método de Jefez_Interfaz
    public String tomarDecisiones(String decisiones)
    {
        return "Un miembro tomo la decisión de "+decisiones;
    }
    
    //Método de interfaz Trabajadores
    public double establece_bonus(double gratificacion)
    {
        double prima = 2000;
        return Trabajadores.bonus_base + gratificacion + prima;
    }
}

//Una subclase que hereda de Jefes y de Empleados. No hay límites.
/* 
final class Directores extends Jefes
{
    //Contructor
    public Directores(String nom, double sue, int agno, int mes, int dia)
    {
        super(nom, sue, agno, mes, dia);
    }
}
*/