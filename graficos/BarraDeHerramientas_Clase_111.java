package graficos;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class BarraDeHerramientas_Clase_111 {
 
    public static void main(String[] args) {
        MarcoClase111 miMarco = new MarcoClase111();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoClase111 extends JFrame{
    public MarcoClase111(){
        setBounds(500,200,500,300);
        setTitle("Marco con barras");
        
        miLamina = new LaminaClase111();
        add(miLamina);
        
        Action accionAzul = new AccionColor("Azul", Color.BLUE);
        Action accionAmarillo = new AccionColor("Amarillo", Color.YELLOW);
        Action accionRojo = new AccionColor("Rojo", Color.RED);
        Action accionSalir = new AbstractAction("Salir") {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        };
        
        JMenu menu = new JMenu("Color");
        menu.add(accionAzul);
        menu.add(accionAmarillo);
        menu.add(accionRojo);
        
        JMenuBar barraMenu = new JMenuBar();
        barraMenu.add(menu);
        
        setJMenuBar(barraMenu);
        
        JToolBar barra = new JToolBar();
        barra.add(accionAzul);
        barra.add(accionAmarillo);
        barra.add(accionRojo);
        
        barra.addSeparator();
        
        barra.add(accionSalir);
        
        add(barra, BorderLayout.NORTH);
        
        setVisible(true);
    }
    
    private class AccionColor extends AbstractAction{
        public AccionColor(String nombre, Color c){
            putValue(Action.NAME, nombre);
            putValue(Action.SHORT_DESCRIPTION, "Color de fondo..." + nombre);
            putValue("Color", c);
        }
        
        public void actionPerformed(ActionEvent ae) {
            Color c=(Color) getValue("Color");
            miLamina.setBackground(c);
        }
    }
    
    LaminaClase111 miLamina;
}

class LaminaClase111 extends JPanel{
    public LaminaClase111(){
        
    }
}