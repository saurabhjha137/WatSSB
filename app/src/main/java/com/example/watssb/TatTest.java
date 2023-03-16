package com.example.watssb;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.ImageView;

import java.util.Random;

public class TatTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tat_test);

        final ImageView imageView = findViewById(R.id.imageView);
        final MediaPlayer mediaPlayer = MediaPlayer.create( this ,R.raw.when);
        mediaPlayer.start(); /* no need to call prepare(); create() does that for you */
        final int pic[] = new int[6];
        pic[0] = R.drawable.img1;
        pic[1]= R.drawable.img2;
        pic[2]= R.drawable.img3;
        pic[3]= R.drawable.img4;
        pic[4]= R.drawable.img5;
        pic[5]= R.drawable.img6;

        new CountDownTimer(15000, 5000) {
               Random r = new Random();

                public void onTick(long millisUntilFinished) {
                    mediaPlayer.start();
                    int j= r.nextInt(pic.length);
                    imageView.setImageDrawable(getDrawable(pic[j]));

                }
                public void onFinish() {
                    AlertDialog.Builder builder = new AlertDialog.Builder(TatTest.this);
                    builder.setMessage("Tat Over !! Continue...")
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    Intent a = new Intent(TatTest.this, Wat.class);
                                    TatTest.this.startActivity(a);
                                }
                            });
                    builder.show();
                }
            }.start();
    }
}
