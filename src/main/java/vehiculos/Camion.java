package vehiculos;
import java.util.ArrayList;

public class Camion extends Vehículo{
	
	protected int ejes;
	protected static ArrayList<Camion> listado = new ArrayList<Camion>();
	
	public Camion(String plate, int doors, double speed, String name, double precio, double peso, String traction, String maker, int axles) {
			super(plate, doors, speed, name, precio, peso, traction, maker);
			this.ejes = axles;
			Camion.listado.add(this);
	}
	
	public Camion(String plate, String name, double precio, double peso, String maker, int axles) {
		this(plate, 2, 80, name, precio, peso, "4X2", maker, axles);
	}
	
	public Camion() {
		this(null, 2, 80, null, 0, 0, "4X2", null, null);
	}
	
	public static int cantidadCamiones() {
		return Camion.listado.size();
	}
	
	public int getEjes() {
		return ejes;
	}
	
	public void setEjes(int axles) {
		this.ejes = axles;
	}
	

}