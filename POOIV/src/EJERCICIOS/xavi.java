package EJERCICIOS;

import javax.swing.JOptionPane;

public class xavi {

	public static void main(String[] args) {
		 Estudiante[] estudiantes = new Estudiante[3];
           for (int i = 0; i < estudiantes.length; i++) {
	            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante " + (i + 1) + ":");
	            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante " + (i + 1) + ":"));
	            String grado = JOptionPane.showInputDialog("Ingrese el grado del estudiante " + (i + 1) + ":");

	            estudiantes[i] = new Estudiante(nombre, edad, grado);
	        }
	        for (Estudiante estudiante : estudiantes) {
	            JOptionPane.showMessageDialog(null, "Nombre: " + estudiante.getNombre() +
	                    "\nEdad: " + estudiante.getEdad() +
	                    "\nGrado: " + estudiante.getGrado());
	        }
	    }
	}

	
