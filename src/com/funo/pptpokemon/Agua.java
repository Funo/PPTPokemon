package com.funo.pptpokemon;

public class Agua extends Pokemon {

	public Agua(String nombre, int image) {
		super(nombre, image);
	}

	public boolean luchar(Pokemon pokemon) {
		if (debilitado()) {
			return false;
		}
		if (pokemon instanceof Agua) {
			danar();
			pokemon.danar();
		} else if (pokemon instanceof Fuego) {
			pokemon.efectivo();
		} else {
			efectivo();
		}
		return true;
	}
	
}
