package vehiculos;

public class Fabricante {
	
	private String nombre;
	private País pais;

	public Fabricante(String name, País country) {
		this.nombre = name;
		this.pais = country;
	}
	
	public Fabricante() {
		this(null, null);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public País getPais() {
		return pais;
	}
	
	public void setNombre(String name) {
		this.nombre = name;
	}
	
	public void setPais(País country) {
		this.pais = country;
	}
	
}
