package persona;

public class Dtecnico extends Persona{
	private String club;
	private String ordenes;
	private int cambios = 3;
	private boolean insultarArbitro;
	
	public Dtecnico(String nombre, String apellido, String documento, boolean caminar, boolean correr, boolean frenar,
			String club, String ordenes, int cambios, boolean insultarArbitro) {
		super(nombre, apellido, documento, caminar, correr, frenar);
		this.setClub(club);
		this.setOrdenes(ordenes);
		this.setCambios(cambios);
		this.setInsultarArbitro(insultarArbitro);
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	public String getOrdenes() {
		return ordenes;
	}
	public void setOrdenes(String ordenes) {
		this.ordenes = ordenes;
	}
	public int getCambios() {
		return cambios;
	}
	public void setCambios(int cambios) {
		this.cambios = cambios;
	}	
	public void cambio() {
			switch(cambios) {
			default:
				System.out.println("quedan 3 cambios");
				break;
			case 2:
				System.out.println("quedan 2 cambios");
				break;
			case 1:
				System.out.println("queda un cambio");
				break;
			case 0:
				System.out.println("no quedan cambios");
				break;
			}
	}
	public boolean isInsultarArbitro() {
		return insultarArbitro;
	}
	public void setInsultarArbitro(boolean insultarArbitro) {
		this.insultarArbitro = insultarArbitro;
	}
	public void insulto() {
		if(insultarArbitro == true) {
			System.out.println("el DT insulta al arbitro");
		}else {
			System.out.println("el DT se queda callado");
		}
	}
}
