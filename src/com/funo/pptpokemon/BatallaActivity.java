package com.funo.pptpokemon;

import com.funo.pptpokemon.R;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

public class BatallaActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
	    WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_batalla);
		
		Pokemon pokemon = new Pokemon("hola", R.drawable.ic_launcher) {
			
			@Override
			public boolean luchar(Pokemon pokemon) {
				
				return false;
			}
		};
		
		Toast.makeText(this, "Hola funito chan", Toast.LENGTH_SHORT).show();
		
		int id = getIntent().getIntExtra("pokemon", 0);
		
		
/*		switch (id) {
		case R.equipo.red:
		case ....
		}*/
		
		ImageView enemigo = (ImageView) findViewById(R.batalla.enemigo);
		
		
		enemigo.setImageResource(pokemon.getImage());

		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.batalla, menu);
		return true;
	}

}
