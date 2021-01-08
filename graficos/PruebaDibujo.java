package graficos;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class PruebaDibujo 
{
    public static void main(String[] args) 
    {
        MarcoConDibujos miMarco = new MarcoConDibujos();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConDibujos extends JFrame //Para cuadro de texto
{
    public MarcoConDibujos()
    {
        setTitle("Prueba de dibujo");
        setSize(400, 400);
        LaminaConFiguras miLamina = new LaminaConFiguras();
        add(miLamina);
//        miLamina.setBackground(Color.pink); //Para pintar el fondo
        miLamina.setBackground(SystemColor.window); //Esta instruccion le da el color por defecto del sistema donde se este abriendo (Ej: Windows, IOS)
    }
}

class LaminaConFiguras extends JPanel //Para lamina dentro del cuadro de texto
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
//        g.drawRect(50, 50, 200, 200); //Método que dibuja un cuadrado (Dependiendo las medidas (Ubicacion x, y, Ancho, alto)
//        g.drawLine(50, 50, 300, 300); //Método que dibuja una linea
//        g.drawArc(50, 100, 100, 200, 120, 150);
        Graphics2D g2 = (Graphics2D)g; //Reconvertimos el tipo Graphics(g), en Graphics2D
       
        //Rectángulo
        Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150); //Se instancia con el .Double porque esa no es abstract y hereda de Rectangle que es Abstract
        g2.setColor(Color.BLACK);
        g2.draw(rectangulo); 
        g2.setColor(Color.RED);
        g2.fill(rectangulo);
//        g2.draw(rectangulo);
        
        //Elipse
        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo); //Toma como parametro el rectacngulo creado anteriormente, dentro del objeto rectangulo.
        g2.setColor(Color.BLUE); //setColor le da un color a graficos para pintar
        g2.setColor(new Color(150, 200, 40)); //con "new" llamo al contructor que lleva de parametro el RGB. con "new" puedo llamar a cualquier contructor.
        g2.setColor(new Color(150, 200, 40).brighter()); //Le da más brillo 
        g2.setColor(new Color(150, 200, 40).darker()); //Lo oscurece más
//        g2.draw(elipse); //Draw dibuja los contornos, las líneas
        g2.fill(elipse); //setFill rellena la figura
        g2.draw(new Line2D.Double(100, 100, 300, 250)); //Se intancia directamente dentro del parametor en vez de hacerlo por separado como lo de arriba.
        
        //Círculo
        double centroEnX = rectangulo.getCenterX(); //Da como resultado el centro del rectangulo en X
        double centroEnY = rectangulo.getCenterY(); //Da como resultado el centro del rectangulo en Y
        double radio = 150; //150 lo saco de la altura del rectangulo.
        Ellipse2D circulo = new Ellipse2D.Double();
        circulo.setFrameFromCenter(centroEnX, centroEnY, centroEnX+radio, centroEnY+radio);
        g2.draw(circulo);
    }
}