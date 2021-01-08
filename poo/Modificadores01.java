package poo;

public class Modificadores01 
{
    //Atributos
    int myVar01 = 5;
    int myVar02 = 7;
    
    //Métodos
    protected String myMetodo() //Protected me permite acceder desde una subclase que se encuentre en otra clase.
    {
        return "El valor de myVar02 es "+myVar02;
    }
}
