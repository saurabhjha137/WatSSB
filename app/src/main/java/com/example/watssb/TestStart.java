package com.example.watssb;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;


public class TestStart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_start);
        final TextView mTextField = findViewById(R.id.textView2);
        final TextView textView2 = findViewById(R.id.textView1);
        new CountDownTimer(3000, 1000) {

            public void onTick(long millisUntilFinished) {
                mTextField.setText("" + millisUntilFinished / 1000);
            }

            public void onFinish() {
                mTextField.setText("Start! ");

                new CountDownTimer(2000, 1000) {

                    public void onTick(long millisUntilFinished) {

                    }

                    public void onFinish() {
                        mTextField.setText("");

                        /*AlertDialog.Builder builder = new AlertDialog.Builder(TestStart.this);
                        builder.setMessage("Lets Start...")
                                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        Intent a = new Intent(TestStart.this, WatTest.class);
                                        TestStart.this.startActivity(a);
                                    }

                                });
                        builder.show();*/

                        Intent a = new Intent(TestStart.this, TatTest.class);
                        TestStart.this.startActivity(a);

                    }
                }.start();

            }
        }.start();

    }
}
