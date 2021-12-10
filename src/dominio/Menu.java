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
    //background.setSize(alturaPantalla/4, anchoPantalla/4);
    public Menu(){
        super("Ultimate Builder");
        //Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Image miIcono = miPantalla.getImage("icono.jpg");
        setIconImage(miIcono);

        setBounds(anchoPantalla/4,alturaPantalla/4, anchoPantalla/(2), alturaPantalla/(2));
        JMenuBar barra = new JMenuBar();
        JButton players = new JButton("Jugadores");
        players.setBounds(0, 0, 250, 20);
        JButton plantillas = new JButton("Plantillas");
        plantillas.setBounds(250, 0, 250,20);
        JButton miClub = new JButton("Mi Club");
        miClub.setBounds(500,0, 255, 20);
        Lamina lamina = new Lamina();
        lamina.add(players);
        lamina.add(plantillas);
        lamina.add(miClub);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //lamina.add(barra);
        add(lamina/*, BorderLayout.NORTH*/);
        lamina.setLayout(null);
        //barra.setBounds(0, 0, 900, 20);
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
