package vehiculos;
import java.util.ArrayList;

public class Automóvil extends Vehículo{
	
	protected int puestos;
	protected static ArrayList<Automóvil> listado = new ArrayList<Automóvil>();
	
	
	public Automóvil(String plate, int doors, double speed, String name, double precio, double peso, String traction, String maker, int position) {
		super(plate, doors, speed, name, precio, peso, traction, maker);
		this.puestos = position;
		Automóvil.listado.add(this);
	}
	
	public Automóvil(String plate, String name, double precio, double peso, String maker, int position) {
		this(plate, 4, 100, name, precio, peso, "FWD", maker, position);
	}
	
	public Automóvil() {
		this(null, 4, 100, null, 0, 0, "FWD", null, null);
	}
	
	public static int cantidadAutomoviles() {
        return Automóvil.listado.size();
    }
	
	public int getPuestos() {
		return puestos;
	}
	
	public void setPuestos(int position) {
		this.puestos = position;
	}
	
		
}
