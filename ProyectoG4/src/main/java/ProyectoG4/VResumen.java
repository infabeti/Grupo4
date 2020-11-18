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
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VResumen extends JFrame {

	private JPanel contentPane;
	private final JLabel lblResCarteleraSemana = new JLabel("Resumen de la cartelera de la semana");
	private final JList listSabado = new JList();
	private final JList listDomingo = new JList();
	private final JLabel lblSabado = new JLabel("Sabado");
	private final JLabel lblDomingo = new JLabel("Domingo");
	private final JButton btnCancelar = new JButton("Cancelar");
	private final JLabel lbl_nube = new JLabel("");

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(VResumen.class.getResource("/iconos/cineCSS.png")));
		setTitle("Resumen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color (156, 196, 236));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblResCarteleraSemana.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblResCarteleraSemana.setBounds(218, 61, 351, 37);
		
		contentPane.add(lblResCarteleraSemana);
		listSabado.setBounds(199, 225, 77, 146);
		
		contentPane.add(listSabado);
		listDomingo.setBounds(387, 225, 77, 146);
		
		contentPane.add(listDomingo);
		lblSabado.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblSabado.setBounds(166, 128, 148, 86);
		
		contentPane.add(lblSabado);
		lblDomingo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblDomingo.setBounds(387, 121, 111, 93);
		
		contentPane.add(lblDomingo);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//la vetana de Bienvenida
				VBienvenida Bienvenida= new VBienvenida();
				Bienvenida.setVisible(true);
				dispose();
			}
		});
		btnCancelar.setBounds(685, 477, 89, 23);
		
		contentPane.add(btnCancelar);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//La ventana de Confirmacion
				VConfirmacion Confirmacion= new VConfirmacion();
				Confirmacion.setVisible(true);
				dispose();
			}
		});
		btnSiguiente.setBounds(586, 477, 89, 23);
		contentPane.add(btnSiguiente);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(VResumen.class.getResource("/iconos/cineCSS.png")));
		lblNewLabel_1.setBounds(10, 5, 90, 92);
		contentPane.add(lblNewLabel_1);
		lbl_nube.setIcon(new ImageIcon(VResumen.class.getResource("/iconos/nube.png")));
		lbl_nube.setBounds(335, -15, 450, 245);
		
		contentPane.add(lbl_nube);
	}
}
