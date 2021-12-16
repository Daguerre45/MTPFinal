package dominio;

import javax.swing.*;
import java.sql.DriverManager;
import java.sql.*;
import java.awt.*;

public class Jugadores extends JFrame {
    JMenuBar menuBar;
    JMenu posicion;
    JMenu nacionalidad;
    Toolkit miPantalla = Toolkit.getDefaultToolkit();
    Dimension tamanoPantalla = miPantalla.getScreenSize();
    int alturaPantalla = tamanoPantalla.height;
    int anchoPantalla = tamanoPantalla.width;

    public Jugadores(){
        JPanel panel = new JPanel();
        ScrollPane scroll = new ScrollPane();
        menuBar = new JMenuBar();
        posicion = new JMenu();
        nacionalidad = new JMenu();
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
                //System.out.println("Nombre: " + nombre + " Posicion: " + posicion);
            }

        }catch(ClassNotFoundException e){
            System.out.println("Error " + e);
        }catch (SQLException ex){
            System.out.println("Error " + ex);
        }
        JTextArea texto = new JTextArea(datos);
        scroll.add(texto);
        this.setBounds(anchoPantalla/4,alturaPantalla/4, anchoPantalla/(2), alturaPantalla/(2));
        menuBar.add(posicion);
        menuBar.add(nacionalidad);
        menuBar.setVisible(true);
        add(scroll);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
