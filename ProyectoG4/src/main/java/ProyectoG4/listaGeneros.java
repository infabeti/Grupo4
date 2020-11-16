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

public listaGeneros(String nombre, int genero, double duracion) {

this.nombre=nombre;
this.genero=genero;
this.duracion=duracion;


}

public String dameDatos() {

return "La película se llama: "+nombre+" Pertenece al genero: "+genero+" Duración: "+duracion;

}

public String dameGenero() {

return "La película se llama: "+nombre+" Pertenece al genero: "+genero+" Duración:"+duracion;

}

public String nombre;
int genero;
private double duracion;

}

