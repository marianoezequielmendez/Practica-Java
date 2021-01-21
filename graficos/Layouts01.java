package graficos;
import javax.swing.*;
import java.awt.*;

public class Layouts01 
{
    public static void main(String[] args) 
    {
        MarcoLayout01 miMarco = new MarcoLayout01();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}

class MarcoLayout01 extends JFrame
{
    public MarcoLayout01()
    {
        setVisible(true);
        setBounds(100, 100, 500, 300);
        LaminaLayout01 miLamina = new LaminaLayout01();
        LaminaLayout01_2 miLamina2 = new LaminaLayout01_2();
        add(miLamina, BorderLayout.NORTH);
        add(miLamina2, BorderLayout.SOUTH);
    }
}

class LaminaLayout01 extends JPanel
{
    public LaminaLayout01()
    {
//        setLayout(new FlowLayout(FlowLayout.CENTER, 50, 100));
        setLayout(new FlowLayout(FlowLayout.CENTER)); //Los numeros representan la distancia entre los botones.
        add(new JButton("Amarillo"));
        add(new JButton("Rojo"));
    }
}

class LaminaLayout01_2 extends JPanel
{
    public LaminaLayout01_2()
    {
        setLayout(new BorderLayout(10, 10));
        add(new JButton("Azul"), BorderLayout.CENTER);
        add(new JButton("Verde"), BorderLayout.EAST);
        add(new JButton("Naranaja"), BorderLayout.WEST);
    }
}