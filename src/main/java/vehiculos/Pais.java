package vehiculos;
import java.util.*;

public class Pais {
	
	private String nombre;
	protected int VecesPais;
	private static Pais elegido;
	protected static List<Pais> listado = new ArrayList<>();
	
	public Pais(String nombre) {
		this.nombre=nombre;
		listado.add(this);
	}
	
	public int getCantidadVeces() {
		return VecesPais;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public static Pais paisMasVendedor() {
		for(int i=0; i<(Pais.listado.size())-1;i++ ) {
			Pais MasVendido1=Pais.listado.get(0);
			Pais Masvendido2=Pais.listado.get(i+1);
			if (MasVendido1.getCantidadVeces()<Masvendido2.getCantidadVeces()) {
				elegido=Masvendido2;
			}
			else {
				elegido=MasVendido1;
			}
		}
		return elegido;
	}
}