package graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AreaDeTexto02 
{
    public static void main(String[] args) 
    {
        MarcoADT02 miMarco = new MarcoADT02();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoADT02 extends JFrame
{
    public MarcoADT02()
    {
        setTitle("Area de texto");
        setVisible(true);
        setBounds(500, 200, 500, 300);
        setLayout(new BorderLayout());
        
        //Instancias
        laminaBotones = new JPanel();
        botonInsertar = new JButton("Insertar");
        botonSaltoLinea = new JButton("Agregar salto de línea");
        miArea = new JTextArea(8, 20);
        JScrollPane areaScroll = new JScrollPane(miArea);
        
        //Adds
        add(areaScroll, BorderLayout.CENTER);
        add(laminaBotones, BorderLayout.SOUTH);
        laminaBotones.add(botonInsertar);
        laminaBotones.add(botonSaltoLinea);
        
        //ActionListener
        botonInsertar.addActionListener(new ActionListener() //Crear la accion directamente sin crear otra clase.
        {
            public void actionPerformed(ActionEvent ae) 
            {
                miArea.append(" 'Mensaje insertado'. ");
            }
        });
        
        botonSaltoLinea.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                boolean saltar =! miArea.getLineWrap();
                miArea.setLineWrap(saltar);
                /*
                if(saltar)
                {
                    botonSaltoLinea.setText("Quitar salto de línea");
                }
                else 
                {
                    botonSaltoLinea.setText("Agregar salto de línea");
                } 
                */
                
                botonSaltoLinea.setText(saltar ? "Quitar salto de línea" : "Agregar salto de línea"); //Ternario: otra manera de consicional.
            }                        //(Condicion ?(if) Accion           :(else) Accion)             //Reemplaza al if de arriba.  
        });
    }
    
    private JPanel laminaBotones;
    private JButton botonInsertar, botonSaltoLinea;
    private JTextArea miArea;
}
