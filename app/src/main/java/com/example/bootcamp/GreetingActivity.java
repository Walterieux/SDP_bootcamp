package com.example.bootcamp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GreetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.MAIN_NAME);

        TextView txtView = findViewById(R.id.greetingMessage);
        txtView.setText("Hello!, " + name);
    }
}