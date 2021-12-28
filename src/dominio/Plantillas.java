package dominio;

import javax.swing.*;
import java.sql.DriverManager;
import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
    Icon plantilla11 = new ImageIcon("plantilla11.png");
    Image plantilla12 = Toolkit.getDefaultToolkit().createImage("plantilla2.jpg");
    Image plantilla13 = Toolkit.getDefaultToolkit().createImage("plantilla3.jpg");
    Image plantilla14 = Toolkit.getDefaultToolkit().createImage("plantilla4.jpg");

    public Plantillas(){

        super("Ultimate Builder - Plantillas");
        JPanel lamina = new JPanel();
        lamina.setLayout(new GridLayout(2, 2, 2, 2));
        plantilla1 = new JButton(imageP1);
        plantilla1.addActionListener(new Funcionalidad());
        plantilla1.setToolTipText("Plantilla 1");
        plantilla2 = new JButton(imageP2);
        plantilla2.addActionListener(new Funcionalidad());
        plantilla1.setToolTipText("Plantilla 2");
        plantilla3 = new JButton(imageP3);
        plantilla3.addActionListener(new Funcionalidad());
        plantilla1.setToolTipText("Plantilla 3");
        plantilla4 = new JButton(imageP4);
        plantilla4.addActionListener(new Funcionalidad());
        plantilla1.setToolTipText("Plantilla 4");
        Image miIcono = miPantalla.getImage("icono.jpg");
        this.setBounds(384,216, 768, 432);
        setIconImage(miIcono);
        lamina.add(plantilla1);
        lamina.add(plantilla2);
        lamina.add(plantilla3);
        lamina.add(plantilla4);
        this.add(lamina);
        setVisible(true);
        setResizable(false);
    }

    private class Funcionalidad implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == plantilla1){
                JButton a = new JButton(plantilla11);
            }else if(e.getSource() == plantilla2){
                JFrame a = new JFrame();
                setIconImage(plantilla12);
            }else if(e.getSource() == plantilla3){
                JFrame a = new JFrame();
                setIconImage(plantilla13);
            }else if(e.getSource() == plantilla3){
                JFrame a = new JFrame();
                setIconImage(plantilla14);
            }
        }
    }

}
