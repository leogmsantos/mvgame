package br.com.leonardo.mvgame;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import br.com.leonardo.mvgame.SpaceShooterGame;

public class AndroidLauncher extends AndroidApplication {

	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		initialize(new SpaceShooterGame(), config);
	}
}
