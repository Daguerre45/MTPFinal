package dominio;

import javax.swing.*;
import java.awt.*;

public class MiClub extends JFrame {
    Toolkit miPantalla = Toolkit.getDefaultToolkit();
    Dimension tamanoPantalla = miPantalla.getScreenSize();
    int alturaPantalla = tamanoPantalla.height;
    int anchoPantalla = tamanoPantalla.width;
    Image background = Toolkit.getDefaultToolkit().createImage("despacho.jpg");
    JButton balones;
    JButton equipaciones;
    JButton estadios;
    Icon balon = new ImageIcon("balon.png");
    Icon equipacion = new ImageIcon("equipacion.png");
    Icon estadio = new ImageIcon("estadio.png");

    public MiClub(){
        super("Ultimate Builder - Mi Club");
        Image miIcono = miPantalla.getImage("icono.jpg");
        setIconImage(miIcono);
        this.setBounds(anchoPantalla/4,alturaPantalla/4, anchoPantalla/(2), alturaPantalla/(2));
        Lamina lamina = new Lamina();
        balones = new JButton();
        balones.setIcon(balon);
        balones.setToolTipText("Balones");
        equipaciones = new JButton();
        equipaciones.setIcon(equipacion);
        equipaciones.setToolTipText("Equipaciones");
        estadios = new JButton();
        estadios.setIcon(estadio);
        estadios.setToolTipText("Estadios");
        balones.setBounds(68, 110, 160, 160);
        equipaciones.setBounds(298, 110, 160, 160);
        estadios.setBounds(528, 110, 160, 160);
        lamina.setLayout(null);
        lamina.add(balones);
        lamina.add(equipaciones);
        lamina.add(estadios);
        add(lamina);
        setResizable(false);
        setVisible(true);
    }

    private class Lamina extends JPanel{
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(background, 0, 0, null);
            repaint();
        }
    }
}
