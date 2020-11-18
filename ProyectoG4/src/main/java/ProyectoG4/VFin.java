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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class VFin extends JFrame {

	private JPanel contentPane;
	private final JLabel lblCarteleraActualizada = new JLabel("La cartelera se ha \r\n");
	private final JButton btnCancelar = new JButton("Volver");
	private final JLabel lblNube = new JLabel("");
	private final JLabel lblLOGO = new JLabel("New label");

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(VFin.class.getResource("/iconos/cineCSS.png")));
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
		lblCarteleraActualizada.setFont(new Font("SimSun", Font.PLAIN, 30));
		lblCarteleraActualizada.setBounds(10, 95, 414, 38);
		
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
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCancelar.setBounds(335, 227, 89, 23);
		
		contentPane.add(btnCancelar);
		lblLOGO.setIcon(new ImageIcon(VFin.class.getResource("/iconos/cineCSS.png")));
		lblLOGO.setBounds(10, 5, 90, 92);
		
		contentPane.add(lblLOGO);
		
		JLabel lblActualizado = new JLabel("actualizado");
		lblActualizado.setHorizontalAlignment(SwingConstants.CENTER);
		lblActualizado.setFont(new Font("SimSun", Font.PLAIN, 30));
		lblActualizado.setBounds(10, 144, 414, 38);
		contentPane.add(lblActualizado);
		lblNube.setIcon(new ImageIcon(VFin.class.getResource("/iconos/nube.png")));
		lblNube.setBounds(72, -38, 362, 239);
		
		contentPane.add(lblNube);
	}
}
