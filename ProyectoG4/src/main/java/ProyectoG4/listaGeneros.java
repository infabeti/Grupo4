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

return "La película se llama: "+nombre+" Pertenece al genero: "+genero+" Duración: "+duracion;

}

public String dameGenero() {

return "La película se llama: "+nombre+" Pertenece al genero: "+genero+" Duración: "+duracion;

}


int genero;
int numPeli;
public String nombre;
int duracion;

}

