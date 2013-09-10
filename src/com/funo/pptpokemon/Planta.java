package com.funo.pptpokemon;

public class Planta extends Pokemon {

	public Planta(String nombre, int image) {
		super(nombre, image);
	}

	public boolean luchar(Pokemon pokemon) {
		if (debilitado()) {
			return false;
		}
		if (pokemon instanceof Agua) {
			pokemon.efectivo();
		} else if (pokemon instanceof Fuego) {
			efectivo();
		} else {
			danar();
			pokemon.danar();
		}
		return true;
	}
	
	
	
}
