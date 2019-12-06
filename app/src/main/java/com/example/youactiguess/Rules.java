package com.example.youactiguess;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Rules extends MainActivity {
    private String b;
    protected void onCreate(Bundle a) {
        super.onCreate(a);
        setContentView(R.layout.rules);
        Button quit = findViewById(R.id.quit);
        final TextView rule = findViewById(R.id.rule);
        b = "The game players can be 2 or more than 2 people. Players should be divided into two groups: words actors and words guessers." +
                "During the game, only words actor are allowed to watch the screen.\n" +
                "\n" +
                "When the game begins, the words actors would see the word and act the words by body language. But words actors are not allowed to talk. The word guessers feel free to guess the word and speak it out. When they guess the words out, the actor would click pass button and then act the next word.\n" +
                "However, if the word is too difficult, the actors are able to give up and click the skip button. Next word would show up as well.\n" +
                "\n" +
                "The goal of the game is to promote the relationship between players. It would definitely help players know each other more. Enjoy!";
        rule.setText(b);
        quit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent in = new Intent(Rules.this, MainActivity.class);
                startActivity(in);
            }
        });
    }
}
