package graficos;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CuadroDeTexto01 
{
    public static void main(String[] args) 
    {
        MarcoCDT miMarco = new MarcoCDT();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoCDT extends JFrame
{
    public MarcoCDT()
    {
        setTitle("Cuadro de texto");
        setVisible(true);
        setBounds(300, 200, 600, 350);
        
        LaminaCDT miLamina = new LaminaCDT();
        add(miLamina);
    }
} 

class LaminaCDT extends JPanel
{
    public LaminaCDT()
    {
        setLayout(new BorderLayout());
        JPanel miLamina02 = new JPanel();
        miLamina02.setLayout(new FlowLayout());
        
        JLabel campo01 = new JLabel("Email: ");
        miLamina02.add(campo01);
        
//        JTextField texto01 = new JTextField("           Hola mundo", 20); //Para probar el trim().
        texto01 = new JTextField(20);
        miLamina02.add(texto01);
        
        JButton boton01 = new JButton("Enviar");
        miLamina02.add(boton01);
        
        resultado = new JLabel("", JLabel.CENTER);
        add(resultado, BorderLayout.CENTER);
        
        DameTexto dTexto = new DameTexto();
        boton01.addActionListener(dTexto);
        
        add(miLamina02, BorderLayout.NORTH);

        //System.out.println(texto01.getText().trim()); 
        //getText obtiene la informacion introducida dentro del cuadro (El texto).
        //El Trim() quita los espacios en blanco en caso de tenerlos para la impresion en consola.
    }
        
    private class DameTexto implements ActionListener
    {
        public void actionPerformed(ActionEvent ae) 
        {
            int arroba = 0;
            String email = texto01.getText().trim();
            
            for(int i=0; i<email.length(); i++)
            {
                if(email.charAt(i) == '@')
                {
                    arroba++;
                }
            }
            
            if(arroba != 1)
            {
                resultado.setText("Incorecto");
            }
            else
            {
                resultado.setText("Correcto");
            } 
        }
    }
    
    private JTextField texto01;
    JLabel resultado;
}
