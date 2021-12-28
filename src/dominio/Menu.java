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
    Image background = Toolkit.getDefaultToolkit().createImage("fondoMenu.jpg");
    Icon imageN = new ImageIcon("noticias.png");
    Icon imageA = new ImageIcon("actualizaciones.png");
    JButton players;
    JButton plantillas;
    JButton items;
    JButton actualizaciones;
    JButton noticias;

    public Menu(){
        super("Ultimate Builder - Menu");
        Image miIcono = miPantalla.getImage("icono.jpg");
        setIconImage(miIcono);
        Lamina lamina = new Lamina();
        setBounds(384,216, 768, 432);
        players = new JButton("Jugadores");
        players.addActionListener(new Funcionalidad());
        players.setBounds(0, 0, 256, 43);
        plantillas = new JButton("Plantillas");
        plantillas.addActionListener(new Funcionalidad());
        plantillas.setBounds(250, 0, 256, 43);
        items = new JButton("Items");
        items.addActionListener(new Funcionalidad());
        items.setBounds(500,0, 256, 43);
        noticias = new JButton();
        noticias.addActionListener(new Funcionalidad());
        noticias.setBounds(80, 110, 200, 200);
        noticias.setIcon(imageN);
        noticias.setToolTipText("Noticias");
        actualizaciones = new JButton();
        actualizaciones.addActionListener(new Funcionalidad());
        actualizaciones.setBounds(488, 110, 200, 200);
        actualizaciones.setIcon(imageA);
        actualizaciones.setToolTipText("Próximas actualizaciones");
        lamina.add(players);
        lamina.add(plantillas);
        lamina.add(items);
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
            repaint();
        }
    }

    public void abrirEnlace(String url){
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        }
        catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }
    private class Funcionalidad implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == players ){
                Jugadores jugadores = new Jugadores();
            }else if (e.getSource() == plantillas ){
                Plantillas plantilla = new Plantillas();
            }else if (e.getSource() == items){
                Items itemss = new Items();
            }else if (e.getSource() == noticias){
                Noticias noticia = new Noticias();
            }else if (e.getSource() == actualizaciones){
                abrirEnlace("https://ultimateteam.online/fifa-22/actualizacion/");

            }
        }
    }
}
