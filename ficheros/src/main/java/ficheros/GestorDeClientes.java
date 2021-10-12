package ficheros;

import lombok.Getter;
import lombok.Setter;

public class GestorDeClientes {
	@Getter
	@Setter
	private String separador = "#";

	@Getter
	@Setter
	private Fichero fi = null;

	public GestorDeClientes(Fichero fichero) {
		this.fi = fichero;
	}

	public GestorDeClientes(Fichero fichero, String separador) {
		this(fichero);
		this.separador = separador;
	}

	public void escribeClienteEnFichero(Cliente cliente) {
		String linea = "";
		for (String i : cliente.cogerInformacionCompleta()) {
			linea += i + this.separador;
		}
		fi.nuevaLinea(linea);
	}
}
