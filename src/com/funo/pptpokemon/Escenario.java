package com.funo.pptpokemon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Escenario {

	LinkedList<Entrenador> entrenadores;

	public Escenario() {
		
		entrenadores = new LinkedList<Entrenador>();
		entrenadores.add(new Entrenador("Red", Pokemon.Mudkip,
				Pokemon.Cyndaquil, Pokemon.Bulbasaur,R.drawable.red));
		entrenadores.add(new Entrenador("Green", Pokemon.Totodile,
				Pokemon.Charmander, Pokemon.Treecko, R.drawable.green));
		entrenadores.add(new Entrenador("Blue", Pokemon.Squirtle,
				Pokemon.Torchic, Pokemon.Chikorita, R.drawable.blue));
	}

	public void batalla(Entrenador jugador, Entrenador rival)
			throws NumberFormatException, IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println(jugador.toString());
		System.out.println(rival.toString());

		while (jugador.sigue() && rival.sigue()) {
			System.out.println("Elige pokemon");
			System.out.println("1. " + jugador.getEquipo().get(0).getNombre()
					+ "\n 2. " + jugador.getEquipo().get(1).getNombre()
					+ "\n 3. " + jugador.getEquipo().get(2).getNombre());
			Pokemon pokemon = jugador.getEquipo().get(
					Integer.parseInt(br.readLine()) - 1);
			Pokemon oponente = rival.enviar();
			System.out.println(pokemon.getNombre() + " vs "
					+ oponente.getNombre());

			if (pokemon.luchar(oponente)) {
				System.out.println(jugador.toString());
				System.out.println(rival.toString());
			} else {
				System.out.println("Tu pokemon est� debilitado");
			}
		}
		if (jugador.sigue())
			System.out.println("Has ganado");
		else
			System.out.println("Tu rival ha ganado");

		Pokemon.centroPokemon();
	}

	public LinkedList<Entrenador> getEntrenadores() {
		return entrenadores;
	}

}
