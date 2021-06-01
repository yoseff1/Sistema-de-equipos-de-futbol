package persona;

public class Dtecnico extends Persona{
	private String club;
	private String ordenes;
	private int cambios = 3;
	private boolean insultarArbitro;
	
	public Dtecnico(String nombre, String apellido, String documento, boolean caminar, boolean correr, boolean frenar,
			String club, String ordenes, int cambios, boolean insultarArbitro) {
		super(nombre, apellido, documento, caminar, correr, frenar);
		this.club = club;
		this.ordenes = ordenes;
		this.cambios = cambios;
		this.insultarArbitro = insultarArbitro;
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
	public boolean isInsultarArbitro() {
		return insultarArbitro;
	}
	public void setInsultarArbitro(boolean insultarArbitro) {
		this.insultarArbitro = insultarArbitro;
	}
	
	

}
