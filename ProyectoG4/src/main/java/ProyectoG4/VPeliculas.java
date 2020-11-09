package ProyectoG4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JList;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import javax.swing.ImageIcon;

public class VPeliculas extends JFrame {

	private JPanel contentPane;
	private final JLabel lblHaseleccionado = new JLabel("Has seleccionado g\u00E9nero:");
	private final JLabel lblGeneroSeleccionado = new JLabel("");
	private final JLabel lblEstassonpelisdisponibles = new JLabel("Estas son las peliculas disponibles");
	private final JLabel lblSabado = new JLabel("Sabado:");
	private final JLabel lblDomingo = new JLabel("Domingo:");
	private final JList listSabado = new JList();
	private final JList listDomingo = new JList();
	private final JLabel lblNewLabel = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VPeliculas frame = new VPeliculas();
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
	public VPeliculas() {
		initGUI();
	}
	private void initGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\eclipse-workspace\\Grupo4\\ProyectoG4\\imagenes\\Logo.png"));
		setTitle("Peliculas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color (156, 196, 236));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblHaseleccionado.setBounds(104, 36, 129, 14);
		
		contentPane.add(lblHaseleccionado);
		lblGeneroSeleccionado.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
//				lblHaseleccionado.setText(lblHaseleccionado.getText()+Vgeneros.FinSemana);
			}
		});
		lblGeneroSeleccionado.setBounds(243, 36, 46, 14);
		
		contentPane.add(lblGeneroSeleccionado);
		lblEstassonpelisdisponibles.setBounds(104, 61, 165, 14);
		
		contentPane.add(lblEstassonpelisdisponibles);
		lblSabado.setBounds(104, 86, 46, 14);
		
		contentPane.add(lblSabado);
		lblDomingo.setBounds(212, 86, 46, 14);
		
		contentPane.add(lblDomingo);
		listSabado.setBounds(104, 122, 86, 128);
		
		contentPane.add(listSabado);
		listDomingo.setBounds(203, 122, 86, 128);
		
		contentPane.add(listDomingo);
		lblNewLabel.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo4\\ProyectoG4\\imagenes\\Logo.png"));
		lblNewLabel.setBounds(328, 11, 96, 89);
		
		contentPane.add(lblNewLabel);
	}
}
