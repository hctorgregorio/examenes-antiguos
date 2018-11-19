package modelo;

public class Libro {

	private int id;
	private String titulo;
	private float precio;
	
	public Libro(int id, String titulo, float precio) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.precio = precio;
	}

	public Libro() {
		super();
		this.id = 0;
		this.titulo = "ninguno";
		this.precio = 0.0f;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
}
