package interfaz;

import java.util.Scanner;

import dominio.Libro;
import repositorio.Biblioteca;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Biblioteca biblioteca = new Biblioteca();
		Libro libro;
		System.out.println("Ingrese el titulo del libro: ");
		String titulo = sc.next();
		System.out.println("Ingrese la abreviatura: ");
		String abreviatura = sc.next();
		System.out.println("Ingrese el genero: ");
		String genero = sc.next();
		System.out.println("Ingrese el autor");
		String autor = sc.next();
		libro = new Libro(titulo, abreviatura, genero, autor);
		
		
		biblioteca.agregarLibro(libro);
		biblioteca.mostrarLibros();
		
		
	}

}
