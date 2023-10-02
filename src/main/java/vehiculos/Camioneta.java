package vehiculos;
import java.util.ArrayList;

public class Camioneta extends Vehiculo{

	protected boolean volco;
	protected static ArrayList<Camioneta> listado = new ArrayList<Camioneta>();
		
	public Camioneta(String plate, int doors, double speed, String name, double precio, double peso, String traction, String maker, boolean overturn) {
		super(plate, doors, speed, name, precio, peso, traction, maker);
		this.volco = overturn;
		Camioneta.listado.add(this);
	}
		
	public Camioneta(String plate, int doors ,String name, double precio, double peso, String maker, boolean overturn) {
		this(plate, doors, 90, name, precio, peso, "4X4", maker, overturn);
	}
		
	public Camioneta() {
		this(null, 0, 90, null, 0, 0, "4X4", null, null);
	}
		
	public static int cantidadCamionetas() {
		return Camioneta.listado.size();
	}

	public boolean isVolco() {
		return volco;
	}
		
	public void isVolco(boolean overturn) {
		this.volco = overturn;
	}
}
