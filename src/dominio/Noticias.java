package dominio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Noticias extends JFrame {
    JPanel lamina = new JPanel();
    JButton noticia1 = new JButton();
    JButton noticia2 = new JButton();
    JButton noticia3 = new JButton();
    Icon youtube = new ImageIcon("youtube.png");
    Icon fut = new ImageIcon("fut.png");
    Icon competitivo = new ImageIcon("competitivo.png");
    Toolkit miPantalla = Toolkit.getDefaultToolkit();
    Dimension tamanoPantalla = miPantalla.getScreenSize();
    int alturaPantalla = tamanoPantalla.height;
    int anchoPantalla = tamanoPantalla.width;

    public Noticias(){
        super("Ultimate Builder - Noticias");
        Image miIcono = miPantalla.getImage("icono.jpg");
        setIconImage(miIcono);
        noticia1.setIcon(fut);
        noticia1.addActionListener(new Funcionalidad());
        noticia1.setToolTipText("Informacion relacionada con el modo de juego de Ultimate Team");
        noticia2.setIcon(competitivo);
        noticia2.addActionListener(new Funcionalidad());
        noticia2.setToolTipText("Toda la actualidad sobre el competitivo profesional de FUT");
        noticia3.setIcon(youtube);
        noticia3.addActionListener(new Funcionalidad());
        noticia3.setToolTipText("Canal de youtube con videos y tips sobre el juego");
        setVisible(true);
        lamina.setLayout(new GridLayout(3, 1, 2, 2));
        lamina.add(noticia1);
        lamina.add(noticia2);
        lamina.add(noticia3);
        add(lamina);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(anchoPantalla/4,alturaPantalla/4, anchoPantalla/(2), alturaPantalla/(2));

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

            if (e.getSource() == noticia1 ){
                abrirEnlace("https://www.ea.com/es-es/games/fifa/fifa-22/news");
            }else if (e.getSource() == noticia2 ){
                abrirEnlace("https://www.ea.com/es-es/games/fifa/compete/fgs-22");
            }else if (e.getSource() == noticia3){
                abrirEnlace("https://www.youtube.com/user/EAsportsfootball");
            }
        }
    }
}
