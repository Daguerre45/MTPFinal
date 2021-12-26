package dominio;

import javax.swing.*;
import java.awt.*;

public class Plantillas extends JFrame {
    JButton plantilla1;
    JButton plantilla2;
    JButton plantilla3;
    JButton plantilla4;
    Toolkit miPantalla = Toolkit.getDefaultToolkit();
    Dimension tamanoPantalla = miPantalla.getScreenSize();
    int alturaPantalla = tamanoPantalla.height;
    int anchoPantalla = tamanoPantalla.width;
    Icon imageP1 = new ImageIcon("imageP1.png");
    Icon imageP2 = new ImageIcon("imageP2.png");
    Icon imageP3 = new ImageIcon("imageP3.png");
    Icon imageP4 = new ImageIcon("imageP4.png");

    public Plantillas(){

        super("Ultimate Builder - Plantillas");

        JPanel lamina = new JPanel();
        lamina.setLayout(new GridLayout(2, 2, 2, 2));
        plantilla1 = new JButton(imageP1);
        plantilla1.setToolTipText("Plantilla 1");
        plantilla2 = new JButton(imageP2);
        plantilla1.setToolTipText("Plantilla 2");
        plantilla3 = new JButton(imageP3);
        plantilla1.setToolTipText("Plantilla 3");
        plantilla4 = new JButton(imageP4);
        plantilla1.setToolTipText("Plantilla 4");
        Image miIcono = miPantalla.getImage("icono.jpg");
        this.setBounds(anchoPantalla/4,alturaPantalla/4, anchoPantalla/(2), alturaPantalla/(2));
        setIconImage(miIcono);
        lamina.add(plantilla1);
        lamina.add(plantilla2);
        lamina.add(plantilla3);
        lamina.add(plantilla4);
        this.add(lamina);
        setVisible(true);
        setResizable(false);
    }

}
