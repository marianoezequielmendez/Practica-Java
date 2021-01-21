package graficos;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class EventoDeCuadro02 
{
   public static void main(String[] args) 
   {
       MarcoEDC02 miMarco = new MarcoEDC02();
       miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }    
}

class MarcoEDC02 extends JFrame
{
    public MarcoEDC02()
    {
        setVisible(true);
        setBounds(450, 200, 500, 300);
        
        LaminaEDC02 miLamina = new LaminaEDC02();
        add(miLamina);
    }
}

class LaminaEDC02 extends JPanel
{
    public LaminaEDC02()
    {
        setLayout(new BorderLayout());
        
        JPanel laminaSuperior = new JPanel();
        laminaSuperior.setLayout(new GridLayout(2,2));
        
        add(laminaSuperior, BorderLayout.NORTH);
        
        JLabel usuario = new JLabel("Usuario: ");
        JLabel contrasenia = new JLabel("Contraseña: ");
        JTextField campoUsuario = new JTextField(15);
        campoContrasenia = new JPasswordField(15); //JPasswordField permite que no se vea lo que se escribe.
        campoContrasenia.getDocument().addDocumentListener(new CompruebaPassword());
        
        laminaSuperior.add(usuario);
        laminaSuperior.add(campoUsuario);
        laminaSuperior.add(contrasenia);
        laminaSuperior.add(campoContrasenia);
        
        JButton botonEnviar = new JButton("Enviar");
        add(botonEnviar, BorderLayout.SOUTH);
    }
    
    private class CompruebaPassword implements DocumentListener
    {
        public void insertUpdate(DocumentEvent de) 
        {
            char[] contraseniaChar;
            contraseniaChar = campoContrasenia.getPassword();
            
            if(contraseniaChar.length < 8 || contraseniaChar.length > 12)
            {
                campoContrasenia.setBackground(Color.red);
            }
            else 
            {
                campoContrasenia.setBackground(Color.white);
            }
        }
        public void removeUpdate(DocumentEvent de)
        {
             char[] contraseniaChar;
            contraseniaChar = campoContrasenia.getPassword();
            
            if(contraseniaChar.length < 8 || contraseniaChar.length > 12)
            {
                campoContrasenia.setBackground(Color.red);
            }
            else 
            {
                campoContrasenia.setBackground(Color.white);
            }
        }
        public void changedUpdate(DocumentEvent de) 
        {}   
    }
    
    JPasswordField campoContrasenia;
}