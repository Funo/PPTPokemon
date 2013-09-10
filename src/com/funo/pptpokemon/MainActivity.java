package com.funo.pptpokemon;

import com.funo.pptpokemon.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.*;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
	    WindowManager.LayoutParams.FLAG_FULLSCREEN);
	    
	    getWindow().setBackgroundDrawableResource(R.drawable.fondo);
	    
		setContentView(R.layout.activity_main);

	}

	
	public void empezar(View v) {
		Intent intent = new Intent(this, EquipoActivity.class);
		startActivity(intent);
	}
	

}
