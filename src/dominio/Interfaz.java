package dominio;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.*;

public class Interfaz extends JFrame {
    JButton plataformaX;
    JButton plataformaP;
    JButton plataformaPC;
    JFrame prueba;
    //JPanel panelX = new JPanel();

    public Interfaz() {super("Plataforma");}

    public void iniciarComponentes(){
        iniciarBotones();
    }

    private void iniciarBotones(){
        setLayout(new GridLayout(1, 3, 5, 5));
        for(int i = 0; i < 3; i++){
            if(i == 0){
                add(new JButton("Xbox"));
            }
            if(i == 1){
                add(new JButton("PlayStation"));
            }

            if(i == 2){
                add(new JButton("PC"));
            }
        }
        setTitle("Plataforma");
        setSize(1650,1080);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    

}