package dominio;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Estadios extends JFrame {

    public Estadios(){
        super("Ultimate Builder - Estadios");
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = miPantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        Image miIcono = miPantalla.getImage("icono.jpg");
        setIconImage(miIcono);
        JPanel panel = new JPanel();
        this.setBounds(384,216, 768, 432);
        String datos = "";


        try{
            Class.forName("org.sqlite.JDBC");
            String base = "jdbc:sqlite:UltimateBuilder.db";
            Connection conexion = DriverManager.getConnection(base,"usuario", "pass");
            Statement myStatement = conexion.createStatement();
            ResultSet result = myStatement.executeQuery("SELECT nombre_estadio FROM Estadio");
            String nombre;
            while(result.next()) {
                nombre = result.getString("nombre_estadio");
                datos += "Nombre:  " + nombre + "\n";
            }

        }catch(ClassNotFoundException e){
            System.out.println("Error " + e);
        }catch (SQLException ex){
            System.out.println("Error " + ex);
        }
        JTextArea texto = new JTextArea(datos);
        panel.add(texto);
        add(panel);
        setVisible(true);
    }
}
