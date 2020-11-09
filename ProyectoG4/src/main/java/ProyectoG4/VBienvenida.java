package ProyectoG4;

	import java.util.Timer;
	import java.util.TimerTask;
	import javax.swing.*;
import java.awt.Color;
import java.awt.Toolkit;

	public class VBienvenida extends JFrame {
	    /**
		 * 
		 */
		
	private static final long serialVersionUID = 1L;
		
	private JLabel bienvenido,bienvenido2,cinecss,text/*,logo*/;
	   
	    public VBienvenida(){
	    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\eclipse-workspace\\Grupo4\\ProyectoG4\\imagenes\\Logo.png"));
	    	setTitle("Bienvenida");



	        
	       Timer cronom=new Timer();
	        cronom.schedule(new TimerTask(){
	            
	        public void run(){    
	        	VLogin.tempologin=new VLogin();
	        	VLogin.tempologin.setVisible(true);
	        	VLogin.tempologin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            dispose();
	        }},3000);


	    	initGUI();
	    }
	    private void initGUI() {
	    	getContentPane().setBackground(new Color (156, 196, 236));
	    	
	    	getContentPane().setLayout(null);
	    	
	    	 bienvenido=new JLabel("¡Bienvenido/a!");
	    	bienvenido.setBounds(258,171,345,60);
	    	bienvenido.setFont(bienvenido.getFont().deriveFont(50f));
	    	getContentPane().add(bienvenido);
	    	
	        bienvenido2=new JLabel("app diseñada para");
	    	bienvenido2.setBounds(267,259,254,60);
	    	bienvenido2.setFont(bienvenido2.getFont().deriveFont(30f));
	    	getContentPane().add(bienvenido2);
	    	
	        cinecss=new JLabel("CINES CSS");
	    	cinecss.setBounds(323,319,157,60);
	    	cinecss.setFont(cinecss.getFont().deriveFont(30f));
	    	getContentPane().add(cinecss);
	    	
	    	text=new JLabel("A continuación podrás elegir la cartelera del próximo fin de semana");
	    	text.setBounds(340,492,445,60);
	    	text.setFont(text.getFont().deriveFont(15f));
	    	getContentPane().add(text);
	    	
	    	JLabel lblNewLabel = new JLabel("");
	    	lblNewLabel.setIcon(new ImageIcon("C:\\eclipse-workspace\\Grupo4\\ProyectoG4\\imagenes\\Logo.png"));
	    	lblNewLabel.setBounds(32, 27, 94, 143);
	    	getContentPane().add(lblNewLabel);
	    	
	    		        
	    		       Timer cronom=new Timer();
	    	cronom.schedule(new TimerTask(){
	    	    
	    	public void run(){    
	    		VLogin.tempologin=new VLogin();
	    		VLogin.tempologin.setVisible(true);
	    		VLogin.tempologin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	    dispose();
	    	}},3000);
	    }

	   
	    public static void main(String[] ar){
	       
	    	VBienvenida inicio=new VBienvenida();
	    	
	    	inicio.setVisible(true);
	    	inicio.setTitle("Bienvenido");
	         
	         
	    }
	}