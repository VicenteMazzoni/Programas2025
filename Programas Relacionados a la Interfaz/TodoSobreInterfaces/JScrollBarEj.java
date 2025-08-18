package TodoSobreInterfaces;

import javax.swing.*;
import java.awt.*;

public class JScrollBarEj {

    public static JFrame crearVentana() {
        JFrame ventana = new JFrame("JScrollBar - Barra de desplazamiento");
        ventana.setSize(400, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        JLabel label = new JLabel("JScrollBar", SwingConstants.CENTER);
        JLabel valor = new JLabel("Valor: 0", SwingConstants.CENTER);

        JScrollBar scrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 10, 0, 100);
        scrollBar.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent e) {
                valor.setText("Valor: " + e.getValue());
            }
        });

        ventana.setLayout(new BorderLayout());
        ventana.add(label, BorderLayout.NORTH);
        ventana.add(scrollBar, BorderLayout.CENTER);
        ventana.add(valor, BorderLayout.SOUTH);

        return ventana;
    }
}
