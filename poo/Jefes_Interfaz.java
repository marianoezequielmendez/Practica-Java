package poo;

public interface Jefes_Interfaz extends Trabajadores
{
    //Métodos
    //Forma de crear métodos dentro de una interfaz
    String tomarDecisiones (String decisiones); //Si no se agrega encapsulacion es siempre (public abstract) por defecto. Tipo a devolver, nombre, parametros.
}
