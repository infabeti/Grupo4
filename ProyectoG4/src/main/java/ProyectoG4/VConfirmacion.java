package ProyectoG4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.SwingConstants;


public class VConfirmacion extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private final JLabel lblEstasSeguro = new JLabel("\u00BFQuieres confirmar los cambios? ");
	private final JButton btnSi = new JButton("Si");
	private final JButton btnNo = new JButton("No");
	private final JLabel lblLogo = new JLabel("");
	private final JLabel lblNube = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VConfirmacion frame = new VConfirmacion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VConfirmacion() {
		initGUI();
	}
	
	
	
	private void initGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VConfirmacion.class.getResource("/iconos/cineCSS.png")));
		setTitle("Confirmacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color (156, 196, 236));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblEstasSeguro.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstasSeguro.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEstasSeguro.setBounds(97, 108, 243, 14);
		
		contentPane.add(lblEstasSeguro);
		
		btnSi.setBounds(87, 165, 89, 23);
		contentPane.add(btnSi);
		btnSi.addActionListener(this);
		
		btnNo.setBounds(251, 165, 89, 23);
		contentPane.add(btnNo);
		btnNo.addActionListener(this);
		
		lblLogo.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo4\\ProyectoG4\\imagenes\\Logo.png"));
		lblLogo.setBounds(345, 0, 89, 94);
		
		contentPane.add(lblLogo);
		
		JLabel lblLOGO = new JLabel("");
		lblLOGO.setIcon(new ImageIcon(VConfirmacion.class.getResource("/iconos/cineCSS.png")));
		lblLOGO.setBounds(10, 5, 90, 92);
		contentPane.add(lblLOGO);
		lblNube.setIcon(new ImageIcon(VConfirmacion.class.getResource("/iconos/nube.png")));
		lblNube.setBounds(72, -38, 362, 239);
		
		contentPane.add(lblNube);
		
		
	}
	
	//Ordenamos a los botones a enviarnos a otra ventana
	public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSi) {
            VFin vent = new VFin();
            vent.setVisible(true);
            vent.setResizable(false);
            this.setVisible(false);
        }
        if (e.getSource() == btnNo) {
        	VGeneros Ventana = new VGeneros();
            Ventana.setVisible(true);
            Ventana.setResizable(false);
            this.setVisible(false);
          
    }

}
}
