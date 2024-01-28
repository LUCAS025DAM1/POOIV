package hola;

import javax.swing.JOptionPane;

public class ejer4 {

	public static void main(String[] args) {
		 int numProductos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos en inventario:"));
	        Producto[] inventario = new Producto[numProductos];

	        for (int i = 0; i < inventario.length; i++) {
	            String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto " + (i + 1) + ":");
	            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del producto " + (i + 1) + ":"));
	            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto " + (i + 1) + ":"));

	            // Crear una instancia de Producto y almacenarla en el inventario
	            inventario[i] = new Producto(nombreProducto, cantidad, precio);
	        }

	        // Mostrar un resumen del inventario
	        StringBuilder resumenInventario = new StringBuilder("Resumen del Inventario:\n");

	        for (Producto producto : inventario) {
	            resumenInventario.append("Nombre: ").append(producto.getNombreProducto()).append("\n")
	                            .append("Cantidad: ").append(producto.getCantidad()).append("\n")
	                            .append("Precio: $").append(producto.getPrecio()).append("\n\n");
	        }

	        JOptionPane.showMessageDialog(null, resumenInventario.toString());
	    }
	}
