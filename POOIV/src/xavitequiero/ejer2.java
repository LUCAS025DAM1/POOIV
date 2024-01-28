package xavitequiero;

import javax.swing.JOptionPane;

public class ejer2 {

	public static void main(String[] args) {
		 Empleado[] empleados = new Empleado[5];
           for (int i = 0; i < empleados.length; i++) {
	            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado " + (i + 1) + ":");
	            int horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas del empleado " + (i + 1) + ":"));
	            double tarifaPorHora = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tarifa por hora del empleado " + (i + 1) + ":"));

	            empleados[i] = new Empleado(nombre, horasTrabajadas, tarifaPorHora);
	        }
	        for (Empleado empleado : empleados) {
	            JOptionPane.showMessageDialog(null, "Nombre: " + empleado.getNombre() +
	                    "\nSalario: $" + empleado.calcularSalario());
	        }
	    }
	}

	
