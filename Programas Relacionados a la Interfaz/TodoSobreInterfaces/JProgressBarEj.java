package TodoSobreInterfaces;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class JProgressBarEj {

    public static JFrame crearVentana() {
        JFrame ventana = new JFrame("JProgressBar");
        ventana.setSize(300, 150);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        JProgressBar barraProgreso = new JProgressBar(0, 100);
        barraProgreso.setStringPainted(true);

        ventana.setLayout(new BorderLayout());
        ventana.add(new JLabel("Componente: JProgressBar", SwingConstants.CENTER), BorderLayout.NORTH);
        ventana.add(barraProgreso, BorderLayout.CENTER);

        // Simulación de progreso con Timer
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            int progreso = 0;

            @Override
            public void run() {
                barraProgreso.setValue(progreso);
                progreso += 5;
                if (progreso > 100) {
                    progreso = 0;
                }
            }
        }, 0, 200);

        return ventana;
    }
}
