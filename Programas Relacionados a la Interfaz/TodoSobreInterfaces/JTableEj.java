package TodoSobreInterfaces;

import javax.swing.*;
import java.awt.*;

public class JTableEj {

    public static JFrame crearVentana() {
        // Creamos una nueva ventana (JFrame)
        JFrame ventana = new JFrame("JTable - Tabla de ejemplo");
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();

        // Le damos un tamaño a la ventana
        ventana.setSize(600, 400);

        // Indicamos que al cerrar la ventana se termine la app
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Centramos la ventana en la pantalla
        ventana.setLocationRelativeTo(null);

        // Usamos BorderLayout para distribuir los componentes
        ventana.setLayout(new GridLayout(2,2));

        // Creamos una etiqueta para mostrar qué componente es
        JLabel label = new JLabel("JTable1", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 16));
        JLabel label2 = new JLabel("JTable2", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 16));
        JLabel label3 = new JLabel("JTable3", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 16));
        // Definimos los nombres de las columnas de la tabla
        String[] nombresColumnas = {"ISBN", "Titulo", "Autor","Editorial"};

        // Definimos los datos que van a aparecer en cada fila
        Object[][] datosTabla = {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        };

        // Creamos la tabla con los datos y los encabezados
        JTable miTabla = new JTable(datosTabla, nombresColumnas);

        // Le agregamos scroll para que se vea bien si hay muchos datos
        JScrollPane panelDesplazable = new JScrollPane(miTabla);
        
        // Agregamos la etiqueta arriba
        //ventana.add(label, BorderLayout.NORTH);
        //ventana.add(label2, BorderLayout.NORTH);
        //ventana.add(label3, BorderLayout.NORTH);
        
        JButton iniciaSesion = new JButton("Iniciar Sesion");
        JLabel bro = new JLabel("Un jlable masivo");
        JTextField inp2 = new JTextField(5);
        // Agregamos el scroll con la tabla en el centro
        //ventana.add(panelDesplazable, BorderLayout.CENTER);
        panel1.add(panelDesplazable, BorderLayout.CENTER);
        panel2.add(iniciaSesion);
        panel3.add(bro);
        panel4.add(inp2);
        
        ventana.add(panel1);
        ventana.add(panel2);
        ventana.add(panel3);
        ventana.add(panel4);

        // Devolvemos la ventana ya armada
        return ventana;
    }
}
