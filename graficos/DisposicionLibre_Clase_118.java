package graficos;
import java.awt.*;
import javax.swing.*;

public class DisposicionLibre_Clase_118 {
    public static void main(String[] args) {
        MarcoDisposicionLibre01 miMarco = new MarcoDisposicionLibre01();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoDisposicionLibre01 extends JFrame{
    public MarcoDisposicionLibre01(){
        setBounds(200,200,500,300);
        
        LaminaDisposicionLibre01 miLamina = new LaminaDisposicionLibre01();
        add(miLamina);
        
        setVisible(true);
    }
}

class LaminaDisposicionLibre01 extends JPanel{
    public LaminaDisposicionLibre01(){
//        setLayout(null);
        setLayout(new EnColumnas()); //Utiliza el LayoutManager propio (Clase 119) 
        
        JLabel nombre = new JLabel("Nombre: ");
        JLabel apellido = new JLabel("Apellido: ");
        JTextField cuadroNombre = new JTextField();
        JTextField cuadroApellido = new JTextField();
        
        /*
        nombre.setBounds(50, 50, 90, 25);
        apellido.setBounds(50, 85, 90, 25);
        cuadroNombre.setBounds(105, 54, 90, 18);
        cuadroApellido.setBounds(105, 89, 90, 18);
        */
        
        add(nombre);
        add(cuadroNombre);
        add(apellido);
        add(cuadroApellido);
    }
}

class EnColumnas implements LayoutManager{
    public void addLayoutComponent(String string, Component cmpnt){}
    public void removeLayoutComponent(Component cmpnt){}
    
    public Dimension preferredLayoutSize(Container cntnr){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public Dimension minimumLayoutSize(Container cntnr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void layoutContainer(Container miContenedor){
        int d = miContenedor.getWidth(); //getWidth da el tamaño del contenedor
        x = d/2;
        int contador = 0;
        int n = miContenedor.getComponentCount();
        
        for(int i=0 ; i<n ; i++){
            contador++;
            Component c = miContenedor.getComponent(i);
            c.setBounds(x - 80, y, 100, 20); //x-80 porque el contenedor se pone en el centro por getWidth (Clase 120)
            
            x +=60;
            if(contador%2==0){
                x= d/2;
                y+=40;
            }
        }
    }
    
    private int x;
    private int y = 20;
}