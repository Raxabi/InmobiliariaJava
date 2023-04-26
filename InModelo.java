import javax.swing.JFrame;

public class InModelo {
    public static void main(String[] args) {
        InmobiliariaVista miVista = new InmobiliariaVista();
        // Crear el objeto Ventana (JFrame)
		JFrame ventana = new JFrame("Inmobiliaria");

        miVista.controlador();

	
		// Colocar sobre el panel contenedor la vista (es un JPanel)
		ventana.setContentPane(miVista);
		
		// A�adir el control de cierre de ventana, pack, ....
        ventana.pack();

        ventana.setSize(800,800);
        ventana.setResizable(true);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
