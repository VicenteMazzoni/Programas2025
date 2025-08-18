package TodoSobreInterfaces;

import javax.swing.*;

public class JSplitPaneEj {

    public static JFrame crearVentana() {
        JFrame ventana = new JFrame("JSplitPane");
        ventana.setSize(400, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        JLabel izquierda = new JLabel("Izquierda: JSplitPane");
        JLabel derecha = new JLabel("Derecha: JSplitPane");

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, izquierda, derecha);
        splitPane.setDividerLocation(200);

        ventana.add(splitPane);
        return ventana;
    }
}
