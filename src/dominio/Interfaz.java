package dominio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class Interfaz extends JFrame {
    //Icon imageX = new ImageIcon("/imagenes/imgX.png");
    JButton botonX = new JButton("XBOX"/*, imageX*/) ;
    //Icon imagePC = new ImageIcon("/imagenes/imgPC.jpg");
    JButton botonPC = new JButton("WINDOWS"/*, imagePC*/) ;
    //Icon imagePS = new ImageIcon("/imagenes/imgPS.png");
    JButton botonPS = new JButton("PLAY STATION"/*,imagePS*/) ;

    public Interfaz(){
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Image miIcono = miPantalla.getImage("imagenes/icono.jpg");
        setIconImage(miIcono);
        Dimension tamanoPantalla = miPantalla.getScreenSize(); //devuelve el tamaño de la pantalla. Si hay mas de un monitor, el del principal
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setBounds(anchoPantalla/4,alturaPantalla/4, anchoPantalla/2, alturaPantalla/2 );
        setTitle("Ultimate Builder");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setExtendedState(JFrame.MAXIMIZED_BOTH);

        JPanel lamina = new JPanel();
        lamina.setLayout(new GridLayout(1, 3, 5, 5));
        lamina.add(botonPC);
        lamina.add(botonPS);
        lamina.add(botonX);

        //botonPS.setIcon(imagePS);
        botonPS.setBackground(new java.awt.Color(0, 0, 255));
        //botonPC.setIcon(imagePC);
        botonPC.setBackground(new java.awt.Color(51,133,255));
        //botonX.setIcon(imagePC);
        botonX.setBackground(new java.awt.Color(0,255,0));
        lamina.setVisible(true);
        add(lamina);
    }
}
