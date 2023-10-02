package vehiculos;
import java.util.List;
import java.util.ArrayList;

public class Fabricante {
	
	private String nombre;
	protected País pais;
	protected int countMaker;
	private static Fabricante makerWin;
	protected static List<Fabricante> winMaker = new ArrayList<>();
	

	public Fabricante(String name, País country) {
		this.nombre = name;
		this.pais = country;
		winMaker.add(this);
	}
	
	public Fabricante() {
		this(null, null);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public País getPais() {
		return pais;
	}
	
	public int getVecesFabricante() {
		return countMaker;
	}
	
	public void setNombre(String name) {
		this.nombre = name;
	}
	
	public void setPais(País country) {
		this.pais = country;
	}
	
	public static Fabricante fabricaMayorVentas() {
		for(int i = 0; i<(winMaker.size())-1; i++) {
			Fabricante MasVendido1 = winMaker.get(0);
			Fabricante MasVendido2 = winMaker.get(i+1);
			if (MasVendido1.getVecesFabricante() > MasVendido2.getVecesFabricante()) {
				makerWin = MasVendido1;
			}
			
			else {
				makerWin = MasVendido2;
			}
		}
		return makerWin;
	}
	
}
