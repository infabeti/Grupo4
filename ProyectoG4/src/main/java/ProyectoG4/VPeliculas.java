package ProyectoG4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JList;
import java.util.ArrayList;
import java.util.List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class VPeliculas extends JFrame {

	private JPanel contentPane;
	private final JLabel lblHaseleccionado = new JLabel("Has seleccionado el g\u00E9nero:");
	private final JLabel lblGeneroSeleccionado = new JLabel("");
	private final JLabel lblEstassonpelisdisponibles = new JLabel("Estas son las peliculas disponibles:");
	final JLabel lbl_genero = new JLabel("");
	final JButton btn_1_handia = new JButton("");
	final JButton btn_1_listaSch = new JButton("");
	final JButton btn_1_cadenaPerp = new JButton("");
	final JButton btn_1_millionDollar = new JButton("");
	final JButton btn_2_scaryMovie = new JButton("");
	final JButton btn_2_granLebow = new JButton("");
	final JButton btn_2_vidaBrian = new JButton("");
	final JButton btn_2_aterriza = new JButton("");
	final JButton btn_3_psicosis = new JButton("");
	final JButton btn_3_resplandor = new JButton("");
	final JButton btn_3_dracula = new JButton("");
	final JButton btn_3_cisne = new JButton("");
	final JButton btn_4_2001 = new JButton("");
	final JButton btn_4_noviaFrank = new JButton("");
	final JButton btn_4_planetaSimios = new JButton("");
	final JButton btn_4_alien = new JButton("");
	private final JButton btnCancelar = new JButton("Cancelar");
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(VPeliculas.class.getResource("/iconos/cineCSS.png")));
		setTitle("Peliculas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color (156, 196, 236));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblHaseleccionado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHaseleccionado.setBounds(113, 36, 209, 27);
		contentPane.add(lblHaseleccionado);
		
		JLabel lbl_logo = new JLabel("");
		lbl_logo.setName("");
		lbl_logo.setSize(90, 92);
		lbl_logo.setLocation(10,5);
		lbl_logo.setIcon(new ImageIcon(VPeliculas.class.getResource("/iconos/cineCSS.png"))); 
		contentPane.add(lbl_logo);
		
		lblGeneroSeleccionado.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
//				lblHaseleccionado.setText(lblHaseleccionado.getText()+Vgeneros.FinSemana);
			}
		});
		lblGeneroSeleccionado.setBounds(243, 36, 46, 14);
		contentPane.add(lblGeneroSeleccionado);
		
		lblEstassonpelisdisponibles.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEstassonpelisdisponibles.setBounds(113, 89, 218, 27);
		contentPane.add(lblEstassonpelisdisponibles);
		
		lbl_genero.setFont(new Font("Caladea", Font.BOLD, 30));
		lbl_genero.setBounds(332, 35, 197, 25);
		contentPane.add(lbl_genero);

		btn_1_handia.setVisible(false);
		btn_1_handia.setEnabled(false);
		btn_1_handia.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_1_handia.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_1_handia.setIcon(new ImageIcon(VPeliculas.class.getResource("/Peliculas/01.Handia.png")));
		btn_1_handia.setBounds(50, 165, 150, 200);
		btn_1_handia.setToolTipText("Handia, 1 h 56 min");
		contentPane.add(btn_1_handia);

		
		btn_1_listaSch.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_1_listaSch.setVisible(false);
		btn_1_listaSch.setEnabled(false);
		btn_1_listaSch.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_1_listaSch.setIcon(new ImageIcon(VPeliculas.class.getResource("/Peliculas/01.ListaSch.png")));
		btn_1_listaSch.setBounds(230, 165, 150, 200);
		btn_1_listaSch.setToolTipText("La lista de Schindler, 3 h 17 min");
		contentPane.add(btn_1_listaSch);

		
		btn_1_cadenaPerp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_1_cadenaPerp.setVisible(false);
		btn_1_cadenaPerp.setEnabled(false);
		btn_1_cadenaPerp.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_1_cadenaPerp.setIcon(new ImageIcon(VPeliculas.class.getResource("/Peliculas/01.CadenaPerp.png")));
		btn_1_cadenaPerp.setBounds(410, 165, 150, 200);
		btn_1_cadenaPerp.setToolTipText("Cadena Perpetua, 2 h 22 min");
		contentPane.add(btn_1_cadenaPerp);
		
		
		btn_1_millionDollar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_1_millionDollar.setVisible(false);
		btn_1_millionDollar.setEnabled(false);
		btn_1_millionDollar.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_1_millionDollar.setIcon(new ImageIcon(VPeliculas.class.getResource("/Peliculas/01.MillionDollar.png")));
		btn_1_millionDollar.setBounds(590, 165, 150, 200);
		btn_1_millionDollar.setToolTipText("Million Dollar Baby, 2 h 13 min");
		contentPane.add(btn_1_millionDollar);

		
		btn_2_scaryMovie.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_2_scaryMovie.setEnabled(false);
		btn_2_scaryMovie.setVisible(false);
		btn_2_scaryMovie.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_2_scaryMovie.setIcon(new ImageIcon(VPeliculas.class.getResource("/Peliculas/02.ScaryMovie.png")));
		btn_2_scaryMovie.setBounds(50, 165, 150, 200);
		btn_2_scaryMovie.setToolTipText("Scary movie, 1 h 30 min");
		contentPane.add(btn_2_scaryMovie);
	
		
		btn_2_granLebow.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_2_granLebow.setEnabled(false);
		btn_2_granLebow.setVisible(false);
		btn_2_granLebow.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_2_granLebow.setIcon(new ImageIcon(VPeliculas.class.getResource("/Peliculas/02.GranLebow.png")));
		btn_2_granLebow.setBounds(230, 165, 150, 200);
		btn_2_granLebow.setToolTipText("El gran Lebowsky, 1 h 59 min");
		contentPane.add(btn_2_granLebow);
		
		
		btn_2_vidaBrian.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_2_vidaBrian.setEnabled(false);
		btn_2_vidaBrian.setVisible(false);
		btn_2_vidaBrian.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_2_vidaBrian.setIcon(new ImageIcon(VPeliculas.class.getResource("/Peliculas/02.VidaBrian.png")));
		btn_2_vidaBrian.setBounds(410, 165, 150, 200);
		btn_2_vidaBrian.setToolTipText("La vida de Brian, 1 h 34 min");
		contentPane.add(btn_2_vidaBrian);
		
		
		btn_2_aterriza.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_2_aterriza.setEnabled(false);
		btn_2_aterriza.setVisible(false);
		btn_2_aterriza.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_2_aterriza.setIcon(new ImageIcon(VPeliculas.class.getResource("/Peliculas/02.Aterriza.png")));
		btn_2_aterriza.setBounds(590, 165, 150, 200);
		btn_2_aterriza.setToolTipText("Aterriza como puedas, 1 h 28 min");
		contentPane.add(btn_2_aterriza);
		
		
		btn_3_psicosis.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_3_psicosis.setEnabled(false);
		btn_3_psicosis.setVisible(false);
		btn_3_psicosis.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_3_psicosis.setIcon(new ImageIcon(VPeliculas.class.getResource("/Peliculas/03.Psicosis.png")));
		btn_3_psicosis.setBounds(50, 165, 150, 200);
		btn_3_psicosis.setToolTipText("Psicosis, 1 h 49 min");
		contentPane.add(btn_3_psicosis);
		
		
		btn_3_resplandor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_3_resplandor.setEnabled(false);
		btn_3_resplandor.setVisible(false);
		btn_3_resplandor.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_3_resplandor.setIcon(new ImageIcon(VPeliculas.class.getResource("/Peliculas/03.Resplandor.png")));
		btn_3_resplandor.setBounds(230, 165, 150, 200);
		btn_3_resplandor.setToolTipText("El resplandor, 2 h 26 min");
		contentPane.add(btn_3_resplandor);
		
		
		btn_3_dracula.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_3_dracula.setEnabled(false);
		btn_3_dracula.setVisible(false);
		btn_3_dracula.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_3_dracula.setIcon(new ImageIcon(VPeliculas.class.getResource("/Peliculas/03.Dracula.png")));
		btn_3_dracula.setBounds(410, 165, 150, 200);
		btn_3_dracula.setToolTipText("Dracula, 2 h 35 min");
		contentPane.add(btn_3_dracula);
		
		
		btn_3_cisne.setEnabled(false);
		btn_3_cisne.setVisible(false);
		btn_3_cisne.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_3_cisne.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_3_cisne.setIcon(new ImageIcon(VPeliculas.class.getResource("/Peliculas/03.CisneNegro.png")));
		btn_3_cisne.setBounds(590, 165, 150, 200);
		btn_3_cisne.setToolTipText("Cisne negro, 1 h 50 min");
		contentPane.add(btn_3_cisne);
		

		btn_4_2001.setEnabled(false);
		btn_4_2001.setVisible(false);
		btn_4_2001.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_4_2001.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_4_2001.setIcon(new ImageIcon(VPeliculas.class.getResource("/Peliculas/04.2001.png")));
		btn_4_2001.setBounds(50, 165, 150, 200);
		btn_4_2001.setToolTipText("2001: Odisea en el espacio, 2 h 22 min");
		contentPane.add(btn_4_2001);
		
		
		btn_4_noviaFrank.setVisible(false);
		btn_4_noviaFrank.setEnabled(false);
		btn_4_noviaFrank.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_4_noviaFrank.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_4_noviaFrank.setIcon(new ImageIcon(VPeliculas.class.getResource("/Peliculas/04.NoviaFrank.png")));
		btn_4_noviaFrank.setBounds(230, 165, 150, 200);
		btn_4_noviaFrank.setToolTipText("La novia de Frankenstein, 1 h 15 min");
		contentPane.add(btn_4_noviaFrank);
		
		
		btn_4_planetaSimios.setVisible(false);
		btn_4_planetaSimios.setEnabled(false);	
		btn_4_planetaSimios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_4_planetaSimios.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_4_planetaSimios.setIcon(new ImageIcon(VPeliculas.class.getResource("/Peliculas/04.PlanetaSimios.png")));
		btn_4_planetaSimios.setBounds(410, 165, 150, 200);
		btn_4_planetaSimios.setToolTipText("El planeta de los simios, 1 h 55 min");
		contentPane.add(btn_4_planetaSimios);
			
		
		btn_4_alien.setEnabled(false);
		btn_4_alien.setVisible(false);	
		btn_4_alien.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_4_alien.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_4_alien.setIcon(new ImageIcon(VPeliculas.class.getResource("/Peliculas/04.Alien.png")));
		btn_4_alien.setBounds(590, 165, 150, 200);
		btn_4_alien.setToolTipText("Alien, el octavo pasajero, 1 h 57 min");
		contentPane.add(btn_4_alien);
			
		
		JLabel lbl_nube = new JLabel("");
		lbl_nube.setIcon(new ImageIcon(VPeliculas.class.getResource("/iconos/nube.png")));
		lbl_nube.setBounds(335, -15, 450, 245);
		contentPane.add(lbl_nube);
		
		btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancelar.setBounds(685, 477, 89, 23);
		btnCancelar.setBackground(Color.WHITE);
		btnCancelar.setForeground(Color.BLACK);
		contentPane.add(btnCancelar);
		
		JRadioButton rdbtn_domingo = new JRadioButton("Domingo");
		rdbtn_domingo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		buttonGroup.add(rdbtn_domingo);
		rdbtn_domingo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtn_domingo.setBackground(new Color(156, 196, 236));
		rdbtn_domingo.setBounds(10, 417, 90, 23);
		contentPane.add(rdbtn_domingo);
		
		JRadioButton rdbtn_sabado = new JRadioButton("S\u00E1bado");
		rdbtn_sabado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn_1_handia.setEnabled(true);
				btn_1_listaSch.setEnabled(true);
				btn_1_cadenaPerp.setEnabled(true);
				btn_1_millionDollar.setEnabled(true);
				///////////////////////////////////
				btn_2_scaryMovie.setEnabled(true);
				btn_2_granLebow.setEnabled(true);
				btn_2_vidaBrian.setEnabled(true);
				btn_2_aterriza.setEnabled(true);
				///////////////////////////////////
				btn_3_psicosis.setEnabled(true);
				btn_3_resplandor.setEnabled(true);
				btn_3_dracula.setEnabled(true);
				btn_3_cisne.setEnabled(true);
				///////////////////////////////////
				btn_4_2001.setEnabled(true);
				btn_4_noviaFrank.setEnabled(true);
				btn_4_planetaSimios.setEnabled(true);
				btn_4_alien.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtn_sabado);
		rdbtn_sabado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtn_sabado.setBackground(new Color(156, 196, 236));
		rdbtn_sabado.setBounds(10, 388, 78, 23);
		contentPane.add(rdbtn_sabado);
		
		JTextArea txtr_porfa = new JTextArea();
		txtr_porfa.setText("*Por favor, \r\nseleccione una\r\nopcion");
		txtr_porfa.setForeground(Color.RED);
		txtr_porfa.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtr_porfa.setDisabledTextColor(Color.RED);
		txtr_porfa.setBackground(new Color(156, 196, 236));
		txtr_porfa.setBounds(106, 388, 126, 52);
		contentPane.add(txtr_porfa);
		
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
		btn_1_handia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtn_sabado.isSelected()){

		        }
				if(rdbtn_domingo.isSelected()){
					
		        }
			}
		});
		btn_1_listaSch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtn_sabado.isSelected()){
		        }
				if(rdbtn_domingo.isSelected()){
					
		        }
			}
		});
		btn_1_cadenaPerp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtn_sabado.isSelected()){
		        }
				if(rdbtn_domingo.isSelected()){
					
		        }
			}
		});
		btn_1_millionDollar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtn_sabado.isSelected()){
		        }
				if(rdbtn_domingo.isSelected()){
					
		        }
			}
		});
