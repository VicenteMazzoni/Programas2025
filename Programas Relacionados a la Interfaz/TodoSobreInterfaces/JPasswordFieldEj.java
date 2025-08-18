package TodoSobreInterfaces;

import javax.swing.*;

public class JPasswordFieldEj {

    public static JFrame crearVentana() {
        JFrame ventana = new JFrame("JPasswordField - Campo de contraseña");
        ventana.setSize(300, 150);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("JPasswordField");
        JPasswordField passwordField = new JPasswordField(15);

        panel.add(label);
        panel.add(passwordField);

        ventana.add(panel);
        return ventana;
    }
}
