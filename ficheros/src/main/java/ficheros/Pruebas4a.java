package ficheros;

public class Pruebas4a {

	public static void main(String[] args) {
		Fichero f2 = new Fichero("/home/frank/Documentos/ficheros/p4.txt");
		for (int i = 1; i <= 20; i++) {
			f2.nuevaLinea("sssww" + i + " escrito con Fichero2");
		}
		System.out.println(f2.buscaPrimerElemento("swlshgqwlgw20"));
	}

}
