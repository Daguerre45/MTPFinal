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
    JButton miClub;
    JButton actualizaciones;
    JButton noticias;

    public Menu(){
        super("Ultimate Builder - Menu");
        //Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Image miIcono = miPantalla.getImage("icono.jpg");
        setIconImage(miIcono);
        Lamina lamina = new Lamina();
        setBounds(anchoPantalla/4,alturaPantalla/4, anchoPantalla/(2), alturaPantalla/(2));
        players = new JButton("Jugadores");
        players.addActionListener(new Funcionalidad());
        players.setBounds(0, 0, this.getWidth()/3, this.getHeight()/10);
        plantillas = new JButton("Plantillas");
        plantillas.addActionListener(new Funcionalidad());
        plantillas.setBounds(250, 0, this.getWidth()/3, this.getHeight()/10);
        miClub = new JButton("Mi Club");
        miClub.addActionListener(new Funcionalidad());
        miClub.setBounds(500,0, this.getWidth()/3, this.getHeight()/10);
        noticias = new JButton();
        noticias.addActionListener(new Funcionalidad());
        noticias.setBounds(this.getWidth()-688, 110, 200, 200);
        noticias.setIcon(imageN);
        noticias.setToolTipText("Noticias");
        actualizaciones = new JButton();
        actualizaciones.addActionListener(new Funcionalidad());
        actualizaciones.setBounds(this.getWidth()-280, 110, 200, 200);
        actualizaciones.setIcon(imageA);
        actualizaciones.setToolTipText("Próximas actualizaciones");
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

    private class Funcionalidad implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == players ){
                //TODO ventana de jugadores
                dispose();
            }else if (e.getSource() == plantillas ){
                Plantillas plantilla = new Plantillas();
                dispose();
            }else if (e.getSource() == miClub){
                //TODO ventana de miClub
                dispose();
            }else if (e.getSource() == noticias){
                Noticias noticia = new Noticias();
                dispose();
            }else if (e.getSource() == actualizaciones){
                //TODO ventana de noticias
                dispose();
            }
        }
    }
}
