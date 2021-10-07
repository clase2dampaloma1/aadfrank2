package ficheros;

public class Pruebas6a {

	public static void main(String[] args) {
		Fichero f1 = new Fichero("/home/frank/Documentos/ficheros/p5.txt");
		GestorDeObjetos g = new GestorDeObjetos(f1);
		Cliente c1 = new Cliente("11111111X");
		Cliente c2 = new Cliente("11111112X", "Pepe");
		Cliente c3 = new Cliente("11111113X", "Pepe", "Garcia");
		Cliente c4 = new Cliente("11111114X", "Pepe", "Garcia", "Perez");
		Cliente c5 = new Cliente("11111115X", "Pepe", "Garcia", "Perez", "32532352352");
		Cliente c6 = new Cliente("11111116X", "Pepe", "Garcia", "Perez", "6653234332352");
		Cliente[] todosLosClientes = { c1, c2, c3, c4, c5, c6 };
		for (Cliente cliente : todosLosClientes) {
			g.escribirObjeto(cliente);
		}
	}

}
