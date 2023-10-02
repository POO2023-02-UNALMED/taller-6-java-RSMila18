package vehiculos;
import java.util.List;
import java.util.ArrayList;

public class Fabricante {
	
	private String nombre;
	protected Pais pais;
	protected int vecesFabricante;
	private static Fabricante fabricanteElegido;
	protected  static List<Fabricante>elegidoFab=new ArrayList<>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre=nombre;
		this.pais=pais;
		elegidoFab.add(this);
	}
	
	public  Fabricante() {
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public Pais getPais() {
		return pais;
	}
	
	public void setPais(Pais pais) {
		this.pais=pais;
	}
	
	public int getVecesFabricante() {
		return vecesFabricante;
	}
	
	public static  Fabricante fabricaMayorVentas () {
		for(int i=0;i<(elegidoFab.size())-1; i++ ) {
			Fabricante MasVendido1=elegidoFab.get(0);
			Fabricante MasVendido2=elegidoFab.get(i+1);
			if (MasVendido1.getVecesFabricante()>MasVendido2.getVecesFabricante()) {
				fabricanteElegido=MasVendido1;
			}
			else {
				fabricanteElegido=MasVendido2;
			}
		}
		return fabricanteElegido;
	}
}
