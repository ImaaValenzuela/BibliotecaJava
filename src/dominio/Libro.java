package dominio;

public class Libro {
	
	// Atributos 
	private int id = 1;
	private String titulo;
	private String abreviatura;
	private String genero;
	private String autor;

	
	// Constructor
	public Libro(String titulo, String abreviatura, String genero, String autor) {
		this.titulo = titulo;
		this.abreviatura = abreviatura;
		this.genero = genero;
		this.autor = autor;
		id++;
	}


	// Getters & Setters
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAbreviatura() {
		return abreviatura;
	}


	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	// ToString
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", abreviatura=" + abreviatura + ", genero=" + genero + ", autor=" + autor
				+ "]";
	}
	
	
	
	
	
	
	
}
