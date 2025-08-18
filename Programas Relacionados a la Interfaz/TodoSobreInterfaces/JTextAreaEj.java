package TodoSobreInterfaces;

import javax.swing.*;

public class JTextAreaEj {

    public static JFrame crearVentana() {
        JFrame ventana = new JFrame("JTextArea - Área de texto multilínea");
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("JTextArea");

        JTextArea textArea = new JTextArea(5, 20);
        textArea.setText("Texto de varias líneas...");
        JScrollPane scroll = new JScrollPane(textArea);

        panel.add(label);
        panel.add(scroll);

        ventana.add(panel);
        return ventana;
    }
}
