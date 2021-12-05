package aplicacion;
import java.awt.*;
import javax.swing.*;
import dominio.*;

public class Principal {

    public static void main(String[] args) {
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Image miIcono = miPantalla.getImage("imagenes/icono.jpg");
        Interfaz interfaz = new Interfaz();
        interfaz.setIconImage(miIcono);
    }
}
