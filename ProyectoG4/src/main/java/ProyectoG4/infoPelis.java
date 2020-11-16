package ProyectoG4;

import java.util.ArrayList;

import javax.swing.JList;

public class infoPelis {
	
	  static double  horaSabado=8, horaDomingo=6;
	  
	  
	public static void main (String[] args) {
		ArrayList<listaGeneros> listaPelis = new ArrayList<listaGeneros>();
		listaPelis.add(new listaGeneros("Handia", 1, 1.56));
		listaPelis.add(new listaGeneros("La lista de Schindler", 1, 3.17));
		listaPelis.add(new listaGeneros("Cadena Perpetua", 1, 2.22));
		listaPelis.add(new listaGeneros("Million Dollar Baby", 1, 2.13));
		////////////////////////////////////////////////////////////////////////////////
		listaPelis.add(new listaGeneros("Scary movie", 2, 1.30));
		listaPelis.add(new listaGeneros("El gran Lebowsky", 2, 1.59));
		listaPelis.add(new listaGeneros("La vida de Brian", 2, 1.34));
		listaPelis.add(new listaGeneros("Aterriza como puedas", 2, 1.28));
		////////////////////////////////////////////////////////////////////////////////
		listaPelis.add(new listaGeneros("Psicosis", 3, 1.49));
		listaPelis.add(new listaGeneros("El resplandor", 3, 2.26));
		listaPelis.add(new listaGeneros("Dracula", 3, 2.35));
		listaPelis.add(new listaGeneros("Cisne negro", 3, 1.50));
		////////////////////////////////////////////////////////////////////////////////
		listaPelis.add(new listaGeneros("2001: Odisea en el espacio", 4, 2.22));
		listaPelis.add(new listaGeneros("La novia de Frankenstein", 4, 1.15));
		listaPelis.add(new listaGeneros("El planeta de los simios", 4, 1.55));
		listaPelis.add(new listaGeneros("Alien, el octavo pasajero", 4, 1.57));
	   
		System.out.println("* Lista de todas las Películas *");
	       
	       for(int i=0;i<listaPelis.size();i++){
	            if(listaPelis.get(i).genero==1){
	            System.out.println(listaPelis.get(i).dameGenero());
	            }
	       }
	}
}

