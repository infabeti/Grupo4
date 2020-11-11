package ProyectoG4;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class VFin extends JFrame {

	private JPanel contentPane;
	private final JLabel lblCarteleraActualizada = new JLabel("La cartelera se ha actualizado");
	private final JButton btnCancelar = new JButton("Volver");
	private final JLabel lblNube = new JLabel("");
	private final JLabel lblNewLabel = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VFin frame = new VFin();
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
	public VFin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\eclipse-workspace\\Grupo4\\ProyectoG4\\imagenes\\cineCSS.png"));
		setTitle("Fin");
		initGUI();
	}
	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color (156, 196, 236));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblCarteleraActualizada.setHorizontalAlignment(SwingConstants.CENTER);
		lblCarteleraActualizada.setFont(new Font("Freestyle Script", Font.PLAIN, 40));
		lblCarteleraActualizada.setBounds(35, 97, 364, 38);
		
		contentPane.add(lblCarteleraActualizada);
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// A la vetana de Bienvenida
				VBienvenida Bienvenida= new VBienvenida();
				Bienvenida.setVisible(true);
				dispose();
			}
		});
		btnCancelar.setBounds(335, 227, 89, 23);
		
		contentPane.add(btnCancelar);
		lblNube.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo4\\ProyectoG4\\imagenes\\nube.png"));
		lblNube.setBounds(0, 11, 414, 239);
		
		contentPane.add(lblNube);
		lblNewLabel.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo4\\ProyectoG4\\imagenes\\cineCSS.png"));
		lblNewLabel.setBounds(0, 0, 89, 84);
		
		contentPane.add(lblNewLabel);
	}

}
