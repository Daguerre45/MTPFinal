package dominio;

import javax.swing.*;
import java.sql.DriverManager;
import java.sql.*;
import java.awt.*;

public class Jugadores extends JFrame {
    JMenuBar menuBar;
    JMenu posicion;
    JMenu nacionalidad;
    JMenu club;
    Toolkit miPantalla = Toolkit.getDefaultToolkit();
    Image background = Toolkit.getDefaultToolkit().createImage("fondoMenu.jpg");
    Dimension tamanoPantalla = miPantalla.getScreenSize();
    int alturaPantalla = tamanoPantalla.height;
    int anchoPantalla = tamanoPantalla.width;

    public Jugadores(){
        super("Ultimate Builder - Jugadores");
        Image miIcono = miPantalla.getImage("icono.jpg");
        ScrollPane lamina = new ScrollPane();
        menuBar = new JMenuBar();
        posicion = new JMenu("Posición");
        nacionalidad = new JMenu("Nacionalidad");
        club = new JMenu("Club");
        ButtonGroup grupo = new ButtonGroup();
        JRadioButtonMenuItem GK = new JRadioButtonMenuItem("GK");
        JRadioButtonMenuItem LB = new JRadioButtonMenuItem("LB");
        JRadioButtonMenuItem RB = new JRadioButtonMenuItem("RB");
        JRadioButtonMenuItem MCD = new JRadioButtonMenuItem("CDM");
        JRadioButtonMenuItem CAM = new JRadioButtonMenuItem("CAM");
        JRadioButtonMenuItem ST = new JRadioButtonMenuItem("ST");
        JRadioButtonMenuItem CB = new JRadioButtonMenuItem("CB");
        JRadioButtonMenuItem LM = new JRadioButtonMenuItem("LM");
        JRadioButtonMenuItem MC = new JRadioButtonMenuItem("CM");
        JRadioButtonMenuItem RM = new JRadioButtonMenuItem("RM");
        JRadioButtonMenuItem MI = new JRadioButtonMenuItem("MI");
        JRadioButtonMenuItem MD = new JRadioButtonMenuItem("MD");
        JRadioButtonMenuItem CF = new JRadioButtonMenuItem("CF");
        JRadioButtonMenuItem RW = new JRadioButtonMenuItem("RW");
        JRadioButtonMenuItem LW = new JRadioButtonMenuItem("LW");
        JRadioButtonMenuItem ALE = new JRadioButtonMenuItem("Alemania");
        JRadioButtonMenuItem ESP = new JRadioButtonMenuItem("ESPAÑA");
        JRadioButtonMenuItem EEUU = new JRadioButtonMenuItem("EEUU");
        JRadioButtonMenuItem BOS = new JRadioButtonMenuItem("Bosnia");
        JRadioButtonMenuItem HOL = new JRadioButtonMenuItem("Paises Bajos");
        JRadioButtonMenuItem ARG = new JRadioButtonMenuItem("Argentina");
        JRadioButtonMenuItem BEL = new JRadioButtonMenuItem("Belgica");
        JRadioButtonMenuItem BR = new JRadioButtonMenuItem("Brasil");
        JRadioButtonMenuItem URY = new JRadioButtonMenuItem("Uruguay");
        JRadioButtonMenuItem CRO = new JRadioButtonMenuItem("Croacia");
        JRadioButtonMenuItem RD = new JRadioButtonMenuItem("Republica Dominicana");
        JRadioButtonMenuItem CAN = new JRadioButtonMenuItem("Canada");
        JRadioButtonMenuItem AUST = new JRadioButtonMenuItem("Austria");
        JRadioButtonMenuItem SLO = new JRadioButtonMenuItem("Slovakia");
        JRadioButtonMenuItem ING = new JRadioButtonMenuItem("Inglaterra");
        JRadioButtonMenuItem NIG = new JRadioButtonMenuItem("Nigeria");
        JRadioButtonMenuItem POR = new JRadioButtonMenuItem("Portugal");  
        JRadioButtonMenuItem MONT = new JRadioButtonMenuItem("Montenegro");
        JRadioButtonMenuItem SUIZ = new JRadioButtonMenuItem("Suiza");
        JRadioButtonMenuItem NOR = new JRadioButtonMenuItem("Noruega");
        JRadioButtonMenuItem ITA = new JRadioButtonMenuItem("Italia");
        JRadioButtonMenuItem CA = new JRadioButtonMenuItem("Camerun");
        JRadioButtonMenuItem URC = new JRadioButtonMenuItem("Ucrania");
        JRadioButtonMenuItem SUE = new JRadioButtonMenuItem("Suecia");
        JRadioButtonMenuItem ALG = new JRadioButtonMenuItem("Algeria");
        JRadioButtonMenuItem SCT = new JRadioButtonMenuItem("Escocia");
        JRadioButtonMenuItem EGP = new JRadioButtonMenuItem("Egipto");
        JRadioButtonMenuItem GRE = new JRadioButtonMenuItem("Grecia");
        JRadioButtonMenuItem BAR = new JRadioButtonMenuItem("Barcelona A");
        JRadioButtonMenuItem RMD = new JRadioButtonMenuItem("Real Madrid");
        JRadioButtonMenuItem BAY = new JRadioButtonMenuItem("Bayern De Munich A");
        JRadioButtonMenuItem ATL = new JRadioButtonMenuItem("Atletico De Madrid");
        JRadioButtonMenuItem SEV = new JRadioButtonMenuItem("Sevilla A");
        JRadioButtonMenuItem BOR = new JRadioButtonMenuItem("Borusia Dortmund");
        JRadioButtonMenuItem PSG = new JRadioButtonMenuItem("Paris Saint Germain");
        JRadioButtonMenuItem INT = new JRadioButtonMenuItem("Inter de Milan");
        JRadioButtonMenuItem CHL = new JRadioButtonMenuItem("Chelsea");
        JRadioButtonMenuItem UTD = new JRadioButtonMenuItem("Manchester United");
        JRadioButtonMenuItem CIY = new JRadioButtonMenuItem("Mancester City");
        JRadioButtonMenuItem LIV = new JRadioButtonMenuItem("Liverpool");
        JRadioButtonMenuItem ARS = new JRadioButtonMenuItem("Arsenal");
        JRadioButtonMenuItem LEZ = new JRadioButtonMenuItem("Leipzig");
        posicion.add(GK);
        posicion.add(LB);
        posicion.add(RB);
        posicion.add(MCD);
        posicion.add(CAM);
        posicion.add(ST);
        posicion.add(CB);
        posicion.add(LM);
        posicion.add(MC);
        posicion.add(RM);
        posicion.add(MI);
        posicion.add(MD);
        posicion.add(CF);
        posicion.add(RW);
        posicion.add(LW);
        nacionalidad.add(ALE);
        nacionalidad.add(ESP);
        nacionalidad.add(EEUU);
        nacionalidad.add(BOS);
        nacionalidad.add(HOL);
        nacionalidad.add(ARG);
        nacionalidad.add(BEL);
        nacionalidad.add(BR);
        nacionalidad.add(URY);
        nacionalidad.add(CRO);
        nacionalidad.add(RD);
        nacionalidad.add(CAN);
        nacionalidad.add(AUST);
        nacionalidad.add(SLO);
        nacionalidad.add(ING);
        nacionalidad.add(NIG);
        nacionalidad.add(POR);
        nacionalidad.add(MONT);
        nacionalidad.add(SUIZ);
        nacionalidad.add(NOR);
        nacionalidad.add(ITA);
        nacionalidad.add(CA);
        nacionalidad.add(URC);
        nacionalidad.add(SUE);
        nacionalidad.add(ALG);
        nacionalidad.add(SCT);
        nacionalidad.add(EGP);
        nacionalidad.add(GRE);
        club.add(BAR);
        club.add(RMD);
        club.add(BAY);
        club.add(ATL);
        club.add(SEV);
        club.add(BOR);
        club.add(PSG);
        club.add(INT);
        club.add(CHL);
        club.add(UTD);
        club.add(CIY);
        club.add(LIV);
        club.add(ARS);
        club.add(LEZ);
        
        setIconImage(miIcono);
        String datos = "";

        try{
            Class.forName("org.sqlite.JDBC");
            String base = "jdbc:sqlite:UltimateBuilder.db";
            Connection conexion = DriverManager.getConnection(base,"usuario", "pass");
            Statement myStatement = conexion.createStatement();
            ResultSet result = myStatement.executeQuery("SELECT nombre, posicion FROM Jugadores");
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
        //JTextArea texto = new JTextArea(datos);
        //lamina.add(texto);
        this.setBounds(anchoPantalla/4,alturaPantalla/4, anchoPantalla/(2), alturaPantalla/(2));
        menuBar.add(posicion);
        menuBar.add(nacionalidad);
        menuBar.add(club);
        menuBar.setVisible(true);
        setJMenuBar(menuBar);
        add(lamina);
        setVisible(true);

    }
}
