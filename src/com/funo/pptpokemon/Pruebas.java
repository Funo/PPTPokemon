package com.funo.pptpokemon;

import java.util.LinkedList;
import java.io.*;

public class Pruebas {

	public static void main(String[] argv) throws IOException {
		Escenario escenario = new Escenario();
		LinkedList<Entrenador> entrenadores = escenario.getEntrenadores();

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Elige entrenador");
		System.out.println("1. Red 2. Green 3. Blue");
		int entrenador = Integer.parseInt(br.readLine()) - 1;

		Entrenador jugador = entrenadores.get(entrenador);
		entrenadores.remove(entrenador);
		Entrenador rival = entrenadores.get((int) (Math.random() * entrenadores
				.size()));

		escenario.batalla(jugador, rival);
	}
}
