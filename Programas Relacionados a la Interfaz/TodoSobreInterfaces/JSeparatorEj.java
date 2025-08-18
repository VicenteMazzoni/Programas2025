package TodoSobreInterfaces;

import javax.swing.*;
import java.awt.*;

public class JSeparatorEj {

    public static JFrame crearVentana() {
        JFrame ventana = new JFrame("JSeparator");
        ventana.setSize(300, 180);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel etiqueta1 = new JLabel("Arriba del separador");
        JLabel etiqueta2 = new JLabel("Abajo del separador");
        JSeparator separador = new JSeparator(SwingConstants.HORIZONTAL);

        panel.add(etiqueta1);
        panel.add(separador);
        panel.add(etiqueta2);

        ventana.add(panel);
        return ventana;
    }
}
