package com.example.tester;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Intent in = new Intent(Welcome.this,MainActivity.class);
                startActivity(in);
                finish();
            }
        },1000);
    }
}
