package ProyectoG4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VConfirmacion extends JFrame {

	private JPanel contentPane;
	private final JLabel lblEstasSeguro = new JLabel("Estas seguro?");
	private final JButton btnSi = new JButton("Si");
	private final JButton btnNo = new JButton("No");
	private final JButton btnCancelar = new JButton("Cancelar");
	private final JLabel lblLogo = new JLabel("");

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\eclipse-workspace\\Grupo4\\ProyectoG4\\imagenes\\Logo.png"));
		setTitle("Confirmacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color (156, 196, 236));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblEstasSeguro.setBounds(168, 63, 79, 14);
		
		contentPane.add(lblEstasSeguro);
		btnSi.setBounds(87, 117, 89, 23);
		
		contentPane.add(btnSi);
		btnNo.setBounds(223, 117, 89, 23);
		
		contentPane.add(btnNo);
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//la vetana de Bienvenida
				VBienvenida Bienvenida= new VBienvenida();
				Bienvenida.setVisible(true);
				
				dispose();
			}
		});
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCancelar.setBounds(335, 227, 89, 23);
		
		contentPane.add(btnCancelar);
		lblLogo.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo4\\ProyectoG4\\imagenes\\Logo.png"));
		lblLogo.setBounds(345, 0, 89, 94);
		
		contentPane.add(lblLogo);
	}

}
