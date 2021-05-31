package persona;

public class Ctecnico extends Persona{
	private String club;
	private String posicion;
	private String traerAgua;
	private String traerPelota;
	private boolean masajear;
	
	public Ctecnico(String nombre, String apellido, String documento, boolean caminar, boolean correr, boolean frenar,
			String club, String posicion, String traerAgua, String traerPelota, boolean masajear) {
		super(nombre, apellido, documento, caminar, correr, frenar);
		this.club = club;
		this.posicion = posicion;
		this.traerAgua = traerAgua;
		this.traerPelota = traerPelota;
		this.masajear = masajear;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getTraerAgua() {
		return traerAgua;
	}

	public void setTraerAgua(String traerAgua) {
		this.traerAgua = traerAgua;
	}

	public String getTraerPelota() {
		return traerPelota;
	}

	public void setTraerPelota(String traerPelota) {
		this.traerPelota = traerPelota;
	}

	public boolean isMasajear() {
		return masajear;
	}

	public void setMasajear(boolean masajear) {
		this.masajear = masajear;
	}
	
	

}
