package ProyectoG4;
import java.util.Scanner;
public class Resta {
	public static void main(String[] args){

	      int resta = 0, numero1, numero2;

	      Scanner inputNumScanner = new Scanner(System.in);

	      System.out.println("Inserta el primer numero ");

	      numero1 = inputNumScanner.nextInt();

	      System.out.println("Inserta el segundo numero ");

	      numero2 = inputNumScanner.nextInt();

	       resta = numero1 - numero2;

	      System.out.println("La resta de tus dos numeros es  " + resta);

	    }

	}

