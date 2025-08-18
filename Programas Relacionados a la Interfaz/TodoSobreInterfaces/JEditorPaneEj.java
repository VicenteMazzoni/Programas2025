package TodoSobreInterfaces;

import javax.swing.*;

public class JEditorPaneEj {

    public static JFrame crearVentana() {
        JFrame ventana = new JFrame("JEditorPane - Editor de contenido");
        ventana.setSize(400, 250);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("JEditorPane");

        JEditorPane editorPane = new JEditorPane();
        editorPane.setContentType("text/html");
        editorPane.setText("<html><h2>Editor HTML</h2><p>Esto es un <b>JEditorPane</b>.</p></html>");
        editorPane.setEditable(true); // importante, hasta a chat gpt se le olvido, literal

        JScrollPane scroll = new JScrollPane(editorPane);
        scroll.setPreferredSize(new java.awt.Dimension(350, 150));

        panel.add(label);
        panel.add(scroll);

        ventana.add(panel);
        return ventana;
    }
}
