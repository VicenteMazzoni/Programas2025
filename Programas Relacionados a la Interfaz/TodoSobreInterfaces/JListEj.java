package TodoSobreInterfaces;

import javax.swing.*;
import java.awt.*;

public class JListEj {

    public static JFrame crearVentana() {
        JFrame ventana = new JFrame("JList - Lista de ejemplo");
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(new BorderLayout());

        JLabel label = new JLabel("JList", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 16));

        String[] elementos = {"Mate", "Café", "Agua", "Refresco", "Jugo"};

        JList<String> lista = new JList<>(elementos);
        JScrollPane scroll = new JScrollPane(lista);

        ventana.add(label, BorderLayout.NORTH);
        ventana.add(scroll, BorderLayout.CENTER);

        return ventana;
    }
}
