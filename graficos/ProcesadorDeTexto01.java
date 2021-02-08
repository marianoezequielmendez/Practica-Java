package graficos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;

public class ProcesadorDeTexto01 {
    public static void main(String[] args) {
        MarcoPDT01 miMarco = new MarcoPDT01();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoPDT01 extends JFrame
{
    public MarcoPDT01(){
        setBounds(450,200,500,300);
        
        LaminaPDT01 miLamina = new LaminaPDT01();
        add(miLamina);
        
        setVisible(true);
    }
}

class LaminaPDT01 extends JPanel{
    public LaminaPDT01(){
        setLayout(new BorderLayout());
        area = new JTextPane();
        add(area, BorderLayout.CENTER);
        Menu();     
    }
    
    private void Menu(){
        JMenuBar barraMenu = new JMenuBar();
        
        //Barra
        fuente = new JMenu("Fuentes");
        estilo = new JMenu("Estilo");
        tamanio = new JMenu("Tamaño");
        
        //Fuentes
//        JMenuItem arial = new JMenuItem("Arial");
//        JMenuItem courier = new JMenuItem("Courier");
//        JMenuItem serif = new JMenuItem("Serif");
        
        //Condicion
//        JMenuItem negrita = new JMenuItem("Negrita");
//        JMenuItem cursiva = new JMenuItem("Cursiva");
        
        //Tamaño
//        JMenuItem doce = new JMenuItem("12");
//        JMenuItem catorce = new JMenuItem("14");
//        JMenuItem dieciseis = new JMenuItem("16");
//        JMenuItem dieciocho = new JMenuItem("18");
//        JMenuItem veinte = new JMenuItem("20");
        
        //Add Barra
        barraMenu.add(fuente);
        barraMenu.add(estilo);
        barraMenu.add(tamanio);
        
        //Add Fuentes
//        fuente.add(arial);
//        fuente.add(courier);
//        fuente.add(serif);
        gestionMenu("Arial", "fuente", "Arial", 9, 12 );
        gestionMenu("Courier", "fuente", "Courier", 9, 12 );
        gestionMenu("Serif", "fuente", "Serif", 9, 12 );
        
        //Add Estilo
//        estilo.add(negrita);    
//        estilo.add(cursiva);
        gestionMenu("Negrita", "estilo", "", Font.BOLD, 12 );
        gestionMenu("Cursiva", "estilo", "", Font.ITALIC, 12 );
        
        //Add Tamaño
//        tamanio.add(doce);
//        tamanio.add(catorce);
//        tamanio.add(dieciseis);
//        tamanio.add(dieciocho);
//        tamanio.add(veinte);  
        gestionMenu("10", "tamaño", "", 9, 10 );
        gestionMenu("12", "tamaño", "", 9, 12 );
        gestionMenu("14", "tamaño", "", 9, 14 );
        gestionMenu("16", "tamaño", "", 9, 16 );
        gestionMenu("18", "tamaño", "", 9, 18 );
        gestionMenu("20", "tamaño", "", 9, 20 );
        
        add(barraMenu, BorderLayout.NORTH);
    }
    
    public void gestionMenu(String rotulo, String menu, String tipoLetra, int estilos, int tamanioLetra){
           JMenuItem elementoMenu = new JMenuItem(rotulo);
           if(menu == "fuente"){
               fuente.add(elementoMenu);
               if(tipoLetra == "Arial"){
                    elementoMenu.addActionListener(new StyledEditorKit.FontFamilyAction("Cambiar_Letra", "Arial"));
               }
               else if(tipoLetra == "Courier"){
                    elementoMenu.addActionListener(new StyledEditorKit.FontFamilyAction("Cambiar_Letra", "Courier"));
               }
               else if(tipoLetra == "Serif"){
                    elementoMenu.addActionListener(new StyledEditorKit.FontFamilyAction("Cambiar_Letra", "Serif"));
               }
           }
           
           else if(menu == "estilo"){
               estilo.add(elementoMenu);
               if(estilos == Font.BOLD){                   
                    elementoMenu.addActionListener(new StyledEditorKit.BoldAction());
               }
               else if (estilos == Font.ITALIC){
                    elementoMenu.addActionListener(new StyledEditorKit.ItalicAction());
               }
           }
           
           else if(menu == "tamaño"){
               tamanio.add(elementoMenu);
               elementoMenu.addActionListener(new StyledEditorKit.FontSizeAction("Cambiar_Tamaño", tamanioLetra));
           }
//           elementoMenu.addActionListener(new GestionMenu(rotulo, tipoLetra, estilos, tamanioLetra));
        }
    
//    private class GestionMenu implements ActionListener{
//        GestionMenu(String elemento, String fuenteString, int estiloInt, int tamanioInt){
//            tipoLetra = fuenteString;
//            estiloLetra = estiloInt;
//            tamanioLetra = tamanioInt;
//            menu = elemento;
//        }
//        
//        public void actionPerformed(ActionEvent ae) {
//            letras = area.getFont();
//            
//            if(menu == "Arial"  || menu == "Courier" || menu == "Serif"){
//                estiloLetra = letras.getStyle();
//                tamanioLetra = letras.getSize();
//            }
//            else if(menu == "Negrita"  || menu == "Cursiva"){
//                if(letras.getStyle() == 1 || letras.getStyle() == 2){
//                    estiloLetra = 3;
//                }
//                
//                tipoLetra = letras.getFontName();
//                tamanioLetra = letras.getSize();
//            }
//            else if (menu == "10" || menu == "12" || menu == "14" || menu == "16" || menu == "18" || menu == "20"){
//                tipoLetra = letras.getFontName();
//                estiloLetra = letras.getStyle();
//            }
//       
//            area.setFont(new Font(tipoLetra, estiloLetra, tamanioLetra));
//        }
//        
//        String tipoLetra, menu;
//        int estiloLetra, tamanioLetra;
//    }
//    
    JTextPane area;
    JMenu fuente, estilo, tamanio;
    Font letras;
//    boolean verificacionNegrita;
//    boolean verificacionCursiva;
}
