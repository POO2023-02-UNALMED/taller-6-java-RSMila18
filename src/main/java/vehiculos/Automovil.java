package vehiculos;

public class Automovil extends Vehiculo{
	
	protected int puestos;
	protected static int CantidadAutomoviles;
	
	
	public Automovil(String plate, int doors, int speed, String name, int precio, int peso, String traction, String maker, int position) {
		super(plate, doors, speed, name, precio, peso, traction, maker);
		this.puestos = position;
		CantidadAutomoviles++;
		}
	
	public Automovil(String plate, String name, int precio, int peso, String maker, int position) {
		this(plate, 4, 100, name, precio, peso, "FWD", maker, position);
	}
	
	public Automovil() {
		this(null, null, 0, 0, null, 0);
	}
	
	public static  int  getCantidadAutomoviles(){
    	return CantidadAutomoviles;
    }
	
	public int getPuestos() {
		return puestos;
	}
	
	public void setPuestos(int position) {
		this.puestos = position;
	}
