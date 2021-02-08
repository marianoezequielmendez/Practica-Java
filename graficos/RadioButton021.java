package graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButton021 {
    public static void main(String[] args) {
        MarcoRB021 miMarco = new MarcoRB021();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoRB021 extends JFrame{
    public MarcoRB021(){
        setVisible(true);
        setBounds(450,200,500,300);
        
        LaminaRB021 miLamina = new LaminaRB021();
        add(miLamina);
    }
}

class LaminaRB021 extends JPanel{
    public LaminaRB021(){
        setLayout(new BorderLayout());
        grupo = new ButtonGroup();
        laminaBotones = new JPanel();
        texto = new JLabel("Este es un segundo mensaje de prueba");
        texto.setFont(new Font("Serif", Font.PLAIN, 10));
        add(texto, BorderLayout.CENTER);
        
        CreandoBotones("Pequeño", true, 10);
        CreandoBotones("Mediano", false, 20);
        CreandoBotones("Grande", false, 30);
        CreandoBotones("Muy Grande", false, 40);
        
        add(laminaBotones, BorderLayout.SOUTH);
    }
    
    public void CreandoBotones(String nombre, boolean estado, final int tamanio){
        JRadioButton boton = new JRadioButton(nombre, estado);
        grupo.add(boton);
        laminaBotones.add(boton);
        
        ActionListener evento = new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                texto.setFont(new Font("Serif", Font.PLAIN, tamanio));
            }
        };
        
        boton.addActionListener(evento);
    }
    
    private ButtonGroup grupo;
    private JPanel laminaBotones;
    private JLabel texto;
}