package TodoSobreInterfaces;

import javax.swing.*;

public class JTabbedPaneEj {

    public static JFrame crearVentana() {
        JFrame ventana = new JFrame("JTabbedPane");
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        JTabbedPane pestañas = new JTabbedPane();
        pestañas.addTab("Pestaña 1", new JLabel("Componente: JTabbedPane - Pestaña 1"));
        pestañas.addTab("Pestaña 2", new JLabel("Componente: JTabbedPane - Pestaña 2"));

        ventana.add(pestañas);
        return ventana;
    }
}
