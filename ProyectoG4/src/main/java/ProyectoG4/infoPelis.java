package ProyectoG4;

import java.util.ArrayList;

import javax.swing.JList;

public class infoPelis {
	static ArrayList<listaGeneros> listaPelis;
	
	  static int tiempoSabado=480, tiempoDomingo=360;
	  
	  
	infoPelis(){
		listaPelis = new ArrayList<listaGeneros>();
		listaPelis.add(new listaGeneros(1, 1, "Handia", 116));
		listaPelis.add(new listaGeneros(1, 2, "La lista de Schindler", 197));
		listaPelis.add(new listaGeneros(1, 3, "Cadena Perpetua",142));
		listaPelis.add(new listaGeneros(1, 4, "Million Dollar Baby", 133));
		////////////////////////////////////////////////////////////////////////////////
		listaPelis.add(new listaGeneros(2, 1, "Scary movie", 90));
		listaPelis.add(new listaGeneros(2, 2, "El gran Lebowsky", 119));
		listaPelis.add(new listaGeneros(2, 3, "La vida de Brian", 94));
		listaPelis.add(new listaGeneros(2, 4, "Aterriza como puedas", 88));
		////////////////////////////////////////////////////////////////////////////////
		listaPelis.add(new listaGeneros(3, 1, "Psicosis", 109));
		listaPelis.add(new listaGeneros(3, 2, "El resplandor", 146));
		listaPelis.add(new listaGeneros(3, 3, "Dracula", 155));
		listaPelis.add(new listaGeneros(3, 4, "Cisne negro", 110));
		////////////////////////////////////////////////////////////////////////////////
		listaPelis.add(new listaGeneros(4, 1, "2001: Odisea en el espacio", 142));
		listaPelis.add(new listaGeneros(4, 2, "La novia de Frankenstein", 75));
		listaPelis.add(new listaGeneros(4, 3, "El planeta de los simios", 115));
		listaPelis.add(new listaGeneros(4, 4, "Alien, el octavo pasajero", 117));    
	}
	public String tituloP (int igenero, int inumPeli) {
	       for(int i=0;i<listaPelis.size();i++){
	            if((listaPelis.get(i).genero==igenero) && (listaPelis.get(i).numPeli==inumPeli)){
	            	return(listaPelis.get(i).dameTitulo());
//	            	System.out.println(listaPelis.get(i).dameTiempoRestanteSabado());
	            
	            }
	       }
		return ("ERROR, NO HAY PELI");
	}
	public String duracionP (int igenero, int inumPeli) {
	       for(int i=0;i<listaPelis.size();i++){
	            if((listaPelis.get(i).genero==igenero) && (listaPelis.get(i).numPeli==inumPeli)){
	            	return(listaPelis.get(i).dameDuracion());
//	            	System.out.println(listaPelis.get(i).dameTiempoRestanteSabado());
	            
	            }
	       }
		return ("ERROR, NO HAY PELI");
	}
	public String tiempoResSabado (int igenero, int inumPeli) {
	       for(int i=0;i<listaPelis.size();i++){
	            if((listaPelis.get(i).genero==igenero) && (listaPelis.get(i).numPeli==inumPeli)){
	            	 String tiempoResSab = listaPelis.get(i).dameTiempoRestanteSabado();
	            	 tiempoSabado  = tiempoSabado -(listaPelis.get(i).minsDuracion());
	            	return tiempoResSab;
//	            	System.out.println(listaPelis.get(i).dameTiempoRestanteSabado());
	            	
	            }
	       } 
		return ("ERROR");
	}
	public String tiempoResDomingo (int igenero, int inumPeli) {
	       for(int i=0;i<listaPelis.size();i++){
	            if((listaPelis.get(i).genero==igenero) && (listaPelis.get(i).numPeli==inumPeli)){
	            	 String tiempoResDom = listaPelis.get(i).dameTiempoRestanteDomingo();
	            	 tiempoDomingo  = tiempoDomingo -(listaPelis.get(i).minsDuracion());
	            	return tiempoResDom;
//	            	System.out.println(listaPelis.get(i).dameTiempoRestanteSabado());
	            	
	            }
	       } 
		return ("ERROR");
	}
	private void getText(String string) {
		// TODO Auto-generated method stub
		
	}
}

