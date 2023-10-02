package vehiculos;
import java.util.ArrayList;

public class Camioneta extends Vehiculo{

	protected boolean volco;
	protected static ArrayList<Camioneta> listado = new ArrayList<Camioneta>();
		
	public Camioneta(String plate, int doors, int speed, String name, int precio, int peso, String traction, String maker, boolean overturn) {
		super(plate, doors, speed, name, precio, peso, traction, maker);
		this.volco = overturn;
		Camioneta.listado.add(this);
	}
		
	public Camioneta(String plate, int doors ,String name, int precio, int peso, String maker, boolean overturn) {
		this(plate, doors, 90, name, precio, peso, "4X4", maker, overturn);
	}
		
	public Camioneta() {
		this(null, 0, null, 0, 0, null, false);
	}
		
	public static int cantidadCamionetas() {
		return Camioneta.listado.size();
	}

	public boolean isVolco() {
		return volco;
	}
	
	public static Array<Camioneta> getListado(){
		return listado;
	}
		
	public void isVolco(boolean overturn) {
		this.volco = overturn;
	}
	
	public static void setListado(Array<Camioneta> list) {
		Camioneta.listado = list;
	}
}
