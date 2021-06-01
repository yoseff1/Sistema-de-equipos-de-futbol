package persona;

public class Persona {
	protected String nombre;
	protected String apellido;
	protected String documento;
	protected boolean caminar;
	protected boolean correr;
	protected boolean frenar;
	
	public Persona(String nombre, String apellido, String documento, boolean caminar, boolean correr, boolean frenar) {
		super();
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setDocumento(documento);
		this.setCaminar(caminar);
		this.setCorrer(correr);
		this.setFrenar(frenar);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombreCompleto() {
		return nombre + apellido;
	}

	public void setNombreCompleto(String nombre,String apellido) {
		this.apellido = apellido;
	}
	public String getDocumento() {
		return "DNI " + documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public boolean isCaminar() {
		return caminar;
	}

	public void setCaminar(boolean caminar) {
		this.caminar = caminar;
	}

	public boolean isCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}

	public boolean isFrenar() {
		return frenar;
	}

	public void setFrenar(boolean frenar) {
		this.frenar = frenar;
	}
	

}
