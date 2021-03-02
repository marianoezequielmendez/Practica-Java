package graficos;
import javax.swing.*;
import java.awt.*;

public class MenuEmergente01 {
    public static void main(String[] args) {
        MarcoMenuEmergente01 miMarco = new MarcoMenuEmergente01();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoMenuEmergente01 extends JFrame{
    public MarcoMenuEmergente01(){
        setBounds(300,200,500,300);
        
        LaminaMenuEmergente01 miLamina = new LaminaMenuEmergente01();
        add(miLamina);
        
        setVisible(true);
    }
}

class LaminaMenuEmergente01 extends JPanel{
    public LaminaMenuEmergente01(){
        setLayout(new BorderLayout());
        JPanel laminaMenu = new JPanel();
        JMenuBar miBarra = new JMenuBar();
        JMenu fuente = new JMenu("Fuente");
        JMenu estilo = new JMenu("Estilo");
        JMenu tamanio = new JMenu("Tamaño");
        
        miBarra.add(fuente);
        miBarra.add(estilo);
        miBarra.add(tamanio);
        laminaMenu.add(miBarra);
        add(laminaMenu, BorderLayout.NORTH);
        
        JTextPane miArea = new JTextPane();
        add(miArea, BorderLayout.CENTER);
        
        //-------------------------------------------------------------------------------------------------------------
        
        JPopupMenu emergente = new JPopupMenu();
        JMenuItem opcionUno = new JMenuItem("Opcion 1");
        JMenuItem opcionDos = new JMenuItem("Opcion 2");
        
        emergente.add(opcionUno);
        emergente.add(opcionDos);
        
        miArea.setComponentPopupMenu(emergente);
    }
}