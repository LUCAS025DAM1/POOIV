package xavitequiero;

public class Empleado {
	 private String nombre;
	    private int horasTrabajadas;
	    private double tarifaPorHora;
	    public Empleado(String nombre, int horasTrabajadas, double tarifaPorHora) {
	        this.nombre = nombre;
	        this.horasTrabajadas = horasTrabajadas;
	        this.tarifaPorHora = tarifaPorHora;
	    }
	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public int getHorasTrabajadas() {
	        return horasTrabajadas;
	    }

	    public void setHorasTrabajadas(int horasTrabajadas) {
	        this.horasTrabajadas = horasTrabajadas;
	    }

	    public double getTarifaPorHora() {
	        return tarifaPorHora;
	    }

	    public void setTarifaPorHora(double tarifaPorHora) {
	        this.tarifaPorHora = tarifaPorHora;
	    }
	    public double calcularSalario() {
	        return horasTrabajadas * tarifaPorHora;
	    }
	}


