package dominio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Items extends JFrame {
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

    public Items(){
        super("Ultimate Builder - Ítems");
        Image miIcono = miPantalla.getImage("icono.jpg");
        setIconImage(miIcono);
        this.setBounds(384,216, 768, 432);
        Lamina lamina = new Lamina();
        balones = new JButton();
        balones.setIcon(balon);
        balones.setToolTipText("Balones");
        balones.addActionListener(new Funcionalidad());
        equipaciones = new JButton();
        equipaciones.setIcon(equipacion);
        equipaciones.setToolTipText("Equipaciones");
        equipaciones.addActionListener(new Funcionalidad());
        estadios = new JButton();
        estadios.setIcon(estadio);
        estadios.setToolTipText("Estadios");
        estadios.addActionListener(new Funcionalidad());
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
    private class Funcionalidad implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == balones) {
                Balones balones = new Balones();
            } else if (e.getSource() == equipaciones) {
                Equipaciones equipaciones = new Equipaciones();
            } else if (e.getSource() == estadios) {
                Estadios estadios = new Estadios();
            }
        }
    }
}
