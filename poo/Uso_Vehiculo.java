package poo;

import javax.swing.JOptionPane;

public class Uso_Vehiculo {

    public static void main(String[] args) 
    {
        //Primer objeto (Coche)
//        Coche coche_01 = new Coche();
//        coche_01.establece_color(JOptionPane.showInputDialog("Introduce el color"));
//        coche_01.setAsiento_cuero(JOptionPane.showInputDialog("Lo quieres con asientos de cuero? (Si/No)"));
//        coche_01.setClimatizador(JOptionPane.showInputDialog("Lo quieres con climatizador? (Si/No)"));      
//        
//        System.out.println(coche_01.MensajeFinal());
        
        //Objeto Furgoneta
        Furgoneta furgoneta_01 = new Furgoneta(25,100);
        furgoneta_01.establece_color(JOptionPane.showInputDialog("Introduce el color"));
        furgoneta_01.setAsiento_cuero(JOptionPane.showInputDialog("Lo quieres con asientos de cuero? (Si/No)"));
        furgoneta_01.setClimatizador(JOptionPane.showInputDialog("Lo quieres con climatizador? (Si/No)"));      
        
        System.out.println(furgoneta_01.DatosFurgoneta());
        System.out.println(furgoneta_01.MensajeFinal());
        
        
        
        // Segundo Objeto (Coche)
//        Coche coche_02 = new Coche();
//        coche_02.establece_color(JOptionPane.showInputDialog("Introduce el color"));
//        coche_02.setAsiento_cuero(JOptionPane.showInputDialog("Lo quieres con asientos de cuero? (Si/No)"));
//        coche_02.setClimatizador(JOptionPane.showInputDialog("Lo quieres con climatizador? (Si/No)"));      
//        
//        System.out.println(coche_02.MensajeFinal());
        
//        System.out.println(coche_01.getClimatizador());    
//        System.out.println(coche_01.dimePesoTotal());    
//        System.out.println(coche_01.getAsiento_cuero());    
//        System.out.println(coche_01.dime_color());
//        System.out.println(coche_01.dime_largo());
//        System.out.println("El precio final del coche es de: "+coche_01.precioCoche());  
    }
    
}
