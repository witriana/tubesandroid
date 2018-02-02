package com.tubesklp.ceritarakyatsulawesi;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Main27Activity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    ImageButton imageButton, imageButton1, imageButton2;
    Boolean mulai= false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main27);

        mediaPlayer = MediaPlayer.create(this,R.raw.nadaa3);
        imageButton = (ImageButton) findViewById(R.id.play);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mulai){
                    mediaPlayer.start();
                    mulai = true;
                }
                else {
                    mediaPlayer.pause();
                    mulai = false;
                }
            }
        });

        imageButton1 = (ImageButton) findViewById(R.id.ib_a3_2);
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.stop();
                finish();
            }
        });

        imageButton2 = (ImageButton) findViewById(R.id.ib_a3_1);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.stop();
                startActivity(new Intent(getApplicationContext(),Main24Activity.class));
                finish();
            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        mediaPlayer.pause();
    }
}
