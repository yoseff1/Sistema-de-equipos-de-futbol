package principal;

import persona.Arbitro;
import persona.Ctecnico;
import persona.Dtecnico;
import persona.Jugador;
import persona.Persona;

public class Principal {
	public static void main(String[] args) {
		Jugador primerJugador = new Jugador ("Pedro", "Pascal", "23567432", false, false, false, "Atletico Mineiro", "15", "Delantero", false, true, true);
		System.out.println(primerJugador.getNombre() + primerJugador.getApellido());
		System.out.println(primerJugador.getDocumento());
		System.out.println(primerJugador.getClub());
		System.out.println(primerJugador.getPosicion());		
		System.out.println(primerJugador.getDorsal());
		primerJugador.pase();
		primerJugador.evade();
		primerJugador.disparo();

		Dtecnico primerDirector = new Dtecnico ("Jorge", "Mendez", "54674543", false, false, false, "Atletico Mineiro", null, 3, false);
		System.out.println(primerDirector.getNombreCompleto());
		System.out.println(primerDirector.getDocumento());
		System.out.println(primerDirector.getClub());
		primerDirector.cambio();
		primerDirector.insulto();
	}
}
