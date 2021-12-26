package dominio;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Equipaciones extends JFrame {

    public Equipaciones(){
        super("Ultimate Builder - Equipaciones");
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
            ResultSet result = myStatement.executeQuery("SELECT color FROM Equipaciones");
            String color;
            while(result.next()) {
                color = result.getString("color");
                datos += "Color: " + color + "\n";
            }

        }catch(ClassNotFoundException e){
            System.out.println("Error " + e);
        }catch (SQLException ex){
            System.out.println("Error " + ex);
        }
        JTextArea texto = new JTextArea(datos);
        panel.add(texto);
        this.setBounds(anchoPantalla/4,alturaPantalla/4, anchoPantalla/(2), alturaPantalla/(2));
        add(panel);
        setVisible(true);
    }
}
