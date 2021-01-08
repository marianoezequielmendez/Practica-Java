package poo;
import modificadoresDeAcceso.Modificadores03;

public class Modificadores02 
{
    public static void main(String[] args) 
    {
        Modificadores01 myObject = new Modificadores01();
//        myObject.myMetodo();
        Modificadores03 myObject02 = new Modificadores03();
        System.out.println(myObject02.myMetodo());
    }
}
