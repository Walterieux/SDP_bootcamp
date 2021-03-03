package com.example.bootcamp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String MAIN_NAME = "main_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.mainGoButton);
        button.setOnClickListener(v -> {
            String mainName = ((EditText)findViewById(R.id.mainName)).getText().toString();
            Intent intent = new Intent(this, GreetingActivity.class);
            intent.putExtra(MAIN_NAME, mainName);
            startActivity(intent);
        });
    }
}