package com.example.youactiguess;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Game extends AppCompatActivity {
    private SoundPool sp;
    private int music;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button skip = findViewById(R.id.skip);
        Button pass = findViewById(R.id.pass);
        Button rule = findViewById(R.id.rule);
        Button end = findViewById(R.id.end);
        final TextView word = findViewById(R.id.word);
        sp = new SoundPool(10, AudioManager.STREAM_SYSTEM, 5);
        music = sp.load(this, R.raw.music, 1);
        skip.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                DataBase data = new DataBase();
                word.setText(data.getInfo());
            }
        });
        pass.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                DataBase data = new DataBase();
                word.setText(data.getInfo());
                sp.play(music,1, 1, 0, 0, 1);
            }
        });
        end.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Game.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
