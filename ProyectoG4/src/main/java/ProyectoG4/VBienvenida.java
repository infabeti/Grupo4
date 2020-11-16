package ProyectoG4;



import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class VBienvenida extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
								
				try {
					VBienvenida frame = new VBienvenida();
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
	public VBienvenida() {
		
		Timer cronom=new Timer();
        cronom.schedule(new TimerTask(){
            
        public void run(){    
        	VLogin.tempologin=new VLogin();
        	VLogin.tempologin.setVisible(true);
        	VLogin.tempologin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();
        }},3000);
        
        
		setIconImage(Toolkit.getDefaultToolkit().getImage(VBienvenida.class.getResource("/iconos/cineCSS.png")));
		setTitle("Bienvenida");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color (156, 196, 236));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBienvenida = new JLabel("Bienvenido/a");
		lblBienvenida.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenida.setFont(new Font("Freestyle Script", Font.PLAIN, 70));
		lblBienvenida.setBounds(167, 116, 418, 83);
		contentPane.add(lblBienvenida);
		
		JLabel lblAppDiseñada = new JLabel("App dise\u00F1ada para");
		lblAppDiseñada.setHorizontalAlignment(SwingConstants.CENTER);
		lblAppDiseñada.setFont(new Font("Freestyle Script", Font.PLAIN, 45));
		lblAppDiseñada.setBounds(183, 222, 390, 64);
		contentPane.add(lblAppDiseñada);
		
		JLabel lblCineSS = new JLabel("Cine CSS");
		lblCineSS.setHorizontalAlignment(SwingConstants.CENTER);
		lblCineSS.setFont(new Font("Freestyle Script", Font.PLAIN, 40));
		lblCineSS.setBounds(270, 310, 222, 52);
		contentPane.add(lblCineSS);
		
		JLabel lblNube = new JLabel("");
		lblNube.setIcon(new ImageIcon(VBienvenida.class.getResource("/iconos/nube.png")));
		lblNube.setBounds(335, -15, 450, 245);
		contentPane.add(lblNube);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(VBienvenida.class.getResource("/iconos/cineCSS.png")));
		lblLogo.setBounds(10, 5, 90, 92);
		contentPane.add(lblLogo);
		
		JLabel lblNewLabel = new JLabel("A continuaci\u00F3n podr\u00E1s elegir la cartelera del pr\u00F3ximo fin de semana");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 483, 629, 28);
		contentPane.add(lblNewLabel);
	}
	

}