package vehiculos;
import java.util.ArrayList;

public class Automovil extends Vehiculo{
	
	protected int puestos;
	protected static ArrayList<Automovil> listado = new ArrayList<Automovil>();
	
	
	public Automovil(String plate, int doors, int speed, String name, int precio, int peso, String traction, String maker, int position) {
		super(plate, doors, speed, name, precio, peso, traction, maker);
		this.puestos = position;
		Automovil.listado.add(this);
		}
	
	public Automovil(String plate, String name, int precio, int peso, String maker, int position) {
		this(plate, 4, 100, name, precio, peso, "FWD", maker, position);
	}
	
	public Automovil() {
		this(null, null, 0, 0, null, 0);
	}
	
	public static int cantidadAutomoviles() {
		return Automovil.listado.size();
	}
	
	public int getPuestos() {
		return puestos;
	}
	
	public static Array<Automovil> getListado(){
		return listado;
	}
	
	public void setPuestos(int position) {
		this.puestos = position;
	}

	public static void setListado(Array<Automovil> list) {
		Automovil.listado = list;
	}
}
