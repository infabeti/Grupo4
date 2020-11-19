package ProyectoG4;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.Color;


import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.Color;


import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

class listaGeneros {

public listaGeneros(int genero, int numPeli, String nombre, int duracion) {


this.genero=genero;
this.numPeli=numPeli;
this.nombre=nombre;
this.duracion=duracion;



}

public String dameDatos() {

	return "La película se llama: "+nombre+" Pertenece al genero: "+genero+" Duración:  "+(duracion/60)+" h. " +(duracion%60)+" min.";

}

public String dameDuracion() {

	return (duracion/60)+" h. " +(duracion%60)+" min.";

}

public String dameTitulo() {

	return nombre;

}

public int minsDuracion() {
	
	return duracion ;
	
}

public String dameTiempoRestanteSabado() {
	
	return ((infoPelis.tiempoSabado-duracion)/60)+" h. "+ ((infoPelis.tiempoSabado-duracion)%60)+ " min." ;
	
}

public String dameTiempoRestanteDomingo() {
	
	return ((infoPelis.tiempoDomingo-duracion)/60)+" h. "+ ((infoPelis.tiempoDomingo-duracion)%60)+ " min." ;
	
}


public int genero;
public int numPeli;
public String nombre;
public int duracion;

}

