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
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Cursor;

public class VPeliculas extends JFrame {

	private JPanel contentPane;
	private final JLabel lblHaseleccionado = new JLabel("Has seleccionado el g\u00E9nero:");
	private final JLabel lblGeneroSeleccionado = new JLabel("");
	private final JLabel lblEstassonpelisdisponibles = new JLabel("Estas son las peliculas disponibles:");
	private final JLabel lbl_genero = new JLabel("Ciencia ficci\u00F3n");
	private final JButton btn_1_handia = new JButton("");
	private final JButton btn_1_listaSch = new JButton("");
	private final JButton btn_1_cadenaPerp = new JButton("");
	private final JButton btn_1_millionDollar = new JButton("");
	private final JButton btn_4_2001 = new JButton("");
	private final JButton btn_4_noviaFrank = new JButton("");
	private final JButton btn_4_planetaSimios = new JButton("");
	private final JButton btn_4_alien = new JButton("");
	private final JButton btn_2_scaryMovie = new JButton("");
	private final JButton btn_2_granLebow = new JButton("");
	private final JButton btn_2_vidaBrian = new JButton("");
	private final JButton btn_2_aterriza = new JButton("");
	private final JButton btn_3_psicosis = new JButton("");
	private final JButton btn_3_resplandor = new JButton("");
	private final JButton btn_3_dracula = new JButton("");
	private final JButton btn_3_cisne = new JButton("");

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
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color (156, 196, 236));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblHaseleccionado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHaseleccionado.setBounds(113, 36, 209, 27);
		
		JLabel lbl_logo = new JLabel("");
		lbl_logo.setName("");
		lbl_logo.setSize(90, 92);
		lbl_logo.setLocation(5,5);
		lbl_logo.setIcon(new ImageIcon("C:\\unaiworkspace\\Grupo4\\ProyectoG4\\imagenes\\cineCSS.png"));  
		
		contentPane.add(lblHaseleccionado);
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
		
		lbl_logo.setIcon(new ImageIcon("C:\\unaiworkspace\\Grupo4\\ProyectoG4\\imagenes\\cineCSS.png"));  
		contentPane.add(lbl_logo);
		lbl_genero.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_genero.setBounds(332, 35, 146, 25);
		
		contentPane.add(lbl_genero);
		btn_1_handia.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_1_handia.setVisible(false);
		btn_1_handia.setEnabled(false);
		btn_1_handia.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_1_handia.setIcon(new ImageIcon("C:\\unaiworkspace\\Grupo4\\ProyectoG4\\imagenes\\Peliculas\\01.Handia.png"));
		btn_1_handia.setBounds(50, 165, 150, 200);
		
		contentPane.add(btn_1_handia);
		btn_1_listaSch.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_1_listaSch.setVisible(false);
		btn_1_listaSch.setEnabled(false);
		btn_1_listaSch.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_1_listaSch.setIcon(new ImageIcon("C:\\unaiworkspace\\Grupo4\\ProyectoG4\\imagenes\\Peliculas\\01.ListaSch.png"));
		btn_1_listaSch.setBounds(230, 165, 150, 200);
		
		contentPane.add(btn_1_listaSch);
		btn_1_cadenaPerp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_1_cadenaPerp.setVisible(false);
		btn_1_cadenaPerp.setEnabled(false);
		btn_1_cadenaPerp.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_1_cadenaPerp.setIcon(new ImageIcon("C:\\unaiworkspace\\Grupo4\\ProyectoG4\\imagenes\\Peliculas\\01.CadenaPerp.png"));
		btn_1_cadenaPerp.setBounds(410, 165, 150, 200);
		
		contentPane.add(btn_1_cadenaPerp);
		btn_1_millionDollar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_1_millionDollar.setVisible(false);
		btn_1_millionDollar.setEnabled(false);
		btn_1_millionDollar.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_1_millionDollar.setIcon(new ImageIcon("C:\\unaiworkspace\\Grupo4\\ProyectoG4\\imagenes\\Peliculas\\01.MillionDollar.png"));
		btn_1_millionDollar.setBounds(590, 165, 150, 200);
		
		contentPane.add(btn_1_millionDollar);
		btn_4_2001.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_4_2001.setVisible(false);
		btn_4_2001.setEnabled(false);
		btn_4_2001.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_4_2001.setIcon(new ImageIcon("C:\\unaiworkspace\\Grupo4\\ProyectoG4\\imagenes\\Peliculas\\04.2001.png"));
		btn_4_2001.setBounds(50, 165, 150, 200);
		
		contentPane.add(btn_4_2001);
		btn_4_noviaFrank.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_4_noviaFrank.setEnabled(false);
		btn_4_noviaFrank.setVisible(false);
		btn_4_noviaFrank.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_4_noviaFrank.setIcon(new ImageIcon("C:\\unaiworkspace\\Grupo4\\ProyectoG4\\imagenes\\Peliculas\\04.NoviaFrank.png"));
		btn_4_noviaFrank.setBounds(230, 165, 150, 200);
		
		contentPane.add(btn_4_noviaFrank);
		btn_4_planetaSimios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_4_planetaSimios.setVisible(false);
		btn_4_planetaSimios.setEnabled(false);
		btn_4_planetaSimios.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_4_planetaSimios.setIcon(new ImageIcon("C:\\unaiworkspace\\Grupo4\\ProyectoG4\\imagenes\\Peliculas\\04.PlanetaSimios.png"));
		btn_4_planetaSimios.setBounds(410, 165, 150, 200);
		
		contentPane.add(btn_4_planetaSimios);
		btn_4_alien.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_4_alien.setEnabled(false);
		btn_4_alien.setVisible(false);
		btn_4_alien.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_4_alien.setIcon(new ImageIcon("C:\\unaiworkspace\\Grupo4\\ProyectoG4\\imagenes\\Peliculas\\04.Alien.png"));
		btn_4_alien.setBounds(590, 165, 150, 200);
		
		contentPane.add(btn_4_alien);
		btn_2_scaryMovie.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_2_scaryMovie.setEnabled(false);
		btn_2_scaryMovie.setVisible(false);
		btn_2_scaryMovie.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_2_scaryMovie.setIcon(new ImageIcon("C:\\unaiworkspace\\Grupo4\\ProyectoG4\\imagenes\\Peliculas\\02.ScaryMovie.png"));
		btn_2_scaryMovie.setBounds(50, 165, 150, 200);
		
		contentPane.add(btn_2_scaryMovie);
		btn_2_granLebow.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_2_granLebow.setEnabled(false);
		btn_2_granLebow.setVisible(false);
		btn_2_granLebow.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_2_granLebow.setIcon(new ImageIcon("C:\\unaiworkspace\\Grupo4\\ProyectoG4\\imagenes\\Peliculas\\02.GranLebow.png"));
		btn_2_granLebow.setBounds(230, 165, 150, 200);
		
		contentPane.add(btn_2_granLebow);
		btn_2_vidaBrian.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_2_vidaBrian.setEnabled(false);
		btn_2_vidaBrian.setVisible(false);
		btn_2_vidaBrian.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_2_vidaBrian.setIcon(new ImageIcon("C:\\unaiworkspace\\Grupo4\\ProyectoG4\\imagenes\\Peliculas\\02.VidaBrian.png"));
		btn_2_vidaBrian.setBounds(410, 165, 150, 200);
		
		contentPane.add(btn_2_vidaBrian);
		btn_2_aterriza.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_2_aterriza.setEnabled(false);
		btn_2_aterriza.setVisible(false);
		btn_2_aterriza.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_2_aterriza.setIcon(new ImageIcon("C:\\unaiworkspace\\Grupo4\\ProyectoG4\\imagenes\\Peliculas\\02.Aterriza.png"));
		btn_2_aterriza.setBounds(590, 165, 150, 200);
		
		contentPane.add(btn_2_aterriza);
		btn_3_psicosis.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_3_psicosis.setEnabled(false);
		btn_3_psicosis.setVisible(false);
		btn_3_psicosis.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_3_psicosis.setIcon(new ImageIcon("C:\\unaiworkspace\\Grupo4\\ProyectoG4\\imagenes\\Peliculas\\03.Psicosis.png"));
		btn_3_psicosis.setBounds(50, 165, 150, 200);
		
		contentPane.add(btn_3_psicosis);
		btn_3_resplandor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_3_resplandor.setEnabled(false);
		btn_3_resplandor.setVisible(false);
		btn_3_resplandor.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_3_resplandor.setIcon(new ImageIcon("C:\\unaiworkspace\\Grupo4\\ProyectoG4\\imagenes\\Peliculas\\03.Resplandor.png"));
		btn_3_resplandor.setBounds(230, 165, 150, 200);
		
		contentPane.add(btn_3_resplandor);
		btn_3_dracula.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_3_dracula.setEnabled(false);
		btn_3_dracula.setVisible(false);
		btn_3_dracula.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_3_dracula.setIcon(new ImageIcon("C:\\unaiworkspace\\Grupo4\\ProyectoG4\\imagenes\\Peliculas\\03.Dracula.png"));
		btn_3_dracula.setBounds(410, 165, 150, 200);
		
		contentPane.add(btn_3_dracula);
		btn_3_cisne.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_3_cisne.setEnabled(false);
		btn_3_cisne.setVisible(false);
		btn_3_cisne.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_3_cisne.setIcon(new ImageIcon("C:\\unaiworkspace\\Grupo4\\ProyectoG4\\imagenes\\Peliculas\\03.CisneNegro.png"));
		btn_3_cisne.setBounds(590, 165, 150, 200);
		
		contentPane.add(btn_3_cisne);
	}
}
