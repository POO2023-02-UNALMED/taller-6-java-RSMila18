package vehiculos;

public class Vehiculo {
	
	private String placa;
	private int puertas;
	private int Velocidad;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	private static  int cantidadVehiculos;
	
	
	public Vehiculo(String placa,int puertas,int velocidad,String nombre, int precio, int peso,  String traccion, Fabricante fabricante){
		this.placa=placa;
		this.puertas=puertas;
		this.Velocidad= velocidad;
		this.nombre=nombre;
		this.precio=precio;
		this.peso=peso;
		this.traccion=traccion;
		this.fabricante=fabricante;
		cantidadVehiculos++;

		this.fabricante.vecesFabricante++;
		this.fabricante.pais.VecesPais++;
	}
	
	public String getPlaca() {
		return placa;
	}

    public void setPlaca(String placa) {
    	this.placa = placa;
    }
    
    public int getPuertas() {
    	return puertas;
    }

    public void setPuertas(int puertas) {
    	this.puertas = puertas;
    }
	    
    public int getVelocidadMaxima() {
    	return Velocidad;
    }

    public void setVelocidadMaxima(int Velocidad) {
    	this.Velocidad = Velocidad;
    }
  
    public String getNombre() {
    	return nombre;
    }

    public void setNombre(String nombre) {
    	this.nombre = nombre;
	}
	
    public int getPrecio() {
    	return precio;
    }

    public void setPrecio(int precio) {
    	this.precio = precio;
    }
	    
    public int getPeso() {
    	return peso;
    }

    public void setPeso(int peso) {
    	this.peso = peso;
    }
    
    public String getTraccion() {
    	return traccion;
    }
    
    public void setTraccion(String traccion) {
    	this.traccion = traccion;
    }
    
    public Fabricante getFabricante() {
    	return fabricante;
    }
    
    public void setFabricante(Fabricante fabricante) {
    	this.fabricante = fabricante;
    }
    
	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	
	public static void setCantidadVehiculos(int cant) {
		cantidadVehiculos=cant;	
	}
	    
	public static  String  vehiculoPOrTipo() {
		String text = "Automoviles: " + Automovil.getNumeroAutomovil() + "\nCamionetas: " + Camioneta.getNumeroCamioneta() + "\nCamiones: " + Camion.getNumeroCamion();
		return text;
	}
}
