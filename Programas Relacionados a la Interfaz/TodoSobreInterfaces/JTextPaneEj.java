package TodoSobreInterfaces;

import javax.swing.*;
import javax.swing.text.*;

import java.awt.*;

public class JTextPaneEj {

    public static JFrame crearVentana() {
        JFrame ventana = new JFrame("JTextPane - Editor con estilo");
        ventana.setSize(400, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("JTextPane");

        JTextPane textPane = new JTextPane();
        StyledDocument doc = textPane.getStyledDocument();

        Style estilo = textPane.addStyle("Estilo", null);
        StyleConstants.setForeground(estilo, Color.BLUE);
        StyleConstants.setBold(estilo, true);

        try {
            doc.insertString(doc.getLength(), "Texto con estilo", estilo);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }

        JScrollPane scroll = new JScrollPane(textPane);
        scroll.setPreferredSize(new java.awt.Dimension(300, 100));

        panel.add(label);
        panel.add(scroll);

        ventana.add(panel);
        return ventana;
    }
}
