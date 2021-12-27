package dominio.posiciones;

import javax.swing.*;
import java.sql.DriverManager;
import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JugadoresLM extends JFrame{
    JMenuBar menuBar;
    JMenu defensas;
    JMenu centrocampistas;
    JMenu delanteros;
    JButton buscar;
    JMenuItem GK;
    JMenuItem LB;
    JMenuItem RB;
    JMenuItem MCD;
    JMenuItem CAM;
    JMenuItem ST;
    JMenuItem CB;
    JMenuItem LM;
    JMenuItem MC;
    JMenuItem RM;
    JMenuItem MI;
    JMenuItem MD;
    JMenuItem CF;
    JMenuItem RW;
    JMenuItem LW;
    Toolkit miPantalla = Toolkit.getDefaultToolkit();
    Image background = Toolkit.getDefaultToolkit().createImage("fondoMenu.jpg");
    Dimension tamanoPantalla = miPantalla.getScreenSize();
    int alturaPantalla = tamanoPantalla.height;
    int anchoPantalla = tamanoPantalla.width;
    String datos = "";
   

    public JugadoresLM(){
        super("Ultimate Builder - JugadoresMD");
        Image miIcono = miPantalla.getImage("icono.jpg");
        ScrollPane lamina = new ScrollPane();
        buscar = new JButton("BUSCAR");
        //buscar.addActionListener(new Funcionalidad());
        menuBar = new JMenuBar();
        defensas = new JMenu("Defensas");
        centrocampistas = new JMenu("Centrocampistas");
        delanteros = new JMenu("Delanteros");
        GK = new JMenuItem("GK");
        GK.addActionListener(new Funcionalidad());
        LB = new JMenuItem("LB");
        LB.addActionListener(new Funcionalidad());
        RB = new JMenuItem("RB");
        RB.addActionListener(new Funcionalidad());
        MCD = new JMenuItem("CDM");
        MCD.addActionListener(new Funcionalidad());
        CAM = new JMenuItem("CAM");
        CAM.addActionListener(new Funcionalidad());
        ST = new JMenuItem("ST");
        ST.addActionListener(new Funcionalidad());
        CB = new JMenuItem("CB");
        CB.addActionListener(new Funcionalidad());
        LM = new JMenuItem("LM");
        LM.addActionListener(new Funcionalidad());
        MC = new JMenuItem("CM");
        MC.addActionListener(new Funcionalidad());
        RM = new JMenuItem("RM");
        RM.addActionListener(new Funcionalidad());
        MI = new JMenuItem("MI");
        MI.addActionListener(new Funcionalidad());
        MD = new JMenuItem("MD");
        MD.addActionListener(new Funcionalidad());
        CF = new JMenuItem("CF");
        CF.addActionListener(new Funcionalidad());
        RW = new JMenuItem("RW");
        RW.addActionListener(new Funcionalidad());
        LW = new JMenuItem("LW");
        LW.addActionListener(new Funcionalidad());
        defensas.add(GK);
        defensas.add(LB);
        defensas.add(RB);
        centrocampistas.add(MCD);
        centrocampistas.add(CAM);
        delanteros.add(ST);
        defensas.add(CB);
        centrocampistas.add(LM);
        centrocampistas.add(MC);
        centrocampistas.add(RM);
        centrocampistas.add(MI);
        centrocampistas.add(MD);
        delanteros.add(CF);
        delanteros.add(RW);
        delanteros.add(LW);
        setIconImage(miIcono);

        try{
            Class.forName("org.sqlite.JDBC");
            String base = "jdbc:sqlite:UltimateBuilder.db";
            Connection conexion = DriverManager.getConnection(base,"usuario", "pass");
            Statement myStatement = conexion.createStatement();
            ResultSet result = myStatement.executeQuery("SELECT nombre, posicion FROM Jugadores WHERE posicion = 'LM'");
            String nombre;
            String posicion;
            while(result.next()) {
                nombre = result.getString("nombre");
                posicion = result.getString("posicion");
                datos += "Nombre: " + nombre + " Posicion: " + posicion + "\n";
            }
        }catch(ClassNotFoundException e){
            System.out.println("Error " + e);
        }catch (SQLException ex){
            System.out.println("Error " + ex);
        }
        JTextArea texto = new JTextArea(datos);
        lamina.add(texto);
        this.setBounds(anchoPantalla/4,alturaPantalla/4, anchoPantalla/(2), alturaPantalla/(2));
        menuBar.add(defensas);
        menuBar.add(centrocampistas);
        menuBar.add(delanteros);
        menuBar.add(buscar);
        menuBar.setVisible(true);
        setJMenuBar(menuBar);
        add(lamina);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class Funcionalidad implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == GK){
                JugadoresGK gk = new JugadoresGK();
            }else if (e.getSource() == CAM){
                JugadoresCAM cam = new JugadoresCAM();
            }else if (e.getSource() == CB){
                JugadoresCB cb = new JugadoresCB();
            }else if (e.getSource() == CF){
                JugadoresCF cf = new JugadoresCF();
            }else if (e.getSource() == LB){
                JugadoresLB lb = new JugadoresLB();
            }else if (e.getSource() == LM){
                JugadoresLM lm = new JugadoresLM();
            }else if (e.getSource() == LW){
                JugadoresLW lw = new JugadoresLW();
            }else if (e.getSource() == MCD){
                JugadoresMCD mcd = new JugadoresMCD(); 
            }else if (e.getSource() == MD){
                JugadoresMD md = new JugadoresMD();
            }else if (e.getSource() == MI){
                JugadoresMI mi = new JugadoresMI();
            }else if (e.getSource() == RB){
                JugadoresRB rb = new JugadoresRB();
            }else if (e.getSource() == RM){
                JugadoresRM rr = new JugadoresRM();
            }else if (e.getSource() == RW){
                JugadoresRW rw = new JugadoresRW();
            }else if (e.getSource() == ST){
                JugadoresST st = new JugadoresST();
            }
        }
    }
    
}
