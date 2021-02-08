package graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButton {
    public static void main(String[] args) {
        MarcoRB miMarco = new MarcoRB();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoRB extends JFrame{
    public MarcoRB(){
        setTitle("Radio Button");
        setVisible(true);
        setBounds(300,200,500,400);
        
        LaminaRB miLamina = new LaminaRB();
        add(miLamina);
    }
}

class LaminaRB extends JPanel{
    public LaminaRB(){
        ButtonGroup grupo01 = new ButtonGroup();
        ButtonGroup grupo02 = new ButtonGroup();
        
        JRadioButton boton01 = new JRadioButton("Azul", false);
        JRadioButton boton02 = new JRadioButton("Amarillo", true);
        JRadioButton boton03 = new JRadioButton("Rojo", false);
        JRadioButton boton04 = new JRadioButton("Verde", false);
        JRadioButton boton05 = new JRadioButton("Violeta", false);
        JRadioButton boton06 = new JRadioButton("Naranja", true);
        
        grupo01.add(boton01);
        grupo01.add(boton02);
        grupo01.add(boton03);
        
        grupo02.add(boton04);
        grupo02.add(boton05);
        grupo02.add(boton06);
        
        add(boton01);
        add(boton02);
        add(boton03);
        
        add(boton04);
        add(boton05);
        add(boton06);
    }
}