package ficheros;

public class Pruebas5a {

	public static void main(String[] args) {
		Fichero f2 = new Fichero("/home/frank/Documentos/ficheros/p5.txt");
		f2.nuevaLinea("Pepe#Perez#2222");
		f2.nuevaLinea("Pepe#Perez#2222");
		f2.nuevaLinea("Pepe#Lopez#2222");
		f2.nuevaLinea("Pepe#Perez#2222");
		System.out.println(f2.buscaRegistroPrimerElemento("Lopez", 5, "#"));
	}

}
