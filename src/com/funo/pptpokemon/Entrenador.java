package com.funo.pptpokemon;

import java.util.LinkedList;

public class Entrenador {
	private String nombre;
	private LinkedList<Pokemon> equipo;

	public Entrenador(String nombre, Agua agua, Fuego fuego, Planta planta, int image) {
		this.nombre = nombre;
		equipo = new LinkedList<Pokemon>();
		equipo.add(agua);
		equipo.add(fuego);
		equipo.add(planta);
	}

	public boolean sigue() {
		if (equipo.get(0).debilitado() && equipo.get(1).debilitado()
				&& equipo.get(2).debilitado())
			return false;
		return true;
	}

	public Pokemon enviar() {

		LinkedList<Pokemon> aux = new LinkedList<Pokemon>();
		for (Pokemon pokemon : equipo) {
			if (!pokemon.debilitado())
				aux.add(pokemon);
		}
		return aux.get((int) (Math.random() * aux.size()));
	}

	public String toString() {
		String aux;
		aux = nombre + "\n";
		for (Pokemon pokemon : equipo) {
			aux += pokemon.getNombre();
			if (pokemon.debilitado()) {
				aux += " Debilitado \n";
			} else {
				aux += pokemon.getPs() + " PS \n";
			}

		}
		return aux;
	}

	public LinkedList<Pokemon> getEquipo() {
		return equipo;
	}

}
