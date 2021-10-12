package ficheros;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

public class Cliente {

	@Getter
	@Setter
	private String dni;
	@Getter
	@Setter
	private String nombre;
	@Getter
	@Setter
	private String apellido1;
	@Getter
	@Setter
	private String apellido2;
	@Getter
	@Setter
	private String numeroDeTelefono;

	public Cliente(String dni) {
		super();
		this.dni = dni;
	}

	public Cliente(String dni, String nombre) {
		this(dni);
		this.nombre = nombre;
	}

	public Cliente(String dni, String nombre, String apellido1) {
		this(dni, nombre);
		this.apellido1 = apellido1;
	}

	public Cliente(String dni, String nombre, String apellido1, String apellido2) {
		this(dni, nombre, apellido1);
		this.apellido2 = apellido2;
	}

	public Cliente(String dni, String nombre, String apellido1, String apellido2, String numeroDeTelefono) {
		this(dni, nombre, apellido1, apellido2);
		this.numeroDeTelefono = numeroDeTelefono;
	}
	
	/**
	 * Devuelve informacion completa de un cliente como atributos en array.
	 * @return
	 */

	public String[] cogerInformacionCompleta() {
		ArrayList<String> entrada = new ArrayList<String>();
		String[] linea;
		entrada.add(this.dni); //siempre DNI, clave primaria nunca nula
		if (this.nombre != null) { //otros campos solo se añaden si tienen valor asignado
			entrada.add(this.nombre);
		}
		if (this.apellido1 != null) {
			entrada.add(this.apellido1);
		}
		if (this.apellido2 != null) {
			entrada.add(this.apellido2);
		}
		if (this.numeroDeTelefono != null) {
			entrada.add(this.numeroDeTelefono);
		}
		linea = new String[entrada.size()]; // paso de ArrayList a array
		for (int i = 0; i < entrada.size(); i++) {
			linea[i] = entrada.get(i);
		}
		return linea;
	}

	/**
	 * Devuelve información reducida sobre el cliente, DNI
	 */
	@Override
	public String toString() { //no llamar
		return "Cliente con DNI: " + this.dni;
	}
}
