package graficos;
//import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VentanasEmergentes_Clase_121 {
    public static void main(String[] args) {
        MarcoVentanaEmergentes01 miMarco = new MarcoVentanaEmergentes01();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoVentanaEmergentes01 extends JFrame{
    public MarcoVentanaEmergentes01(){
        setBounds(500,300,400,250);
        
        LaminaCuadrosDialogos miLamina = new LaminaCuadrosDialogos();
        add(miLamina);
        
        setVisible(true);
    }
}

class LaminaCuadrosDialogos extends JPanel{
    public LaminaCuadrosDialogos(){
        boton01 = new JButton("Boton 01");
        boton02 = new JButton("Boton 02");
        boton03 = new JButton("Boton 03");
        boton04 = new JButton("Boton 04");
        
        boton01.addActionListener(new AccionBotones());
        boton02.addActionListener(new AccionBotones());
        boton03.addActionListener(new AccionBotones());
        boton04.addActionListener(new AccionBotones());

       add(boton01);
       add(boton02);
       add(boton03);
       add(boton04);
    }
    
    private class AccionBotones implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == boton01){
//                System.out.println("Presionaste el boton 01");
//                  JOptionPane.showMessageDialog(LaminaCuadrosDialogos.this, "Presionaste el boton 01"); //Entre parentesis, la clase padre (Clase 121)
                  JOptionPane.showMessageDialog(LaminaCuadrosDialogos.this, "Presionaste el boton 01", "Advertencia", 0); //El numero final (Ej: 0) cambia el icono que aparece.
            }
            else if(e.getSource() == boton02){
//                System.out.println("Presionaste el boton 02");
                  JOptionPane.showInputDialog("Introduce nombre");
            }
            else if(e.getSource() == boton03){
//                System.out.println("Presionaste el boton 03");
                  JOptionPane.showConfirmDialog(LaminaCuadrosDialogos.this, "Elige opción", "V Confirmar", 1);
            }
            else if(e.getSource() == boton04){
//                System.out.println("Presionaste el boton 04");
                  JOptionPane.showOptionDialog(LaminaCuadrosDialogos.this, "Objeto = String", TOOL_TIP_TEXT_KEY, 1, WIDTH, null, null, null);
            }
        }
    }
    
    JButton boton01;
    JButton boton02;
    JButton boton03;
    JButton boton04;
}
