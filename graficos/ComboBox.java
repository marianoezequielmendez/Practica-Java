package graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBox {
    public static void main(String[] args) {
        MarcoComboBox miMarco = new MarcoComboBox();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoComboBox extends JFrame{
    public MarcoComboBox(){
        setVisible(true);
        setBounds(450,200,500,300);
        
        LaminaComboBox miLamina = new LaminaComboBox();
        add(miLamina);
    }
}

class LaminaComboBox extends JPanel{
    public LaminaComboBox(){
        setLayout(new BorderLayout());
        laminaCombo = new JPanel();
        miCombo = new JComboBox();
        texto = new JLabel("Este es un mensaje de prueba");
        texto.setFont(new Font("Serif", Font.PLAIN, 20));
        add(texto, BorderLayout.CENTER);
        EventoComboBox evento = new EventoComboBox();
        
        miCombo.setEditable(true); //El usuario puede escribir sobre los items a la lista.
        
        ItemsCombo("Serif");
        ItemsCombo("SansSerif");
        ItemsCombo("Monospaced");
        ItemsCombo("Dialog");
        miCombo.addActionListener(evento);
        
        laminaCombo.add(miCombo);
        add(laminaCombo, BorderLayout.NORTH);
    }
    
    public void ItemsCombo(String tipo){
        miCombo.addItem(tipo);
    }
    
    private class EventoComboBox implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            texto.setFont(new Font((String)miCombo.getSelectedItem(), Font.PLAIN, 20));
        }
    }
    
    private JLabel texto;
    private JComboBox miCombo;
    private JPanel laminaCombo;
}