package ficheros;

public class GestorDeObjetos {

	private Fichero fi;
	
	public GestorDeObjetos(Fichero fi) {
		this.fi = fi;
	}
	
	public void escribirObjeto(Object objeto) {
		fi.nuevaLinea(objeto.toString());
	}
}
