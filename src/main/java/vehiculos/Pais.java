package vehiculos;
import java.util.*;

public class Pais {
	
	protected String nombre;
	protected int countPais;
	private static Pais winCountry;
	protected static List<Pais> listado = new Arraylist<>();
	
	public Pais(String name) {
		this.nombre = name;
	}
	
	public Pais() {
		this(null);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getCantidadVeces() {
		return countPais;
	}
	
	public static Pais paisMasVendedor() {
		for(int i = 0; i < (Pais.listado.size())-1; i++) {
			Pais MasVendido1 = Pais.listado.get(0);
			Pais MasVendido2 = Pais.listado.get(i+1);
			if(MasVendido1.getCantidadVeces() < MasVendido2.getCantidadVeces()) {
				winCountry = MasVendido2;
			}
			else {
				winCountry = MasVendido1;
			}
		}
		return winCountry;
	}
}
