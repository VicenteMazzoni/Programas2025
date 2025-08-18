package TodoSobreInterfaces;

import javax.swing.*;
import java.awt.*;

public class JToolBarEj {

    public static JFrame crearVentana() {
        JFrame ventana = new JFrame("JToolBar - Barra de herramientas");
        ventana.setSize(400, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        // Crear la barra de herramientas
        JToolBar barra = new JToolBar("Barra de herramientas");
        barra.setFloatable(true); // se puede arrastrar (floatar)

        // Crear botones con texto e íconos
        JButton btnNuevo = new JButton("Nuevo", UIManager.getIcon("FileView.fileIcon"));
        JButton btnGuardar = new JButton("Guardar", UIManager.getIcon("FileView.floppyDriveIcon"));
        JButton btnImprimir = new JButton("Imprimir", UIManager.getIcon("FileView.hardDriveIcon"));

        // Agregarlos a la barra
        barra.add(btnNuevo);
        barra.add(btnGuardar);
        barra.addSeparator(); // Separador visual
        barra.add(btnImprimir);

        // Etiqueta decorativa para que se entienda de qué se trata
        JLabel etiqueta = new JLabel("Componente: JToolBar", SwingConstants.CENTER);

        // Agregar la barra arriba y la etiqueta en el centro
        ventana.add(barra, BorderLayout.NORTH);
        ventana.add(etiqueta, BorderLayout.CENTER);

        return ventana;
    }
}
