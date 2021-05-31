package persona;

public class Jugador extends Persona {
	private String club;
	private String dorsal;
	private String posicion;
	private boolean pasar;
	private boolean eludir;
	private boolean patear;
	
	public Jugador(String nombre, String apellido, String documento, boolean caminar, boolean correr, boolean frenar,
			String club, String dorsal, String posicion, boolean pasar, boolean eludir, boolean patear) {
		super(nombre, apellido, documento, caminar, correr, frenar);
		this.club = club;
		this.dorsal = dorsal;
		this.posicion = posicion;
		this.pasar = pasar;
		this.eludir = eludir;
		this.patear = patear;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public String getDorsal() {
		return dorsal;
	}

	public void setDorsal(String dorsal) {
		this.dorsal = dorsal;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public boolean isPasar() {
		return pasar;
	}

	public void setPasar(boolean pasar) {
		this.pasar = pasar;
	}

	public boolean isEludir() {
		return eludir;
	}

	public void setEludir(boolean eludir) {
		this.eludir = eludir;
	}

	public boolean isPatear() {
		return patear;
	}

	public void setPatear(boolean patear) {
		this.patear = patear;
	}
	
	

}
