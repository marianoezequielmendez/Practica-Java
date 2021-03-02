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
        setBounds(450,200,700,400);
        
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
        Emergente(); 
//        BarraDeHerramientas();
        SimplificacionBarraDeHerramientas();
    }
    
    private void Emergente(){
        JPopupMenu emergente = new JPopupMenu();
        JMenuItem opcionNegrita = new JMenuItem("Negrita");
        JMenuItem opcionCursiva = new JMenuItem("Cursiva");
        
        emergente.add(opcionNegrita);
        emergente.add(opcionCursiva);
        
        area.setComponentPopupMenu(emergente);
        
        opcionNegrita.addActionListener(new StyledEditorKit.BoldAction());
        opcionCursiva.addActionListener(new StyledEditorKit.ItalicAction());
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
//        gestionMenu("10", "tamaño", "", 9, 10 );
//        gestionMenu("12", "tamaño", "", 9, 12 );
//        gestionMenu("14", "tamaño", "", 9, 14 );
//        gestionMenu("16", "tamaño", "", 9, 16 );
//        gestionMenu("18", "tamaño", "", 9, 18 );
//        gestionMenu("20", "tamaño", "", 9, 20 );
        
        ButtonGroup tamanioGrupo = new ButtonGroup();
        JRadioButtonMenuItem diez = new JRadioButtonMenuItem("10");
        tamanio.add(diez);
        diez.addActionListener(new StyledEditorKit.FontSizeAction("Cambiar_Tamaño", 10));
        JRadioButtonMenuItem doce = new JRadioButtonMenuItem("12");
        tamanio.add(doce);
        doce.addActionListener(new StyledEditorKit.FontSizeAction("Cambiar_Tamaño", 12));
        JRadioButtonMenuItem catorce = new JRadioButtonMenuItem("14");
        tamanio.add(catorce);
        catorce.addActionListener(new StyledEditorKit.FontSizeAction("Cambiar_Tamaño", 14));
        JRadioButtonMenuItem dieciseis = new JRadioButtonMenuItem("16");
        tamanio.add(dieciseis);
        dieciseis.addActionListener(new StyledEditorKit.FontSizeAction("Cambiar_Tamaño", 16));
        JRadioButtonMenuItem dieciocho = new JRadioButtonMenuItem("18");
        tamanio.add(dieciocho);
        dieciocho.addActionListener(new StyledEditorKit.FontSizeAction("Cambiar_Tamaño", 18));
        tamanioGrupo.add(diez);
        tamanioGrupo.add(doce);
        tamanioGrupo.add(catorce);
        tamanioGrupo.add(dieciseis);
        tamanioGrupo.add(dieciocho);
        
        //Atajos de teclado (Clase 110)
        //Tamaño letra
        diez.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0, InputEvent.CTRL_DOWN_MASK));
        doce.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, InputEvent.CTRL_DOWN_MASK));
        catorce.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4, InputEvent.CTRL_DOWN_MASK));
        dieciseis.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_6, InputEvent.CTRL_DOWN_MASK));
        dieciocho.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_8, InputEvent.CTRL_DOWN_MASK));
        
        //Estilos
        
        
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
                    elementoMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
                    elementoMenu.addActionListener(new StyledEditorKit.BoldAction());
               }
               else if (estilos == Font.ITALIC){
                    elementoMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
                    elementoMenu.addActionListener(new StyledEditorKit.ItalicAction());
               }
           }
           
           else if(menu == "tamaño"){
               tamanio.add(elementoMenu);
               elementoMenu.addActionListener(new StyledEditorKit.FontSizeAction("Cambiar_Tamaño", tamanioLetra));
           }
//           elementoMenu.addActionListener(new GestionMenu(rotulo, tipoLetra, estilos, tamanioLetra));
        }
    
    public void BarraDeHerramientas(){
//        JToolBar barra = new JToolBar();
        /*
        JButton negritaBarra = new JButton(new ImageIcon("src/graficos/Imagenes/negrita.png"));
        JButton cursivaBarra = new JButton(new ImageIcon("src/graficos/Imagenes/cursiva.png"));
        JButton botonAzulBarra = new JButton(new ImageIcon("src/graficos/Imagenes/bolaAzul.png"));
        JButton botonAmarilloBarra = new JButton(new ImageIcon("src/graficos/Imagenes/bolaAmarilla.png"));
        JButton botonRojoBarra = new JButton(new ImageIcon("src/graficos/Imagenes/bolaRoja.png"));
        
        negritaBarra.addActionListener(new StyledEditorKit.BoldAction());
        cursivaBarra.addActionListener(new StyledEditorKit.ItalicAction());
        botonAzulBarra.addActionListener(new StyledEditorKit.ForegroundAction("Azul", Color.BLUE));
        botonAmarilloBarra.addActionListener(new StyledEditorKit.ForegroundAction("Amarillo", Color.YELLOW));
        botonRojoBarra.addActionListener(new StyledEditorKit.ForegroundAction("Rojo", Color.RED));
        
        barra.add(negritaBarra);
        barra.add(cursivaBarra);
        barra.add(botonAzulBarra);
        barra.add(botonAmarilloBarra);
        barra.add(botonRojoBarra);
        */
        
//        barra.setOrientation(1);
//        add(barra, BorderLayout.SOUTH);
    }
    
    public void SimplificacionBarraDeHerramientas(){
        barra = new JToolBar();
        
        ConfiguraBarraSimplificada("src/graficos/Imagenes/negrita.png").addActionListener(new StyledEditorKit.BoldAction());
        ConfiguraBarraSimplificada("src/graficos/Imagenes/cursiva.png").addActionListener(new StyledEditorKit.ItalicAction());
        barra.addSeparator();
        ConfiguraBarraSimplificada("src/graficos/Imagenes/bolaAzul.png").addActionListener(new StyledEditorKit.ForegroundAction("Azul",Color.BLUE));
        ConfiguraBarraSimplificada("src/graficos/Imagenes/bolaAmarilla.png").addActionListener(new StyledEditorKit.ForegroundAction("Amarillo",Color.YELLOW));
        ConfiguraBarraSimplificada("src/graficos/Imagenes/bolaRoja.png").addActionListener(new StyledEditorKit.ForegroundAction("Rojo",Color.RED));
        
        add(barra, BorderLayout.SOUTH);
    }
    
    public JButton ConfiguraBarraSimplificada(String ruta){
        JButton boton = new JButton(new ImageIcon(ruta));
        barra.add(boton);
        return boton;
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
    
    //Clase 114, Simplificar Barra
    JButton negritaBarra, cursivaBarra, botonAzulBarra, botonAmarilloBarra, botonRojoBarra;
    JToolBar barra;
}
