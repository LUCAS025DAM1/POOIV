package messidios;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class nashee {

	public static void main(String[] args) {
		ArrayList<Contacto> agenda = new ArrayList<>();

        while (true) {
            // Menú de opciones
            String opcion = JOptionPane.showInputDialog(
                    "Seleccione una opción:\n" +
                            "1. Añadir contacto\n" +
                            "2. Buscar contacto\n" +
                            "3. Mostrar contactos\n" +
                            "4. Salir");

            switch (opcion) {
                case "1":
                    // Añadir contacto
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del contacto:");
                    String telefono = JOptionPane.showInputDialog("Ingrese el número de teléfono del contacto:");
                    String email = JOptionPane.showInputDialog("Ingrese la dirección de email del contacto:");

                    Contacto nuevoContacto = new Contacto(nombre, telefono, email);
                    agenda.add(nuevoContacto);

                    JOptionPane.showMessageDialog(null, "Contacto añadido con éxito.");
                    break;

                case "2":
                    // Buscar contacto
                    String buscarNombre = JOptionPane.showInputDialog("Ingrese el nombre del contacto a buscar:");
                    boolean encontrado = false;

                    for (Contacto contacto : agenda) {
                        if (contacto.getNombre().equalsIgnoreCase(buscarNombre)) {
                            JOptionPane.showMessageDialog(null, "Contacto encontrado:\n" +
                                    "Nombre: " + contacto.getNombre() +
                                    "\nTeléfono: " + contacto.getTelefono() +
                                    "\nEmail: " + contacto.getEmail());
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        JOptionPane.showMessageDialog(null, "Contacto no encontrado.");
                    }
                    break;

                case "3":
                    // Mostrar contactos
                    StringBuilder listaContactos = new StringBuilder("Lista de Contactos:\n");

                    for (Contacto contacto : agenda) {
                        listaContactos.append("Nombre: ").append(contacto.getNombre()).append("\n")
                                .append("Teléfono: ").append(contacto.getTelefono()).append("\n")
                                .append("Email: ").append(contacto.getEmail()).append("\n\n");
                    }

                    JOptionPane.showMessageDialog(null, listaContactos.toString());
                    break;

                case "4":
                    // Salir del programa
                    JOptionPane.showMessageDialog(null, "Gracias por usar la Agenda de Contactos. ¡Hasta luego!");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
	
