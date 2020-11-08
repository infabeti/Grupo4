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

public class VLogin extends JFrame {
//Ventana I�aki
	//	static Login tempologin;
	
	private JPanel contentPane;
	private JTextField textFieldUsuario;
	private JLabel lblPassword;
	private JPasswordField passwordField;
	private JLabel lblLogo;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\eclipse-workspace\\Grupo4\\ProyectoG4\\imagenes\\Logo.png"));
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color (156, 196, 236));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBackground(Color.BLACK);
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setBounds(110, 78, 90, 14);
		contentPane.add(lblUsuario);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(200, 75, 86, 20);
		contentPane.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		lblPassword = new JLabel("Contrase\u00F1a:");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBackground(Color.BLACK);
		lblPassword.setBounds(100, 109, 90, 14);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(200, 106, 86, 20);
		contentPane.add(passwordField);
		
		lblLogo = new JLabel((String) null);
		lblLogo.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo4\\ProyectoG4\\imagenes\\Logo.png"));
		lblLogo.setBounds(344, 0, 90, 91);
		contentPane.add(lblLogo);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Usuario="aitor";
				String Contrasena="123";
				
				String Pass=new String(passwordField.getPassword());
				
				if (textFieldUsuario.getText().equals(Usuario) && passwordField.equals(Contrasena)) {
//					Si El field de usuario es igual al String Usuario y la contrase�a al String Contrasena
					
					//la vetana de generos
//					VGeneros Generos= new VGeneros();
//					Generos.setVisible(true);
//					dispose();
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Usuario o contrase�a incorrecta");
					
				}
			}
		});
		btnLogin.setBounds(197, 160, 89, 23);
		contentPane.add(btnLogin);
	}
}
