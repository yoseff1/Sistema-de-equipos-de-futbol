package principal;

import persona.Arbitro;
import persona.Ctecnico;
import persona.Dtecnico;
import persona.Jugador;
import persona.Persona;

public class Principal {
	public static void main(String[] args) {
	 Jugador primerJugador = new Jugador ("Pedro", "Pascal", "23567432", false, false, false, "Atletico Mineiro", "15", "Delantero", false, false, false);
	 System.out.println(primerJugador);
			
	}

	public static void main1(String[] args) {
		 Dtecnico primerDirector = new Dtecnico ("Jorge", "Mendez", "54674543", false, false, false, "Atletico Mineiro", null, 3, false);
		 System.out.println(primerDirector);
				
		}
}
