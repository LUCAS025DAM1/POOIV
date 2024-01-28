package EJERCICIOS;

public class Estudiante {
	private String nombree;
    private int edadd;
    private String gradoo;
    public Estudiante(String nombree, int edadd, String gradoo) {
        this.nombree = nombree;
        this.edadd = edadd;
        this.gradoo = gradoo;
    }
 
    public String getNombre() {
        return nombree;
    }

    public void setNombre(String nombre) {
        this.nombree = nombre;
    }
    public int getEdad() {
        return edadd;
    }

    public void setEdad(int edad) {
        this.edadd = edad;
    }

    public String getGrado() {
        return gradoo;
    }

    public void setGrado(String grado) {
        this.gradoo = grado;
    }
}


