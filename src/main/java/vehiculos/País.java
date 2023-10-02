package vehiculos;

public class País {
	
	private String nombre;
	
	public País(String name) {
		this.nombre = name;
	}
	
	public País() {
		this(null)
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String name) {
		this.nombre = name;
	}

}
