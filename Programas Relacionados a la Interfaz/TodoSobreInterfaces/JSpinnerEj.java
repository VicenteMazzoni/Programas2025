package TodoSobreInterfaces;

import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSpinnerEj {

    public static JFrame crearVentana() {
        JFrame ventana = new JFrame("JSpinner");
        ventana.setSize(300, 180);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        SpinnerModel modelo = new SpinnerNumberModel(0, 0, 100, 1);
        JSpinner spinner = new JSpinner(modelo);
        JLabel etiqueta = new JLabel("Componente: JSpinner - Valor: 0", SwingConstants.CENTER);

        spinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                etiqueta.setText("Componente: JSpinner - Valor: " + spinner.getValue());
            }
        });

        ventana.setLayout(new FlowLayout());
        ventana.add(spinner);
        ventana.add(etiqueta);

        return ventana;
    }
}
