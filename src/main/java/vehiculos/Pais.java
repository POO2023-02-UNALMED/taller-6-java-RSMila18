package vehiculos;

public class Pais {
private String nombre;
	
	public Pais(String name) {
		this.nombre = name;
	}
	
	public Pais() {
		this(null)
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String name) {
		this.nombre = name;
	}

}
