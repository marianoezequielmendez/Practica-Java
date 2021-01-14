package graficos;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.beans.*;

public class EventosMultiples 
{
    public static void main(String[] args) 
    {
        MarcoEventosMultiples miMarco = new MarcoEventosMultiples();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}

class MarcoEventosMultiples extends JFrame
{
    public MarcoEventosMultiples()
    {
        setVisible(true);
        setBounds(200, 300, 500, 300);
        LaminaEventosMultiples miLamina = new LaminaEventosMultiples();
        add(miLamina);    
    }
}

class LaminaEventosMultiples extends JPanel
{
    public LaminaEventosMultiples()
    {
//        ImageIcon iconoVario = new ImageIcon("src/grficos/icono.png");
//        Image imagenIcono = iconoVario.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
//        Icon IconoFinal = new ImageIcon(imagenIcono);
        
        AccionColor accionAmarillo = new AccionColor("Amarillo", /*iconoVario,*/ Color.yellow);
        AccionColor accionRojo = new AccionColor("Rojo",/* iconoVario,*/ Color.red);
        AccionColor accionAzul = new AccionColor("Azul",/*iconoVario,*/Color.blue);
  
        add(new JButton(accionAmarillo));
        add(new JButton(accionRojo));
        add(new JButton(accionAzul));
        
//        JButton botonAmarillo = new JButton(accionAmarillo);
//        JButton botonRojo = new JButton(accionRojo);
//        JButton botonAzul = new JButton(accionAzul);
        /*
        JButton botonAmarillo = new JButton("Amarillo");
        JButton botonRojo = new JButton("Rojo");
        JButton botonAzul = new JButton("Azul");
        */
//        add(botonAmarillo);
//        add(botonRojo);
//        add(botonAzul);

        //Primer paso para agregar teclado rapido (Clase 79)
        InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW); 
        
        //Segundo paso agregar las teclas.
        KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl A"); 
        KeyStroke teclaRojo = KeyStroke.getKeyStroke("ctrl R");
        KeyStroke teclaAzul = KeyStroke.getKeyStroke("ctrl B");
        
        //Tercer paso, asiganar la combinacion de teclas del segundo paso a un objeto (clase 79)
        mapaEntrada.put(teclaAmarillo, "fondoAmarillo"); 
        mapaEntrada.put(teclaRojo, "fondoRojo");
        mapaEntrada.put(teclaAzul, "fondoAzul");
        
        //Cuarto paso, Asignar el objeto del tercer paso a la accion que se desea realizar.
        ActionMap mapaAccion = getActionMap();
        mapaAccion.put("fondoAmarillo", accionAmarillo); //(Objeto creado en el tercer paso, Objeto creado con la instancia de AccionColor)
        mapaAccion.put("fondoRojo", accionRojo); 
        mapaAccion.put("fondoAzul", accionAzul); 
    }
    
    private class AccionColor extends AbstractAction
    {
        public AccionColor(String nombre, /*Icon icono,*/ Color colorBoton)
        {
            putValue(Action.NAME, nombre);
//        putValue(Action.SMALL_ICON, icono);
            putValue(Action.SHORT_DESCRIPTION, "Cambia el color de la lamina en " + nombre);
            putValue("colorDeFondo", colorBoton); //La Clave "colorDeFondo" la creamos nosotros.
        }
        
        public void actionPerformed(ActionEvent ae)
        {
            Color c = (Color)getValue("colorDeFondo");
            setBackground(c);
        }
    }
}

/*
class EventosMultiplesSub implements Action
{
    public Object getValue(String string) 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public void putValue(String string, Object o){}
    public void setEnabled(boolean bln){}
    public boolean isEnabled()
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    public void addPropertyChangeListener(PropertyChangeListener pl){}
    public void removePropertyChangeListener(PropertyChangeListener pl){}
    public void actionPerformed(ActionEvent ae){}
}
*/

