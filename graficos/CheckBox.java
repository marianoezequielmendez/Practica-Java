package graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBox {
    public static void main(String[] args) {
        MarcoCB miMarco = new MarcoCB();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}

class MarcoCB extends JFrame{
    public MarcoCB(){
        setTitle("Check Box");
        setVisible(true);
        setBounds(300,200,500,400);
        
        LaminaCB miLamina = new LaminaCB();
        add(miLamina);
    }
}

class LaminaCB extends JPanel{
    public LaminaCB(){
        setLayout(new BorderLayout());
        
        Font miLetra = new Font("Serif", Font.PLAIN, 24);
        JPanel miLaminaTexto = new JPanel();
        JPanel miLaminaCB = new JPanel();
        texto = new JLabel("Este es un texto de prueba");
        checkBox01 = new JCheckBox("Negrita");
        checkBox02 = new JCheckBox("Cursiva");
        
        texto.setFont(miLetra);
        checkBox01.addActionListener(new ControlCheckBoxs());
        checkBox02.addActionListener(new ControlCheckBoxs());
        
        miLaminaTexto.add(texto);
        miLaminaCB.add(checkBox01);
        miLaminaCB.add(checkBox02);
        add(miLaminaTexto, BorderLayout.NORTH);
        add(miLaminaCB, BorderLayout.CENTER);
    }
    
    private class ControlCheckBoxs implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            int tipo = 0;
            if(checkBox01.isSelected()) tipo += Font.BOLD;  //Font.BOLD devuelve 1 (Clase 92)
            if(checkBox02.isSelected()) tipo += Font.ITALIC;  //Font.ITALIC devuelve 2 (Clase 92)
            
            texto.setFont(new Font("Serif", tipo, 24));
        }
    }
    
    private JLabel texto;
    private JCheckBox checkBox01, checkBox02;
}