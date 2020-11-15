package ProyectoG4;

import java.util.ArrayList;

public class infoPelis {

	public static void main (String[] args) {
		ArrayList<listaGeneros> listaPelis = new ArrayList<listaGeneros>();
		listaPelis.add(new listaGeneros("Handia", 1, 1.56,false));
		listaPelis.add(new listaGeneros("La lista de Schindler", 1, 3.17,false));
		listaPelis.add(new listaGeneros("Cadena Perpetua", 1, 2.22,false));
		listaPelis.add(new listaGeneros("Million Dollar Baby", 1, 2.13,false));
		////////////////////////////////////////////////////////////////////////////////
		listaPelis.add(new listaGeneros("Scary movie", 2, 1.56,false));
		listaPelis.add(new listaGeneros("El gran Lebowsky", 2, 1.56,false));
		listaPelis.add(new listaGeneros("La vida de Brian", 2, 1.56,false));
		listaPelis.add(new listaGeneros("Aterriza como puedas", 2, 1.56,false));
		////////////////////////////////////////////////////////////////////////////////
		listaPelis.add(new listaGeneros("Psicosis", 3, 1.49,false));
		listaPelis.add(new listaGeneros("El resplandor", 3, 2.26,false));
		listaPelis.add(new listaGeneros("Dracula", 3, 2.35,false));
		listaPelis.add(new listaGeneros("Cisne negro", 3, 1.50,false));
		////////////////////////////////////////////////////////////////////////////////
		listaPelis.add(new listaGeneros("2001: Odisea en el espacio", 4, 2.22,false));
		listaPelis.add(new listaGeneros("La novia de Frankenstein", 4, 1.15,false));
		listaPelis.add(new listaGeneros("El planeta de los simios", 4, 1.55,false));
		listaPelis.add(new listaGeneros("Alien, el octavo pasajero", 4, 1.57,false));
		

	}

}

