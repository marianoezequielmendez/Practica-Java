package graficos;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class JSlider01 {
    public static void main(String[] args) {
        MarcoJS miMarco = new MarcoJS();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoJS extends JFrame{
    public MarcoJS(){
        setBounds(450,200,500,300);
        
        LaminaJS miLamina = new LaminaJS();
        add(miLamina);
        
        setVisible(true);
    }
}

class LaminaJS extends JPanel{
    public LaminaJS(){
        JSlider control = new JSlider(0,150,100);
        
        control.setMajorTickSpacing(25);
        control.setMinorTickSpacing(5);
        control.setPaintTicks(true);
        control.setFont(new Font("Serif", Font.PLAIN , 12));
        control.setPaintLabels(true);
        control.setSnapToTicks(true); //Método que lleva el puntero a la marca más cercana.
        
        add(control);
    }
}