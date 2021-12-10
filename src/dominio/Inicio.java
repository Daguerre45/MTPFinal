package dominio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inicio extends JFrame {

    public Inicio(){
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Image miIcono = miPantalla.getImage("icono.jpg");
        Icon imageX = new ImageIcon("imgX.png");
        JButton botonX = new JButton("", imageX) ;
        botonX.setToolTipText("Xbox");
        botonX.addActionListener(new OyenteX());
        Icon imagePC = new ImageIcon("imgPC.png");
        JButton botonPC = new JButton("", imagePC) ;
        botonPC.setToolTipText("Windows");
        Icon imagePS = new ImageIcon("imgPS.png");
        JButton botonPS = new JButton("", imagePS) ;
        botonPS.setToolTipText("Play Station");
        JPanel lamina = new JPanel();
        Dimension tamanoPantalla = miPantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setBounds(anchoPantalla/4,alturaPantalla/4, anchoPantalla/(2), alturaPantalla/(2));
        setTitle("Ultimate Builder");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        add(lamina);
        setIconImage(miIcono);
        lamina.setLayout(new GridLayout(1, 3, 5, 5));
        lamina.add(botonPC);
        lamina.add(botonPS);
        lamina.add(botonX);

        botonPS.setBackground(new Color(0, 0, 255));
        botonPC.setBackground(new Color(51,133,255));
        botonX.setBackground(new Color(0,255,0));
        lamina.setVisible(true);
    }

    private static class OyenteX implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

}