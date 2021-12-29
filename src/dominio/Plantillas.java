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
    Image miIcono = miPantalla.getImage("icono.jpg");
    Icon imageP1 = new ImageIcon("imageP1.png");
    Icon imageP2 = new ImageIcon("imageP2.png");
    Icon imageP3 = new ImageIcon("imageP3.png");
    Icon imageP4 = new ImageIcon("imageP4.png");
    Image plantilla11 = Toolkit.getDefaultToolkit().createImage("plantilla1.jpg");
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
                JFrame a = new JFrame();
                Panel1 panel1 = new Panel1();
                a.add(panel1);
                a.setTitle("Ultimate Builder - Plantilla 1");
                a.setBounds(90,20, 1348, 790);
                a.setIconImage(miIcono);
                a.setResizable(false);
                a.setVisible(true);

            }else if(e.getSource() == plantilla2){
                JFrame a = new JFrame();
                Panel2 panel2 = new Panel2();
                a.add(panel2);
                a.setTitle("Ultimate Builder - Plantilla 2");
                a.setBounds(90,20, 1348, 790);
                a.setIconImage(miIcono);
                a.setResizable(false);
                a.setVisible(true);

            }else if(e.getSource() == plantilla3){
                JFrame a = new JFrame();
                Panel3 panel3 = new Panel3();
                a.add(panel3);
                a.setTitle("Ultimate Builder - Plantilla 3");
                a.setBounds(90,20, 1348, 790);
                a.setIconImage(miIcono);
                a.setResizable(false);
                a.setVisible(true);

            }else if(e.getSource() == plantilla4){
                JFrame a = new JFrame();
                Panel4 panel4 = new Panel4();
                a.add(panel4);
                a.setTitle("Ultimate Builder - Plantilla 4");
                a.setBounds(90,20, 1348, 790);
                a.setIconImage(miIcono);
                a.setResizable(false);
                a.setVisible(true);
            }
        }
    }
    private class Panel1 extends JPanel{
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(plantilla11, 0, 0, null);
            repaint();
        }
    }

    private class Panel2 extends JPanel{
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(plantilla12, 0, 0, null);
            repaint();
        }
    }

    private class Panel3 extends JPanel{
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(plantilla13, 0, 0, null);
            repaint();
        }
    }

    private class Panel4 extends JPanel{
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(plantilla14, 0, 0, null);
            repaint();
        }
    }

}