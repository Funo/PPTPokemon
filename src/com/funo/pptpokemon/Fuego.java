package com.funo.pptpokemon;

public class Fuego extends Pokemon {

	public Fuego(String nombre, int image) {
		super(nombre, image);
	}

	public boolean luchar(Pokemon pokemon) {
		if (debilitado()) {
			return false;
		}
		if (pokemon instanceof Agua) {
			efectivo();
		} else if (pokemon instanceof Fuego) {
			danar();
			pokemon.danar();
		} else {
			pokemon.efectivo();
		}
		return true;
	}
	
	
	

}
