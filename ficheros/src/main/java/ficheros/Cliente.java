package ficheros;

import lombok.Getter;
import lombok.Setter;

public class Cliente {
	@Getter
	@Setter
	private String separador="#";
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
	
	@Override
	public String toString() {
		String entrada="";
		entrada += this.dni;
		if (this.nombre != null) {
			entrada += separador + this.nombre;
		}
		if (this.apellido1 != null) {
			entrada += separador + this.apellido1;
		}
		if (this.apellido2 != null) {
			entrada += separador + this.apellido2;
		}
		if (this.numeroDeTelefono != null) {
			entrada += separador + this.numeroDeTelefono;
		}
		return entrada;
	}
}
