package graficos;
import java.awt.*;
import javax.swing.*;

public class DisposicionAvanzada_Clase_115 {
    public static void main(String[] args) {
        MarcoDisposicionAvanzada miMarco = new MarcoDisposicionAvanzada();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoDisposicionAvanzada extends JFrame{
    public MarcoDisposicionAvanzada(){
        setBounds(400,100,250,200);
        setTitle("Dispocicion Avanzada Parte 1");
        //---------------------------------------
        //Clase 115
        JLabel rotulo01 = new JLabel("Nombre");
        JLabel rotulo02 = new JLabel("Email");
        
        JTextField texto01 = new JTextField(10);
        JTextField texto02 = new JTextField(10);
        
        texto01.setMaximumSize(texto01.getPreferredSize());
        texto02.setMaximumSize(texto02.getPreferredSize());
        
        Box cajaHorizontal01 = Box.createHorizontalBox();
        Box cajaHorizontal02 = Box.createHorizontalBox();
        
        cajaHorizontal01.add(rotulo01);
        cajaHorizontal02.add(rotulo02);
        cajaHorizontal01.add(Box.createHorizontalStrut(10));
        cajaHorizontal02.add(Box.createHorizontalStrut(10));
        cajaHorizontal01.add(texto01);
        cajaHorizontal02.add(texto02);
        
        JButton botonOK = new JButton("Ok");
        JButton botonCancelar = new JButton("Cancelar");
        
        Box cajaHorizontal03 = Box.createHorizontalBox();
        
        cajaHorizontal03.add(botonOK);
        cajaHorizontal03.add(Box.createGlue());
        cajaHorizontal03.add(botonCancelar);
        //Caja vertical
        Box cajaVertical01 = Box.createVerticalBox();
        cajaVertical01.add(cajaHorizontal01);
        cajaVertical01.add(cajaHorizontal02);
        cajaVertical01.add(cajaHorizontal03);
        
        add(cajaVertical01, BorderLayout.CENTER);
        //---------------------------------------
        setVisible(true);
    }
}