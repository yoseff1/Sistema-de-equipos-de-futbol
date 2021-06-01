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
		this.setClub(club);
		this.setDorsal(dorsal);
		this.setPosicion(posicion);
		this.setPasar(pasar);
		this.setEludir(eludir);
		this.setPatear(patear);
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
	public void pase() {
		if(pasar == true) {
			System.out.println("el jugador pasa a su compañero");
		}else {
			System.out.println("el jugador se queda la pelota");
		}
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
	public void evade() {
		if(eludir == true) {
			System.out.println("el jugador evade a su contrincante");
		}else {
			System.out.println("el jugador pierde el balon");
		}
	}
	public void setEludir(boolean eludir) {
		this.eludir = eludir;
	}

	public boolean isPatear() {
		return patear;
	}
	
	public void disparo() {
		if(patear == true) {
			System.out.println("el jugador dispara al arco");
		}else {
			patear = true;
		}
	}
	public void setPatear(boolean patear) {
		this.patear = patear;
	}
	
	

}
