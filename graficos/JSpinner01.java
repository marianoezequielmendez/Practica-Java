package graficos;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class JSpinner01 {

    public static void main(String[] args) {
        MarcoJSP01 miMarco = new MarcoJSP01();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoJSP01 extends JFrame{
    public MarcoJSP01(){
        setBounds(450,200,500,300);
        
        LaminaJSP01 miLamina = new LaminaJSP01();
        add(miLamina);
        
        setVisible(true);
    }
}

class LaminaJSP01 extends JPanel{
    public LaminaJSP01(){
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril"};
        String[] lista = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        
//        JSpinner miSpinner = new JSpinner(new SpinnerDateModel());  //Para Fecha
//        JSpinner miSpinner = new JSpinner(new SpinnerListModel(lista)); //Para Array
        JSpinner miSpinner = new JSpinner(new SpinnerNumberModel(5,0,10,1)); //Parametro = Numero inicial, Minimo, Maximo, De uno en uno.
//        JSpinner miSpinner = new JSpinner(new MiModeloJSpinner());
        
        miSpinner.setPreferredSize(new Dimension(200,21)); //Tamaño del Spinner
        
        add(miSpinner);
    }
    
    //Clase creada para invertir las flechas del Spinner
    /*
    private class MiModeloJSpinner extends SpinnerNumberModel{
        public MiModeloJSpinner(){
            super(5,0,10,1);
        }
        
        public Object getNextValue(){
            return super.getPreviousValue();
        }
        public Object getPreviousValue(){
            return super.getNextValue();
        }
    }*/
}