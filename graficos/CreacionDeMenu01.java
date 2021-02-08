package graficos;
import java.awt.*;
import javax.swing.*;

public class CreacionDeMenu01 {
    public static void main(String[] args) {
        MarcoCDM01 miMarco = new MarcoCDM01();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoCDM01 extends JFrame{
    public MarcoCDM01(){
        setBounds(450,200,500,300);
        
        LaminaCDM01 miLamina = new LaminaCDM01();
        add(miLamina);
        
        setVisible(true);
    }
}

class LaminaCDM01 extends JPanel{
    public LaminaCDM01(){
        setLayout(new BorderLayout());
        
        JMenuBar barraMenu = new JMenuBar();
        
        JMenu archivo = new JMenu("File");
        JMenu edicion = new JMenu("Edit");
        JMenu herramientas = new JMenu("Tools");
        JMenu ayuda = new JMenu("Help");
        JMenu sobreEnAyuda = new JMenu("About");
        
        JMenuItem guardarEnArchivo = new JMenuItem("Save");
        JMenuItem guardarComoEnArchivo = new JMenuItem("Save As");
        JMenuItem cortarEnEdicion = new JMenuItem("Cut");
        JMenuItem copiarEnEdicion = new JMenuItem("Copy");
        JMenuItem pegarEnEdicion = new JMenuItem("Paste");
        JMenuItem pluginsEnHerramientas = new JMenuItem("Plugins");
        JMenuItem masEnSobre = new JMenuItem("More...");
        
        //Barra
        barraMenu.add(archivo);
        barraMenu.add(edicion);
        barraMenu.add(herramientas);
        barraMenu.add(ayuda);
        
        //Archivo
        archivo.add(guardarEnArchivo);
        archivo.addSeparator(); //Marca una linea de separacion en el menu. Se usa para agrupar
        archivo.add(guardarComoEnArchivo);
        
        //Edicion
        edicion.add(cortarEnEdicion);
        edicion.add(copiarEnEdicion);
        edicion.add(pegarEnEdicion);
        
        //Herramientas
        herramientas.add(pluginsEnHerramientas);
        
        //Ayuda
        ayuda.add(sobreEnAyuda);
        sobreEnAyuda.add(masEnSobre);
        
        add(barraMenu, BorderLayout.NORTH);
    }
}