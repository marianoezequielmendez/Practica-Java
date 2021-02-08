package graficos;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class JSlider02 {
    public static void main(String[] args) {
        MarcoJS2 miMarco = new MarcoJS2();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoJS2 extends JFrame{
    public MarcoJS2(){
        setBounds(450,200,500,300);
        
        LaminaJS2 miLamina = new LaminaJS2();
        add(miLamina);
        
        setVisible(true);
    }
}

class LaminaJS2 extends JPanel{
    public LaminaJS2(){
        control = new JSlider(10,50,12);
        rotulo = new JLabel("Este es un mensaje de prueba");
        laminaSlider = new JPanel();
        EventoSlider evento = new EventoSlider();
        
        setLayout(new BorderLayout());
        
        control.addChangeListener(evento);
        control.setSnapToTicks(true);
        control.setMajorTickSpacing(10);
        control.setMinorTickSpacing(2);
        control.setFont(new Font("Serif", Font.PLAIN, 10));
        control.setPaintTicks(true);
        control.setPaintLabels(true);
        laminaSlider.add(control);
        add(laminaSlider, BorderLayout.NORTH);
        add(rotulo, BorderLayout.CENTER);
    }
    
    private class EventoSlider implements ChangeListener{
        public void stateChanged(ChangeEvent ce){
            rotulo.setFont(new Font("Serif", Font.PLAIN, control.getValue()));
        }
    }
    
    private JLabel rotulo;
    private JSlider control;
    private JPanel laminaSlider;
}