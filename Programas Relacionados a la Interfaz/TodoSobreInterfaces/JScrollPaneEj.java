package TodoSobreInterfaces;

import javax.swing.*;

public class JScrollPaneEj {

    public static JFrame crearVentana() {
        JFrame ventana = new JFrame("JScrollPane");
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        JTextArea areaTexto = new JTextArea("Componente: JScrollPane\n(Área de texto con scroll"
        		+ "\\nBaja La idea es que esto se pueda mover en forma horizontal con una barrita", 5, 20);
        JScrollPane scrollPane = new JScrollPane(areaTexto);

        ventana.add(scrollPane);
        return ventana;
    }
}
