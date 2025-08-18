package TodoSobreInterfaces;

import javax.swing.*;

public class JOptionPaneEj {

    public static JFrame crearVentana() {
        JFrame ventana = new JFrame("JOptionPane - Mensaje");
        ventana.setSize(300, 150);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        // Mostramos un cuadro de diálogo al crear la ventana
        JOptionPane.showMessageDialog(ventana, "¡Hola! Este es un JOptionPane.",
                "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        return ventana;
    }
}
