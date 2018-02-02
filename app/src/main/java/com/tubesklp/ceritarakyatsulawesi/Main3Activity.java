package com.tubesklp.ceritarakyatsulawesi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    ImageButton imageButton,imageButton1;
    Button story1,story2, story3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        imageButton = (ImageButton)  findViewById(R.id.ib_a3_2);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        imageButton1 = (ImageButton) findViewById(R.id.ib_a3_1);
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Main2Activity.class));
                finish();
            }
        });
        story1 = (Button)  findViewById(R.id.story1);
        story1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Main4Activity.class));
                finish();
            }
        });
        story2 = (Button) findViewById(R.id.story2);
        story2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Main5Activity.class));
                finish();
            }
        });

        story3 = (Button) findViewById(R.id.story3);
       story3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(getApplicationContext(), Main6Activity.class));
               finish();
           }
       });

    }
}