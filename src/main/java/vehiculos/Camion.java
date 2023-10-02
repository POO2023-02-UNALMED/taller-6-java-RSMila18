package vehiculos;
import java.util.ArrayList;

public class Camion extends Vehiculo{
	
	protected int ejes;
	protected static ArrayList<Camion> listado = new ArrayList<Camion>();
	
	public Camion(String plate, int doors, int speed, String name, int precio, int peso, String traction, String maker, int axles) {
			super(plate, doors, speed, name, precio, peso, traction, maker);
			this.ejes = axles;
			Camion.listado.add(this);
	}
	
	public Camion(String plate, String name, int precio, int peso, String maker, int axles) {
		this(plate, 2, 80, name, precio, peso, "4X2", maker, axles);
	}
	
	public Camion() {
		this(null, null, 0, 0, null, 0);
	}
	
	public static int cantidadCamiones() {
		return Camion.listado.size();
	}
	
	public int getEjes() {
		return ejes;
	}
	
	public static Array<Camion> getListado(){
		return listado;
	}
	
	public void setEjes(int axles) {
		this.ejes = axles;
	}
	
	public static void setListado(Array<Camion> list) {
		Camion.listado = list;
	}
}
