package poo;

public class Static_Final {

    public static void main(String[] args) 
    {
        EmpleadoPrueba Empleado_01 = new EmpleadoPrueba("Beto");  //Clase+nombre = new + Contructor(Parámetro);
        EmpleadoPrueba Empleado_02 = new EmpleadoPrueba("Toto");
        EmpleadoPrueba Empleado_03 = new EmpleadoPrueba("Mabel");
        
        Empleado_01.CambiaSector("RR.HH");
        
        System.out.println(Empleado_01.DatosEmpleados());
        System.out.println(Empleado_02.DatosEmpleados());
        System.out.println(Empleado_03.DatosEmpleados());
        
        System.out.println(EmpleadoPrueba.NextID());  //Para Métodos STATIC primer Clase (EmpleadoPrueba) y despues método
    }
    
}

class EmpleadoPrueba
{
    //Atributos
    private final String nombre;  //"final" sirve para constante
    private String sector;
    private int ID;
    private static int IDSiguiente = 1;
    
    //Contructor
    public EmpleadoPrueba(String nom)
    {
        nombre = nom;
        sector = "Administración";
        ID = IDSiguiente;
        IDSiguiente++;
    }
    
    //SETTERS
    public void CambiaSector (String sector)
    {
        this.sector = sector;
    }
    
    //GETTERS
    public String DatosEmpleados()
    {
        return "Nombre: "+nombre+"\nID: "+ID+"\nSector: "+sector+"\n";
    }
    
    //Métodos
    public static String NextID()
    {
        return "El próximo ID es: "+IDSiguiente+"\n";
    }
}
