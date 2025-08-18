package TodoSobreInterfaces;

import javax.swing.*;

public class JDesktopPaneEj {

    public static JFrame crearVentana() {
        JFrame ventana = new JFrame("JDesktopPane");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        JDesktopPane escritorio = new JDesktopPane();

        JInternalFrame frameInterno = new JInternalFrame("Ventana Interna", true, true, true, true);
        frameInterno.setSize(200, 100);
        frameInterno.setVisible(true);
        frameInterno.add(new JLabel("Componente: JDesktopPane"));

        escritorio.add(frameInterno);
        ventana.add(escritorio);

        return ventana;
    }
}