/////////////////////////////////////////////////////////////////////////////
		btn_2_scaryMovie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtn_sabado.isSelected()){
		        }
				if(rdbtn_domingo.isSelected()){
					
		        }
			}
		});
		btn_2_granLebow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtn_sabado.isSelected()){
		        }
				if(rdbtn_domingo.isSelected()){
					
		        }
			}
		});
		btn_2_vidaBrian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtn_sabado.isSelected()){
		        }
				if(rdbtn_domingo.isSelected()){
					
		        }
			}
		});
		btn_2_aterriza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtn_sabado.isSelected()){
		        }
				if(rdbtn_domingo.isSelected()){
					
		        }
			}
		});
/////////////////////////////////////////////////////////////////////////////
		btn_3_psicosis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtn_sabado.isSelected()){
		        }
				if(rdbtn_domingo.isSelected()){
					
		        }
			}
		});
		btn_3_resplandor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtn_sabado.isSelected()){
		        }
				if(rdbtn_domingo.isSelected()){
					
		        }
			}
		});
		btn_3_dracula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtn_sabado.isSelected()){
		        }
				if(rdbtn_domingo.isSelected()){
					
		        }
			}
		});
		btn_3_cisne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtn_sabado.isSelected()){
		        }
				if(rdbtn_domingo.isSelected()){
					
		        }
			}
		});
/////////////////////////////////////////////////////////////////////////////
		btn_4_2001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtn_sabado.isSelected()){
		        }
				if(rdbtn_domingo.isSelected()){
					
		        }
			}
		});
		btn_4_noviaFrank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtn_sabado.isSelected()){
		        }
				if(rdbtn_domingo.isSelected()){
					
		        }
			}
		});
		btn_4_planetaSimios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtn_sabado.isSelected()){
		        }
				if(rdbtn_domingo.isSelected()){
					
		        }
			}
		});
		btn_4_alien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtn_sabado.isSelected()){
		        }
				if(rdbtn_domingo.isSelected()){
					
		        }
			}
		});	
	}
}
