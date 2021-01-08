package poo;

public class Coche {
    
    //Atributos
    private int ruedas;
    private int largo, ancho;
    private int motor;
    private int peso_plataforma;
    private int peso_total;
    
    private String color;
    
    private boolean asientos_cuero, climatizador;
    
    //Contructores
    public Coche() 
    {
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;
    }
    
    //GETTERS
    public String dime_largo()
    {
        return "El largo del coche es "+largo+" mts";
    }
    
    public String dime_color()
    {
        return "El color del coche es "+color;
    }
    
    public String getAsiento_cuero()
    {
        if (asientos_cuero == true)
        {
            return "Asientos: Cuero";
        }
        else
        {
            return "Asientos: Serie";
        }
    }
    
    public String getClimatizador() {
        if(climatizador == true)
        {
            return "Climatizador: Si";
        }
        else
        {
            return "Climatizador: No";
        }
    }
    
    public String dimePesoTotal()  //SETTER y GETTER a la vez (No recomendable)
    {
        int peso_carroceria = 500;
        peso_total = peso_plataforma + peso_carroceria;
        
        if(asientos_cuero == true)
        {
            peso_total= peso_total + 50;
        }
        
        if(climatizador == true)
        {
            peso_total= peso_total + 20;
        }
        
        return peso_total+" Kg";
    }
    
    public int precioCoche()
    {
        int precioFinal = 10000;
        if (asientos_cuero == true)
        {
            precioFinal += 2000;
        }
        
        if (climatizador == true)
        {
            precioFinal += 1500;
        }
        return precioFinal;
    }
    
    public String MensajeFinal()
    {
        String climatizador = getClimatizador();
        String cuero = getAsiento_cuero();
        String peso = dimePesoTotal();
        int precio = precioCoche();
        return "Color: "+color+"\nCantidad de ruedas: "+ruedas+"\nPeso: "+peso
                +"\nMotor: "+motor+"\nMedidas: "+
                largo+" de largo por "+ancho+" de ancho.\n"+climatizador+"\n"+cuero+
                "\n"+ "Precio total: "+precio;
    }
    
    //SETTTERS
    public void establece_color(String color_coche)
    {
        color = color_coche;
    }
    
    public void setAsiento_cuero(String asientos_cuero)
    {
        if (asientos_cuero.equalsIgnoreCase("Si"))
        {
            this.asientos_cuero = true;
        }
        else
        {
            this.asientos_cuero = false;
        }    
    }

    public void setClimatizador(String climatizador) {
        if (climatizador.equalsIgnoreCase("Si"))
        {
            this.climatizador = true;
        }
        else
        {
            this.climatizador = false;
        }
    } 
}
