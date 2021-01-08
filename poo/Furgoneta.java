package poo;

public class Furgoneta extends Coche {  //Coche: Superclase. Furgoneta: SubClase. EXTENDS sirve para Herencia.
    //Atributos
    private int capacidad_carga;
    private int plazas_extras;
    
    //Contructores
    public Furgoneta(int plazas_extras, int capacidad_carga)
    {
        super(); //La instrucción SUPER llama al contructor de la clase padre(COCHE).
        this.plazas_extras = plazas_extras;
        this.capacidad_carga = capacidad_carga;
    }
    
    public String DatosFurgoneta()
    {
        return "Capacidad de carga: "+capacidad_carga+"\nPlazas extras: "+plazas_extras;
    }
    
//    public String MensajeFinal()  //NO VA
//    {
//        String climatizador = getClimatizador();
//        String cuero = getAsiento_cuero();
//        String peso = dimePesoTotal();
//        int precio = precioCoche();
//        return "El coche es de color "+color+". \nTiene "+ruedas+" ruedas. \n"+peso
//                +"\nEl motor es de "+motor+" chimuelos. \nLas medidas son de "+
//                largo+" de largo por "+ancho+" de ancho.\n"+climatizador+". \n"+cuero+"."
//                + " \n"+ "El precio total es de "+precio+" caramelos" ;
//    }
}
