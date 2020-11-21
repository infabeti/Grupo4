package ProyectoG4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.ListSelectionModel;

public class VResumen extends JFrame {

	protected static final String list_sabadoC = null;
	private JPanel contentPane;
	private final JLabel lblResCarteleraSemana = new JLabel("Resumen de la cartelera del");
	private final JLabel lblSabado = new JLabel("Sabado");
	private final JLabel lblDomingo = new JLabel("Domingo");
	private final JButton btnCancelar = new JButton("Cancelar");
	private final JLabel lbl_nube = new JLabel("");
	static DefaultListModel modeloLScopia = new DefaultListModel();
	static DefaultListModel modeloLDcopia = new DefaultListModel();
	static DefaultListModel modeloHScopia = new DefaultListModel();
	static DefaultListModel modeloHDcopia = new DefaultListModel();
	VGeneros ventanaGeneros = new VGeneros();
	infoPelis datosPelis = new infoPelis();

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
		
		JLabel lblFinDeSemana = new JLabel("fin de semana");
		lblFinDeSemana.setHorizontalAlignment(SwingConstants.CENTER);
		lblFinDeSemana.setFont(new Font("SimSun", Font.PLAIN, 30));
		lblFinDeSemana.setBounds(166, 108, 417, 37);
		contentPane.add(lblFinDeSemana);
		
		lblResCarteleraSemana.setFont(new Font("SimSun", Font.PLAIN, 30));
		lblResCarteleraSemana.setBounds(166, 60, 417, 37);
		lblResCarteleraSemana.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblResCarteleraSemana);
		
		lblSabado.setFont(new Font("SimSun", Font.BOLD, 25));
		lblSabado.setBounds(152, 166, 89, 37);
		contentPane.add(lblSabado);
		
		lblDomingo.setFont(new Font("SimSun", Font.BOLD, 25));
		lblDomingo.setBounds(529, 166, 100, 37);
		contentPane.add(lblDomingo);

		btnCancelar.setBounds(685, 477, 89, 23);
		contentPane.add(btnCancelar);
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//la vetana de Bienvenida
				VBienvenida Bienvenida= new VBienvenida();
				Bienvenida.setVisible(true);
				
				modeloHScopia.clear();
				modeloLScopia.clear();
				modeloHDcopia.clear();
				modeloLDcopia.clear();
				//////////////////////////////////////////////
				VGeneros.modeloHS.clear();
				VGeneros.modeloLS.clear();
				VGeneros.modeloHD.clear();
				VGeneros.modeloLD.clear();
				VGeneros.lbl_tiempoSabado.setText("8 h. 00 min.");
				VGeneros.lbl_tiempoDomingo.setText("6 h. 00 min.");
				datosPelis.resetValores();
				dispose();

			}
		});
		btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	btnCancelar.setBackground(Color.RED);
		    	btnCancelar.setForeground(Color.YELLOW);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	btnCancelar.setBackground(Color.WHITE);
		    	btnCancelar.setForeground(Color.BLACK);
		    }
		});
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setBounds(586, 477, 89, 23);
		contentPane.add(btnSiguiente);
		btnSiguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//La ventana de Confirmacion
				VConfirmacion Confirmacion= new VConfirmacion();
				Confirmacion.setVisible(true);
				setVisible(false);
			}
		});
		btnSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	btnSiguiente.setBackground(Color.GREEN);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	btnSiguiente.setBackground(Color.WHITE);
		    	btnSiguiente.setForeground(Color.BLACK);
		    }
		});
		
		JLabel lbl_logo = new JLabel("");
		lbl_logo.setIcon(new ImageIcon(VResumen.class.getResource("/iconos/cineCSS.png")));
		lbl_logo.setBounds(10, 5, 90, 92);
		contentPane.add(lbl_logo);
		
		lbl_nube.setIcon(new ImageIcon(VResumen.class.getResource("/iconos/nube.png")));
		lbl_nube.setBounds(335, -15, 450, 245);
		contentPane.add(lbl_nube);
		
		JList list_sabadoC = new JList();
		list_sabadoC.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_sabadoC.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.BLACK, null));
		list_sabadoC.setModel(modeloLScopia); 
		list_sabadoC.setBounds(176, 225, 142, 196);
		contentPane.add(list_sabadoC);
		
		JList list_domingoC = new JList();
		list_domingoC.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_domingoC.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.BLACK, null));
		list_domingoC.setModel(modeloLDcopia); 
		list_domingoC.setBounds(555, 225, 142, 196);
		contentPane.add(list_domingoC);
		
		JList list_hsabadoC = new JList();
		list_hsabadoC.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_hsabadoC.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.BLACK, null));
		list_hsabadoC.setModel(modeloHScopia); 
		list_hsabadoC.setBounds(88, 225, 78, 196);
		contentPane.add(list_hsabadoC);
		
		JList list_hdomingoC = new JList();
		list_hdomingoC.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_hdomingoC.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.BLACK, null));
		list_hdomingoC.setModel(modeloHDcopia); 
		list_hdomingoC.setBounds(467, 225, 78, 196);
		contentPane.add(list_hdomingoC);
		
		JLabel lbl_durSab = new JLabel("Duraci\u00F3n");
		lbl_durSab.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_durSab.setBounds(99, 212, 54, 14);
		contentPane.add(lbl_durSab);
		
		JLabel lbl_durDom = new JLabel("Duraci\u00F3n");
		lbl_durDom.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_durDom.setBounds(479, 212, 54, 14);
		contentPane.add(lbl_durDom);
		
		JLabel lbl_titSab = new JLabel("T\u00EDtulo");
		lbl_titSab.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_titSab.setBounds(226, 212, 41, 14);
		contentPane.add(lbl_titSab);
		
		JLabel lbl_titDom = new JLabel("T\u00EDtulo");
		lbl_titDom.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_titDom.setBounds(607, 212, 41, 14);
		contentPane.add(lbl_titDom);
	}
}
