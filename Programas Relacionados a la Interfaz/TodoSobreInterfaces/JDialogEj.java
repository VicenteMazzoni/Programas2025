package TodoSobreInterfaces;

import javax.swing.*;

public class JDialogEj {
	
    public static JDialog crearVentana() {
        JDialog dialogo = new JDialog();
        dialogo.setTitle("JDialog");
        dialogo.setSize(300, 200);
        dialogo.setLocationRelativeTo(null);
        dialogo.add(new JLabel("Componente: JDialog", SwingConstants.CENTER));
        dialogo.setModal(false);
        return dialogo;
    }

}