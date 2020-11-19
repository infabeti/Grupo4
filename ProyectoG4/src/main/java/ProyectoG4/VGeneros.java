package ProyectoG4;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.List;

import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.JTextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.border.EtchedBorder;

public class VGeneros extends JFrame {

	private JPanel contentPane;
	private JTextField textField_codigo;
	private final ButtonGroup groupDias = new ButtonGroup();
	private final JButton btnCancelar = new JButton("Cancelar");
	static DefaultListModel modeloLS = new DefaultListModel();
	static DefaultListModel modeloLD = new DefaultListModel();
	static DefaultListModel modeloHS = new DefaultListModel();
	static DefaultListModel modeloHD = new DefaultListModel();
	final static JLabel lbl_tiempoSabado = new JLabel("8 h. 00 min.");
	final static JLabel lbl_tiempoDomingo = new JLabel("6 h. 00 min.");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
					VGeneros frame = new VGeneros();
					frame.setVisible(true);
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VGeneros() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VGeneros.class.getResource("/iconos/cineCSS.png")));
		setFocusTraversalPolicyProvider(true);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setName("");
		contentPane.setBackground(new Color (156, 196, 236));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		textField_codigo = new JTextField();
		textField_codigo.setHorizontalAlignment(SwingConstants.CENTER);
		textField_codigo.setBounds(160, 121, 41, 41);
		textField_codigo.setName("");
		textField_codigo.setColumns(10);
		
		JLabel lbl_codDeseado = new JLabel("C\u00F3digo deseado:");
		lbl_codDeseado.setBounds(15, 129, 135, 20);
		lbl_codDeseado.setName("");
		lbl_codDeseado.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lbl_logo = new JLabel("");
		lbl_logo.setName("");
		lbl_logo.setSize(90, 92);
		lbl_logo.setLocation(10,5);
		lbl_logo.setIcon(new ImageIcon(VGeneros.class.getResource("/iconos/cineCSS.png")));  
		
		JLabel lbl_codigos = new JLabel("C\u00D3DIGOS:");
		lbl_codigos.setBounds(15, 174, 126, 44);
		lbl_codigos.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lbl_drama = new JLabel("1.- DRAMA");
		lbl_drama.setBounds(15, 216, 105, 34);
		lbl_drama.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lbl_comedia = new JLabel("2.- COMEDIA");
		lbl_comedia.setBounds(15, 256, 105, 34);
		lbl_comedia.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lbl_terror = new JLabel("3.- TERROR");
		lbl_terror.setBounds(15, 296, 105, 34);
		lbl_terror.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lbl_cienciaf = new JLabel("4.- CIENCIA FICCI\u00D3N");
		lbl_cienciaf.setBounds(15, 336, 186, 34);
		lbl_cienciaf.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.setLayout(null);
		contentPane.add(lbl_logo);
		contentPane.add(lbl_codDeseado);
		contentPane.add(textField_codigo);
		contentPane.add(lbl_codigos);
		contentPane.add(lbl_drama);
		contentPane.add(lbl_comedia);
		contentPane.add(lbl_terror);
		contentPane.add(lbl_cienciaf);
		
		JLabel lbl_sabado = new JLabel("S\u00C1BADO");
		lbl_sabado.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl_sabado.setBounds(306, 157, 78, 20);
		contentPane.add(lbl_sabado);
		
		JLabel lbl_domingo = new JLabel("DOMINGO");
		lbl_domingo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl_domingo.setBounds(571, 160, 81, 14);
		contentPane.add(lbl_domingo);
		
		
		JButton btn_ir = new JButton("Ir");
		btn_ir.setEnabled(true);
		btn_ir.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_ir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_ir.setMargin(new Insets(2, 2, 2, 2));
		btn_ir.setBounds(207, 124, 41, 34);
		contentPane.add(btn_ir);
		
		btn_ir.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				boolean numeric = true;
		        numeric = textField_codigo.getText().matches("-?\\d+(\\.\\d+)?");
		        
			if (numeric) {
				int i=Integer.parseInt(textField_codigo.getText());
				if ((i>=1 && i<=4)) {
					if (i == 1) {
						VPeliculas PelisDrama =new VPeliculas();
						PelisDrama.setBounds (100, 100, 800, 550);
						PelisDrama.setVisible(true);
						PelisDrama.setResizable(false);
						PelisDrama.lbl_genero.setText("Drama");
						PelisDrama.btn_1_handia.setVisible(true);
						PelisDrama.btn_1_listaSch.setVisible(true);
						PelisDrama.btn_1_cadenaPerp.setVisible(true);
						PelisDrama.btn_1_millionDollar.setVisible(true);
						setVisible(false); 
					}	
					if (i == 2) {
						VPeliculas PelisComedia =new VPeliculas();
						PelisComedia.setBounds (100, 100, 800, 550);
						PelisComedia.setVisible(true);
						PelisComedia.setResizable(false);
						PelisComedia.lbl_genero.setText("Comedia");
						PelisComedia.btn_2_scaryMovie.setVisible(true);
						PelisComedia.btn_2_granLebow.setVisible(true);
						PelisComedia.btn_2_vidaBrian.setVisible(true);
						PelisComedia.btn_2_aterriza.setVisible(true);
				        setVisible(false);
					}
					if (i == 3) {
						VPeliculas PelisTerror =new VPeliculas();
						PelisTerror.setBounds (100, 100, 800, 550);
						PelisTerror.setVisible(true);
						PelisTerror.setResizable(false);
						PelisTerror.lbl_genero.setText("Terror");
						PelisTerror.btn_3_psicosis.setVisible(true);
						PelisTerror.btn_3_resplandor.setVisible(true);
						PelisTerror.btn_3_dracula.setVisible(true);
						PelisTerror.btn_3_cisne.setVisible(true);
				        setVisible(false);
					}
					if (i == 4) {
						VPeliculas PelisSciFi =new VPeliculas();
						PelisSciFi.setBounds (100, 100, 800, 550);
						PelisSciFi.setVisible(true);
						PelisSciFi.setResizable(false);
						PelisSciFi.lbl_genero.setText("Ciencia ficción");
						PelisSciFi.btn_4_2001.setVisible(true);
						PelisSciFi.btn_4_noviaFrank.setVisible(true);
						PelisSciFi.btn_4_planetaSimios.setVisible(true);
						PelisSciFi.btn_4_alien.setVisible(true);
				        setVisible(false);
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Por favor, introduzca valores del 1 al 4");}
			}else {
				JOptionPane.showMessageDialog(null, "Por favor, introduzca solo valores numéricos");}
		}
	});

		
		JLabel lbl_nube = new JLabel("");
		lbl_nube.setIcon(new ImageIcon(VGeneros.class.getResource("/iconos/nube.png")));
		lbl_nube.setBounds(335, -15, 450, 245);
		contentPane.add(lbl_nube);
		
		btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancelar.setBounds(685, 477, 89, 23);
		btnCancelar.setBackground(Color.WHITE);
		btnCancelar.setForeground(Color.BLACK);
		contentPane.add(btnCancelar);
		
		
		JList list_sabado = new JList();
		list_sabado.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.BLACK, null));
		list_sabado.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_sabado.setModel(modeloLS); 
		list_sabado.setBounds(324, 204, 142, 196);
		contentPane.add(list_sabado);
		
		
		JList list_domingo = new JList();
		list_domingo.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.BLACK, null));
		list_domingo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_domingo.setModel(modeloLD); 
		list_domingo.setBounds(605, 204, 142, 196);
		contentPane.add(list_domingo);
		
		
		JList list_hsabado = new JList();
		list_hsabado.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.BLACK, null));
		list_hsabado.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_hsabado.setModel(modeloHS); 
		list_hsabado.setBounds(236, 204, 78, 196);
		contentPane.add(list_hsabado);
		
		JList list_hdomingo = new JList();
		list_hdomingo.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.BLACK, null));
		list_hdomingo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_hdomingo.setModel(modeloHD); 
		list_hdomingo.setBounds(517, 204, 78, 196);
		contentPane.add(list_hdomingo);
		
		JLabel lbl_restanteSabado = new JLabel("Tiempo restante S\u00E1bado:");
		lbl_restanteSabado.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_restanteSabado.setBounds(236, 415, 154, 20);
		contentPane.add(lbl_restanteSabado);
		
		JLabel lbl_restanteDomingo = new JLabel("Tiempo restante Domingo:");
		lbl_restanteDomingo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_restanteDomingo.setBounds(517, 415, 154, 20);
		contentPane.add(lbl_restanteDomingo);
		
		lbl_tiempoSabado.setForeground(Color.RED);
		lbl_tiempoSabado.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbl_tiempoSabado.setBounds(386, 418, 80, 14);
		contentPane.add(lbl_tiempoSabado);
		
		lbl_tiempoDomingo.setForeground(Color.RED);
		lbl_tiempoDomingo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbl_tiempoDomingo.setBounds(672, 418, 80, 14);
		contentPane.add(lbl_tiempoDomingo);
		
		JLabel lbl_durSab = new JLabel("Duraci\u00F3n");
		lbl_durSab.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_durSab.setBounds(247, 189, 54, 14);
		contentPane.add(lbl_durSab);
		
		JLabel lbl_durDom = new JLabel("Duraci\u00F3n");
		lbl_durDom.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_durDom.setBounds(529, 189, 54, 14);
		contentPane.add(lbl_durDom);
		
		JLabel lbl_titSab = new JLabel("T\u00EDtulo");
		lbl_titSab.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_titSab.setBounds(373, 189, 46, 14);
		contentPane.add(lbl_titSab);
		
		JLabel lbl_titDom = new JLabel("T\u00EDtulo");
		lbl_titDom.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_titDom.setBounds(656, 189, 46, 14);
		contentPane.add(lbl_titDom);
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//la ventana de Bienvenida
				VBienvenida Bienvenida= new VBienvenida();
				Bienvenida.setVisible(true);
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
	}
}
