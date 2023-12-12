package repositorio;
import java.util.ArrayList;
import java.util.List;

import dominio.Libro;

public class Biblioteca {
	
	private List<Libro> listaLibros;
	
    public Biblioteca() {
        this.listaLibros = new ArrayList<>();
    }
	
	public void agregarLibro (Libro libro) {
		listaLibros.add(libro);
	}
	
	public void eliminarLibro(Libro libro) {}
	
	public void mostrarLibros() {
		if(!listaLibros.isEmpty()) {
            for (Libro libro : listaLibros) {
                System.out.println(libro);
            }
		}
	}
}
