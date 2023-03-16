package com.example.watssb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

import java.util.Random;

public class WatTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wat_test);
        final TextView textView = findViewById(R.id.textView);
        final MediaPlayer mediaPlayer = MediaPlayer.create( this ,R.raw.when);
        new CountDownTimer(12000, 4000) {

            String[] myArrayOfStrings = {"Society", "Character", "Impossible","Afraid","Unfit","Happy","Command","Success","Aggression" };
            Random r = new Random();

            public void onTick(long millisUntilFinished) {
                mediaPlayer.start();
                int  myRandString = (r.nextInt(myArrayOfStrings.length ));
                textView.setText( myArrayOfStrings[myRandString] );
            }

            public void onFinish() {
                textView.setTextColor(Color.RED);
                mediaPlayer.start();
                textView.setText("Test Over.. ThankYou!!");


            }
        }.start();

    }
}
