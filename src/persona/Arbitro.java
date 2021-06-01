package persona;

public class Arbitro extends Persona{;
		private boolean foul;
		private boolean penal;
		private boolean offside;
		private boolean tarjetaAmarilla;
		private boolean tarjetaRoja;
		private boolean var;
		private boolean iniciarPartido;
		private boolean terminarPartido;
		
		public Arbitro(String nombre, String apellido, String documento, boolean caminar, boolean correr,
				boolean frenar, boolean foul, boolean penal, boolean offside, boolean tarjetaAmarilla,
				boolean tarjetaRoja, boolean var, boolean iniciarPartido, boolean terminarPartido) {
			super(nombre, apellido, documento, caminar, correr, frenar);
			this.setFoul(foul);
			this.setPenal(penal);
			this.setOffside(offside);
			this.setTarjetaAmarilla(tarjetaAmarilla);
			this.setTarjetaRoja(tarjetaRoja);
			this.setVar(var);
			this.setIniciarPartido(iniciarPartido);
			this.setTerminarPartido(terminarPartido);
		}

		public boolean isFoul() {
			return foul;
		}

		public void setFoul(boolean foul) {
			this.foul = foul;
		}

		public boolean isPenal() {
			return penal;
		}

		public void setPenal(boolean penal) {
			this.penal = penal;
		}

		public boolean isOffside() {
			return offside;
		}

		public void setOffside(boolean offside) {
			this.offside = offside;
		}

		public boolean isTarjetaAmarilla() {
			return tarjetaAmarilla;
		}

		public void setTarjetaAmarilla(boolean tarjetaAmarilla) {
			this.tarjetaAmarilla = tarjetaAmarilla;
		}

		public boolean isTarjetaRoja() {
			return tarjetaRoja;
		}

		public void setTarjetaRoja(boolean tarjetaRoja) {
			this.tarjetaRoja = tarjetaRoja;
		}

		public boolean isVar() {
			return var;
		}

		public void setVar(boolean var) {
			this.var = var;
		}

		public boolean isIniciarPartido() {
			return iniciarPartido;
		}

		public void setIniciarPartido(boolean iniciarPartido) {
			this.iniciarPartido = iniciarPartido;
		}

		public boolean isTerminarPartido() {
			return terminarPartido;
		}

		public void setTerminarPartido(boolean terminarPartido) {
			this.terminarPartido = terminarPartido;
		}
		
		

}
