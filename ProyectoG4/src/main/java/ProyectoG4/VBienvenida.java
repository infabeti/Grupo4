package ProyectoG4;

	import java.util.Timer;
	import java.util.TimerTask;
	import javax.swing.*;

	public class VBienvenida extends JFrame {
	    /**
		 * 
		 */
		
	private static final long serialVersionUID = 1L;
		
	private JLabel bienvenido,bienvenido2,cinecss,text/*,logo*/;
	   
	    public VBienvenida(){
	       
	    	setLayout(null);
	       
	        bienvenido=new JLabel("¡Bienvenido/a!");
	        bienvenido.setBounds(270,180,900,60);
	        bienvenido.setFont(bienvenido.getFont().deriveFont(50f));
	        add(bienvenido);
	             
	        bienvenido2=new JLabel("app diseñada para");
	        bienvenido2.setBounds(305,300,900,60);
	        bienvenido2.setFont(bienvenido2.getFont().deriveFont(30f));
	        add(bienvenido2);
	         
	        cinecss=new JLabel("CINES CSS");
	        cinecss.setBounds(350,350,900,60);
	        cinecss.setFont(cinecss.getFont().deriveFont(30f));
	        add(cinecss);
	        
	        text=new JLabel("A continuación podrás elegir la cartelera del próximo fin de semana");
	        text.setBounds(390,500,900,60);
	        text.setFont(text.getFont().deriveFont(15f));
	        add(text);
	       
	        /*logo = new JLabel();
	        ImageIcon Inter = new ImageIcon("../img/logo.png");
	        logo.setIcon(Inter);
	        logo.setBounds(250, 250, 500, 500);
	        add(logo);*/

	        
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
	    	inicio.setBounds(0,0,900,600);
	    	inicio.setVisible(true);
	    	inicio.setTitle("Bienvenido");
	         
	         
	    }
	   
	   
	}