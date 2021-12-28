package dominio;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Balones extends JFrame {

    public Balones(){
        super("Ultimate Builder - Balones");
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = miPantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        Image miIcono = miPantalla.getImage("icono.jpg");
        JPanel panel = new JPanel();
        setIconImage(miIcono);
        String datos = "";


        try{
            Class.forName("org.sqlite.JDBC");
            String base = "jdbc:sqlite:UltimateBuilder.db";
            Connection conexion = DriverManager.getConnection(base,"usuario", "pass");
            Statement myStatement = conexion.createStatement();
            ResultSet result = myStatement.executeQuery("SELECT color, patrocinador FROM Balones");
            String color;
            String patrocinador;
            while(result.next()) {
                color = result.getString("color");
                patrocinador = result.getString("patrocinador");
                datos += "Patrocinador: " + patrocinador + " Color: " + color + "\n";
            }

        }catch(ClassNotFoundException e){
            System.out.println("Error " + e);
        }catch (SQLException ex){
            System.out.println("Error " + ex);
        }
        JTextArea texto = new JTextArea(datos);
        panel.add(texto);
        this.setBounds(384,216, 768, 432);
        add(panel);
        setVisible(true);
    }
}
