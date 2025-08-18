package TodoSobreInterfaces;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderEj {

    public static JFrame crearVentana() {
        JFrame ventana = new JFrame("JSlider");
        ventana.setSize(300, 180);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        JSlider slider = new JSlider(0, 100, 50);
        JLabel etiqueta = new JLabel("Componente: JSlider - Valor: 50", SwingConstants.CENTER);

        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                etiqueta.setText("Componente: JSlider - Valor: " + slider.getValue());
            }
        });

        ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
        ventana.add(slider);
        ventana.add(etiqueta);

        return ventana;
    }
}
