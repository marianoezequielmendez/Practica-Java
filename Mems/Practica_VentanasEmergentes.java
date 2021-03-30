package Mems;
import java.awt.*;
import javax.swing.*;

public class Practica_VentanasEmergentes {
    public static void main(String[] args) {
        MarcoPracticaVE miMarco = new MarcoPracticaVE();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoPracticaVE extends JFrame{
    public MarcoPracticaVE(){
        setBounds(300,200,500,300);
        setLayout(new BorderLayout());
        
        LaminaPrincipal miLaminaPrincipal = new LaminaPrincipal();
        LaminaSecundaria miLaminaSecundaria = new LaminaSecundaria();
        add(miLaminaPrincipal, BorderLayout.CENTER);
        add(miLaminaSecundaria, BorderLayout.SOUTH);
        
        setVisible(true);
    }
}

class LaminaPrincipal extends JPanel{
    public LaminaPrincipal(){
        setLayout(new GridLayout());
    }
}

class LaminaSecundaria extends JPanel{
    public LaminaSecundaria(){
        JButton botonEnviar = new JButton("Enviar");
        
        add(botonEnviar);
    }
}