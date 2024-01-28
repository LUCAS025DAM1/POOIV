package viscabarca;

public class Curso {
	private String nombreCurso;
    private double calificacion;
    public String getNombreCurso() {
        return nombreCurso;
    }
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public String categorizarCalificacion() {
    	 int calificacionRedondeada = (int) Math.round(calificacion);
         switch (calificacionRedondeada) {
             case 10:
             case 9:
                 return "A";
             case 8:
                 return "B";
             case 7:
                 return "C";
             case 6:
                 return "D";
             default:
                 return "F";
         }
     }
 }

