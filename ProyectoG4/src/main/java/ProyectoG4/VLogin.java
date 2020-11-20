package ProyectoG4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class VLogin extends JFrame {
//Ventana Iñaki
	static VLogin tempologin;
	
	private JPanel contentPane;
	private JTextField textFieldUsuario;
	private JLabel lblPassword;
	private JPasswordField passwordField;
	private JLabel lblLogo;
	private final JButton btnCancelar = new JButton("Cancelar");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VLogin frame = new VLogin();
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
	public VLogin() {
		initGUI();
	}
	private void initGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VLogin.class.getResource("/iconos/cineCSS.png")));
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color (156, 196, 236));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUsuario.setBackground(Color.BLACK);
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setBounds(110, 78, 90, 14);
		contentPane.add(lblUsuario);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(200, 75, 86, 20);
		contentPane.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		lblPassword = new JLabel("Contrase\u00F1a:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBackground(Color.BLACK);
		lblPassword.setBounds(100, 109, 90, 14);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(200, 106, 86, 20);
		contentPane.add(passwordField);
		
		lblLogo = new JLabel((String) null);
		lblLogo.setIcon(new ImageIcon(VLogin.class.getResource("/iconos/cineCSS.png")));
		lblLogo.setBounds(10, 5, 90, 92);
		contentPane.add(lblLogo);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(197, 160, 89, 23);
		contentPane.add(btnLogin);
		
		btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	btnLogin.setBackground(Color.GREEN);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	btnLogin.setBackground(Color.WHITE);
		    	btnLogin.setForeground(Color.BLACK);
		    }
		});
		btnLogin.addMouseListener(new MouseAdapter() {
	
			public void mouseClicked(MouseEvent e) {
				char clave[]=passwordField.getPassword();
				
				String clavedef=new String(clave);
				
				if (textFieldUsuario.getText().equals("admin") && clavedef.equals("admin")) {
//					Si El field de usuario es igual al String Usuario y la contraseña al String Contrasena
					
					//la vetana de generos
					VGeneros Generos= new VGeneros();
					Generos.setVisible(true);
					dispose();
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
					
				}
			}
		});
		
		btnCancelar.setBounds(335, 227, 89, 23);
		contentPane.add(btnCancelar);
		
		JLabel lbl_nube = new JLabel("");
		lbl_nube.setIcon(new ImageIcon(VLogin.class.getResource("/iconos/nube.png")));
		lbl_nube.setBounds(72, -38, 362, 239);
		contentPane.add(lbl_nube);
		
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
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//la vetana de Bienvenida
				VBienvenida Bienvenida= new VBienvenida();
				Bienvenida.setVisible(true);
				dispose();
				
			}
		});
	}
}