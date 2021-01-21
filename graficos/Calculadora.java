package graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora 
{
    public static void main(String[] args) 
    {
        MarcoCalculadora miMarco = new MarcoCalculadora();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoCalculadora extends JFrame
{
    public MarcoCalculadora()
    {
        setTitle("Calculadora");
        setVisible(true);
//        setBounds(450, 150, 250, 200);
        setLocation(450, 150);
        
        LaminaSuperiorCalculadora laminaSuperior = new LaminaSuperiorCalculadora(); 
        add(laminaSuperior);
        pack(); //Con esto le decimos que el contenedor debe adaptarse al tamaño de lo que contiene en su interior. 
                //No hace falta el setBounds para la dimension, si para la ubicacion (setLocation).
    }
}

class LaminaSuperiorCalculadora extends JPanel
{
    public LaminaSuperiorCalculadora()
    {
        inicio = true;
        setLayout(new BorderLayout());
        pantalla = new JButton("0");
        pantalla.setEnabled(false); //Desabilita el boton.
        add(pantalla, BorderLayout.NORTH);
        
        LaminaCentralCalculadora laminaCentral = new LaminaCentralCalculadora();
        add(laminaCentral, BorderLayout.CENTER);
    }
    
    private class LaminaCentralCalculadora extends JPanel
    {
        public LaminaCentralCalculadora()
        {
            setLayout(new GridLayout(4,4));
            ActionListener insertarNumero = new FuncionNumeros();
            ActionListener signosMatematicos = new FuncionSignos();
        
            nuevoBoton("1", insertarNumero);
            nuevoBoton("2", insertarNumero);
            nuevoBoton("3", insertarNumero);
            nuevoBoton("+", signosMatematicos);
        
            nuevoBoton("4", insertarNumero);
            nuevoBoton("5", insertarNumero);
            nuevoBoton("6", insertarNumero);
            nuevoBoton("-", signosMatematicos);
        
            nuevoBoton("7", insertarNumero);
            nuevoBoton("8", insertarNumero);
            nuevoBoton("9", insertarNumero);
            nuevoBoton("*", signosMatematicos);
        
            nuevoBoton(".", insertarNumero);
            nuevoBoton("0", insertarNumero);
            nuevoBoton("=", signosMatematicos);
            nuevoBoton("/", signosMatematicos);
        }
    
        public void nuevoBoton(String numero, ActionListener oyente)
        {
            JButton boton = new JButton(numero);
            boton.addActionListener(oyente);
            add(boton);
        }
    
        private class FuncionNumeros implements ActionListener
        {
            public void actionPerformed(ActionEvent ae) 
            {
                String entrada = ae.getActionCommand();
                if(inicio)
                {
                    pantalla.setText("");
                    inicio = false;
                }
                pantalla.setText(pantalla.getText() + entrada);
            }
        }
       
        private class FuncionSignos implements ActionListener
        {
            public void actionPerformed(ActionEvent ae) 
            {
                String operacion = ae.getActionCommand();
                calcular(Double.parseDouble(pantalla.getText()));
                ultimaOperacion = operacion;
                inicio = true;
            }
            
            public void calcular(double x)
            {
                if (ultimaOperacion.equals("+")) //Método que compara los Strings
                {
                    resultado += x;
                }
                else if (ultimaOperacion.equals("-"))
                {
                    resultado -= x;
                }
                else if (ultimaOperacion.equals("*"))
                {
                    resultado *= x;
                }
                else if (ultimaOperacion.equals("/"))
                {
                    resultado /= x;
                }
                else if (ultimaOperacion.equals("="))
                {
                    resultado = x;
                }
                
                pantalla.setText("" + resultado); //Concatenando un String ya desaparace el error de tipos diferentes.
            }
        }
    }
    
    JButton pantalla;
    String entrada;
    private boolean inicio;
    private double resultado;
    private String ultimaOperacion = "=";
}