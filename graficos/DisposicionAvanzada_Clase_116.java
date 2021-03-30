package graficos;
import java.awt.*;
import javax.swing.*;

public class DisposicionAvanzada_Clase_116 {
    public static void main(String[] args) {
      MarcoDAClase116 miMarco = new MarcoDAClase116();
      miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoDAClase116 extends JFrame{
    public MarcoDAClase116(){
        setBounds(300,200,500,250);
        
        LaminaDAClase116 miLamina = new LaminaDAClase116();
        add(miLamina);
        
        setVisible(true);
    }
}

class LaminaDAClase116 extends JPanel{
    public LaminaDAClase116(){
        JButton boton01 = new JButton("Boton 01");
        JButton boton02 = new JButton("Boton 02");
        JButton boton03 = new JButton("Boton 03");
        
        SpringLayout miLayout = new SpringLayout();
        setLayout(miLayout);
        
        add(boton01);
        add(boton02);
        add(boton03);
        
        Spring miMuelleSpring = Spring.constant(0,10,100);
        Spring miMuelleRigido = Spring.constant(10);
        
        miLayout.putConstraint(SpringLayout.WEST, boton01, miMuelleSpring, SpringLayout.WEST, this);
        miLayout.putConstraint(SpringLayout.WEST, boton02, miMuelleRigido, SpringLayout.EAST, boton01);
        miLayout.putConstraint(SpringLayout.WEST, boton03, miMuelleRigido, SpringLayout.EAST, boton02);
        miLayout.putConstraint(SpringLayout.EAST, this, miMuelleSpring, SpringLayout.EAST, boton03);
    }
}