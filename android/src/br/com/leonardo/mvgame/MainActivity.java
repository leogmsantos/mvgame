package br.com.leonardo.mvgame;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView ivMiguel, ivVitoria;
    private MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeComponents();
    }

    private void initializeComponents(){
        ivMiguel = findViewById(R.id.ivMiguel);
        ivVitoria = findViewById(R.id.ivVitoria);

        play();
    }

    private void play(){
        ivMiguel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player = MediaPlayer.create(MainActivity.this,R.raw.miguel);
                player.start();
                Intent i = new Intent(MainActivity.this, AndroidLauncher.class);
                startActivity(i);
            }
        });

        ivVitoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player = MediaPlayer.create(MainActivity.this, R.raw.vitoria);
                player.start();
            }
        });
    }

}
