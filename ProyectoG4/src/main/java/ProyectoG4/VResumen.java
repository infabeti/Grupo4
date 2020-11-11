package ProyectoG4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VResumen extends JFrame {

	private JPanel contentPane;
	private final JLabel lblResCarteleraSemana = new JLabel("Resumen de la cartelera de la semana");
	private final JLabel lblNewLabel = new JLabel("");
	private final JLabel lblSemana = new JLabel("xx/xx/xxxx");
	private final JList listSabado = new JList();
	private final JList listDomingo = new JList();
	private final JLabel lblSabado = new JLabel("Sabado");
	private final JLabel lblDomingo = new JLabel("Domingo");
	private final JButton btnCancelar = new JButton("Cancelar");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VResumen frame = new VResumen();
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
	public VResumen() {
		initGUI();
	}
	private void initGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\eclipse-workspace\\Grupo4\\ProyectoG4\\imagenes\\Logo.png"));
		setTitle("Resumen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color (156, 196, 236));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblResCarteleraSemana.setBounds(32, 42, 190, 14);
		
		contentPane.add(lblResCarteleraSemana);
		lblNewLabel.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo4\\ProyectoG4\\imagenes\\Logo.png"));
		lblNewLabel.setBounds(341, 0, 93, 93);
		
		contentPane.add(lblNewLabel);
		lblSemana.setBounds(232, 42, 77, 14);
		
		contentPane.add(lblSemana);
		listSabado.setBounds(70, 92, 77, 146);
		
		contentPane.add(listSabado);
		listDomingo.setBounds(199, 92, 77, 146);
		
		contentPane.add(listDomingo);
		lblSabado.setBounds(80, 67, 46, 14);
		
		contentPane.add(lblSabado);
		lblDomingo.setBounds(202, 67, 46, 14);
		
		contentPane.add(lblDomingo);
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//la vetana de Bienvenida
//				VBienvenida Bienvenida= new VBienvenida();
//				Bienvenida.setVisible(true);
//				dispose();
			}
		});
		btnCancelar.setBounds(341, 227, 89, 23);
		
		contentPane.add(btnCancelar);
	}

}
