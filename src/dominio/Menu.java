package dominio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Menu extends JFrame {
    Toolkit miPantalla = Toolkit.getDefaultToolkit();
    Dimension tamanoPantalla = miPantalla.getScreenSize();
    int alturaPantalla = tamanoPantalla.height;
    int anchoPantalla = tamanoPantalla.width;
    Image background = Toolkit.getDefaultToolkit().createImage("fondoMenu4.jpg");
    Icon imageN = new ImageIcon("noticias.png");
    Icon imageA = new ImageIcon("actualizaciones.png");

    //background.setSize(alturaPantalla/4, anchoPantalla/4);
    public Menu(){
        super("Ultimate Builder");
        //Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Image miIcono = miPantalla.getImage("icono.jpg");
        setIconImage(miIcono);

        setBounds(anchoPantalla/4,alturaPantalla/4, anchoPantalla/(2), alturaPantalla/(2));
        JButton players = new JButton("Jugadores");
        players.setBounds(0, 0, 250, 30);
        JButton plantillas = new JButton("Plantillas");
        plantillas.setBounds(250, 0, 250,30);
        JButton miClub = new JButton("Mi Club");
        miClub.setBounds(500,0, 255, 30);
        JButton noticias = new JButton();
        noticias.setBounds(80, 110, 200, 200);
        noticias.setIcon(imageN);
        noticias.setToolTipText("Noticias");
        JButton actualizaciones = new JButton();
        actualizaciones.setBounds(480, 110, 200, 200);
        actualizaciones.setIcon(imageA);
        actualizaciones.setToolTipText("Próximas actualizaciones");
        Lamina lamina = new Lamina();
        lamina.add(players);
        lamina.add(plantillas);
        lamina.add(miClub);
        lamina.add(noticias);
        lamina.add(actualizaciones);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(lamina);
        lamina.setLayout(null);
        setResizable(false);


    }
    private class Lamina extends JPanel{
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(background, 0, 0, null);
        }
    }

}
