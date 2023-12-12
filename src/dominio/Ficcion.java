package dominio;

public class Ficcion extends Libro implements IPrestable {

	boolean prestado;
	
	public Ficcion(String titulo, String abreviatura, String genero, String autor) {
		super(titulo, abreviatura, genero, autor);
		this.prestado = false;
	}

	@Override
	public void prestar() {
		if(!prestado) {
			prestado = true;
		} else {
			prestado = false;
		}
	}

	@Override
	public void devolver() {
		if(prestado) {
			prestado = false;
		} else {
			prestado = true;
		}
		
	}

	@Override
	public boolean estaPrestado() {
		return prestado;
	}
	
	

}
