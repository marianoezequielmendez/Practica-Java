package graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButton02 {
    public static void main(String[] args) {
        MarcoRB2 miMarco = new MarcoRB2();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoRB2 extends JFrame{
    public MarcoRB2(){
        setVisible(true);
        setBounds(300,200,500,400);
        
        LaminaRB2 miLamina = new LaminaRB2();
        add(miLamina);
    }
}

class LaminaRB2 extends JPanel{
    public LaminaRB2(){
        setLayout(new BorderLayout());
        
        ButtonGroup miGrupo = new ButtonGroup();
        JPanel laminaRadio = new JPanel();
        EventoRadio eventoRadio = new EventoRadio();
        texto = new JLabel("Este es un mensaje de prueba");
        boton01 = new JRadioButton("Pequeño", true);
        boton02 = new JRadioButton("Mediano", false);
        boton03 = new JRadioButton("Grande", false);
        boton04 = new JRadioButton("Muy Grande", false);
        
        add(texto, BorderLayout.CENTER);
        boton01.addActionListener(eventoRadio);
        boton02.addActionListener(eventoRadio);
        boton03.addActionListener(eventoRadio);
        boton04.addActionListener(eventoRadio);
        miGrupo.add(boton01);
        miGrupo.add(boton02);
        miGrupo.add(boton03);
        miGrupo.add(boton04);
        laminaRadio.add(boton01);
        laminaRadio.add(boton02);
        laminaRadio.add(boton03);
        laminaRadio.add(boton04);
        add(laminaRadio, BorderLayout.SOUTH);
    }
    
    private class EventoRadio implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            if(ae.getSource() == boton01){
                texto.setFont(new Font("Serif", Font.PLAIN, 10));
            }
            else if (ae.getSource() == boton02){
                texto.setFont(new Font("Serif", Font.PLAIN, 20));
            }
            else if(ae.getSource() == boton03){
                texto.setFont(new Font("Serif", Font.PLAIN, 30));
            }
            else if(ae.getSource() == boton04){
                texto.setFont(new Font("Serif", Font.PLAIN, 40));
            }
        }
    }
    
    private JLabel texto;
    private JRadioButton boton01, boton02, boton03, boton04;
}