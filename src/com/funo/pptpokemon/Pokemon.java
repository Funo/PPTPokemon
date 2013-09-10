package com.funo.pptpokemon;

public abstract class Pokemon {
	private String nombre;
	private int ps;
	private int image;

	public Pokemon(String nombre, int image) {
		this.nombre = nombre;
		this.image  = image;
		ps = 3;
	}

	public void danar() {
		ps--;
	}

	public void efectivo() {
		ps = ps - 2;
	}

	public boolean debilitado() {
		if (ps <= 0)
			return true;
		return false;
	}
	
	public void curar(){
		ps = 3;
	}
	public static void centroPokemon(){
		
		Bulbasaur.curar();
		Charmander.curar();
		Squirtle.curar();
		Chikorita.curar();
		Cyndaquil.curar();
		Totodile.curar();
		Treecko.curar();
		Torchic.curar();
		Mudkip.curar();
		
	}

	public String getNombre() {
		return nombre;
	}

	public int getPs() {
		return ps;
	}

	
	public int getImage() {
		return image;
	}
	
	public abstract boolean luchar(Pokemon pokemon);
	

	public static final Planta Bulbasaur = new Planta("Bulbasaur", R.drawable.bulbasaur);
	public static final Planta Chikorita = new Planta("Chikorita", R.drawable.chikorita);
	public static final Planta Treecko = new Planta("Treecko", R.drawable.treecko);
	public static final Fuego Charmander = new Fuego("Charmander", R.drawable.charmander);
	public static final Fuego Cyndaquil = new Fuego("Cyndaquil", R.drawable.cyndaquil);
	public static final Fuego Torchic = new Fuego("Torchic",R.drawable.torchic);
	public static final Agua Squirtle = new Agua("Squirtle", R.drawable.squirtle);
	public static final Agua Totodile = new Agua("Totodile", R.drawable.totodile);
	public static final Agua Mudkip = new Agua("Mudkip", R.drawable.mudkip);
	


}
