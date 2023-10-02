package vehiculos;

public class Vehículo {
	
	protected String placa;
	protected int puertas;
	protected int velocidadMaxima;
	protected String nombre;
	protected double precio;
	protected double peso;
	protected String traccion;
	protected Fabricante fabricante;
	protected static int CantidadVehiculos;
	
	public Vehículo(String plate, int doors, double speed, String name, double precio, double peso, String traction, String maker) {
		this.placa = plate;
		this.puertas = doors;
		this.velocidadMaxima = speed;
		this.nombre = name;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traction;
		this.fabricante = maker;
		CantidadVehiculos++;
	}
	
	public Vehículo() {CantidadVehiculos++;}
	
	public String vehiculosPorTipo() {
		return "Automoviles: " + Automóvil.cantidadAutomoviles() + "\n"
				"Camionetas: " + Camioneta.cantidadCamionetas() + "\n"
				"Camiones: " + Camion.cantidadCamiones();
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public int getPuertas() {
		return puertas;
	}
	
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public String getTraccion() {
		return traccion;
	}
	
	public Fabricante getFabricante() {
		return fabricante;
	}
	
	public void setPlaca(String plate) {
		this.placa = plate;
	}
	
	public void setPuertas(int doors) {
		this.puertas = doors;
	}
	
	public void setVelocidadMaxima(int speed) {
		this.velocidadMaxima = speed;
	}
	
	public void setNombre(String name) {
		this.nombre = name;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void setTraccion(String traction) {
		this.traccion = traction;
	}
	
	public void setFabricante(Fabricante maker) {
		this.fabricante = maker;
	}
	
	
}